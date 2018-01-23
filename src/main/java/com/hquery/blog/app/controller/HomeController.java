package com.hquery.blog.app.controller;

import com.hquery.blog.app.enums.MetaType;
import com.hquery.blog.app.model.ContentDO;
import com.hquery.blog.app.model.MetasDO;
import com.hquery.blog.app.service.ContentService;
import com.hquery.blog.app.service.MetasService;
import com.hquery.blog.constant.Constants;
import com.hquery.blog.util.SystemUtils;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author hquery.huang
 * 2018/1/21 20:55
 */
@Controller
@RequestMapping("/pages")
public class HomeController extends BaseController {

    private static Logger logger = LoggerFactory.getLogger(HomeController.class);

    private static final String[] ICONS = {"bg-ico-book", "bg-ico-game", "bg-ico-note", "bg-ico-chat", "bg-ico-code", "bg-ico-image", "bg-ico-web", "bg-ico-link", "bg-ico-design", "bg-ico-lock"};

    @Resource
    private ContentService contentServiceImpl;

    @Resource
    private MetasService metasServiceImpl;

    @ResponseBody
    @RequestMapping("/test")
    public Map<String, String> test() {
        Map<String, String> map = new HashMap<>(2);
        map.put("ret", String.valueOf(new Random().nextInt()));
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/article/{id}", method = RequestMethod.GET)
    public String article(@PathVariable Long id, ModelMap map) {

        ContentDO content = contentServiceImpl.selectByPrimaryKey(id);

        if (content == null) {
            return Constants.PAGE_403;
        }

        if (Constants.FMT_TYPE_MARKDOWN.equals(content.getFmtType())) {
            String markdownToHtml = SystemUtils.markdownToHtml(content.getContent());
            logger.info("转换后的markdown语言---- : {}", markdownToHtml);
            content.setContent(markdownToHtml);
        }

        List<MetasDO> metasDOS = metasServiceImpl.queryByType(MetaType.CATEGORY.getName());

        String categoryString = convertToString(content.getCategories(), metasDOS);

        content.setCategories(categoryString);
        map.put("c", content);

        //标签需要单独取出来进行迭代
        List<String> tags = toTags(content.getTags());
        map.put("tags", tags);
        return render("detail");
    }

    /**
     * 首页
     *
     * @param map
     * @param req
     * @return
     */
    @RequestMapping("/index")
    public String index(ModelMap map, HttpServletRequest req) {

        List<ContentDO> contents = contentServiceImpl.queryAll();

        List<MetasDO> cs = metasServiceImpl.queryByType(MetaType.CATEGORY.getName());

        for (ContentDO c : contents) {
            String s = showCategories(req, c.getCategories());
            logger.info("转换后的分类字符串------ {}", s);
            c.setCategories(s);
            c.setThumbImg(genThumb(c));
        }

        map.put("totals", 0);
        map.put("page", 1);
        map.put("articles", contents);
        map.put("icons", ICONS);
        return render("index");
    }

    /**
     * 分类的转换显示
     *
     * @param categories
     */
    public String showCategories(HttpServletRequest req, String categories) {
        String basepath = req.getContextPath();
        if (StringUtils.isNotBlank(categories)) {
            String[] arr = categories.split(",");
            StringBuilder sb = new StringBuilder();
            for (String c : arr) {
                MetasDO metas = metasServiceImpl.selectByPrimaryKey(Long.valueOf(c));
                sb = sb.append("<a href=\"").append(basepath).append("/pages/category/").append(c).append("\">").append(metas.getName()).append("</a>");
            }
            return sb.toString();
        }
        return showCategories(req, "1");
    }

    /**
     * 生成展示图片
     */
    public String genThumb(ContentDO content) {
        String getfirst = SystemUtils.getFirstThumb(content.getContent());
        if (StringUtils.isEmpty(getfirst)) {
            int cid = Integer.parseInt(String.valueOf(content.getId()));
            int size = cid % 20;
            size = size == 0 ? 1 : size;
            return "/ui/pages/img/rand/" + size + ".jpg";
        } else {
            return getfirst;
        }
    }


    public String convertToString(String categories, List<MetasDO> cs) {
        if (StringUtils.isEmpty(categories)) {
            return "1";
        }
        String[] arry = categories.split(",");
        Map<String, String> maps = new HashMap<>(16);
        for (MetasDO m : cs) {
            maps.put(String.valueOf(m.getId()), m.getName());
        }
        StringBuilder sb = new StringBuilder();
        for (String s : arry) {
            sb.append(",").append(maps.get(s));
        }
        return sb.toString().substring(1);
    }

    public List<String> toTags(String tags) {
        if (StringUtils.isEmpty(tags)) {
            return null;
        }
        List<String> ts = new ArrayList<>();
        String[] arry = tags.split(",");
        return Arrays.asList(arry);
    }

}
