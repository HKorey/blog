package com.hquery.blog.app.controller;

import com.hquery.blog.app.enums.MetaType;
import com.hquery.blog.app.model.ContentDO;
import com.hquery.blog.app.model.MetasDO;
import com.hquery.blog.app.service.ContentService;
import com.hquery.blog.app.service.MetasService;
import com.hquery.blog.util.SystemUtils;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

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
            logger.info("转换后的分类字符串------" + s);
            c.setCategories(s);
            c.setThumbImg(gen_thumb(c));
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
            StringBuffer sbuf = new StringBuffer();
            for (String c : arr) {
                MetasDO m = metasServiceImpl.findOne(Long.valueOf(c));
                sbuf.append("<a href=\"" + basepath + "/pages/category/" + c + "\">" + m.getName() + "</a>");
            }
            return sbuf.toString();
        }
        return showCategories(req, "1");
    }

    /**
     * 生成展示图片
     */
    public String gen_thumb(ContentDO content) {
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

}
