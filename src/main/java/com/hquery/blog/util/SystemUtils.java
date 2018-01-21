package com.hquery.blog.util;

import org.apache.commons.lang3.StringUtils;
import org.commonmark.Extension;
import org.commonmark.ext.gfm.tables.TablesExtension;
import org.commonmark.node.Node;
import org.commonmark.parser.*;
import org.commonmark.renderer.html.HtmlRenderer;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author hquery.huang
 * 2018/1/21 22:42
 */
public class SystemUtils {

    /**
     * 获取内容中第一张图
     *
     * @param content
     * @return
     */
    public static String getFirstThumb(String content) {
        content = markdownToHtml(content);
        if (content.contains("<img")) {
            String img = "";
            String regEx_img = "<img.*src\\s*=\\s*(.*?)[^>]*?>";
            Pattern p_image = Pattern.compile(regEx_img, Pattern.CASE_INSENSITIVE);
            Matcher m_image = p_image.matcher(content);
            if (m_image.find()) {
                img = img + "," + m_image.group();
                // //匹配src
                Matcher m = Pattern.compile("src\\s*=\\s*\'?\"?(.*?)(\'|\"|>|\\s+)").matcher(img);
                if (m.find()) {
                    return m.group(1);
                }
            }
        }
        return "";
    }

    public static String markdownToHtml(String markdown) {
        if (StringUtils.isEmpty(markdown)) {
            return "";
        }
        markdown = markdown.replace("<!--more-->", "\r\n");

        List<Extension> extensions = Arrays.asList(TablesExtension.create());
        Parser parser = Parser.builder().extensions(extensions).build();
        Node document = parser.parse(markdown);
        HtmlRenderer renderer = HtmlRenderer.builder().extensions(extensions).build();
        String content = renderer.render(document);

        // 支持网易云音乐输出
        if (content.contains("[mp3:")) {
            content = content.replaceAll("\\[mp3:(\\d+)\\]", "<iframe frameborder=\"no\" border=\"0\" marginwidth=\"0\" marginheight=\"0\" width=350 height=106 src=\"//music.163.com/outchain/player?type=2&id=$1&auto=0&height=88\"></iframe>");
        }
        // 支持gist代码输出
        if (content.contains("https://gist.github.com/")) {
            content = content.replaceAll("&lt;script src=\"https://gist.github.com/(\\w+)/(\\w+)\\.js\">&lt;/script>", "<script src=\"https://gist.github.com/$1/$2\\.js\"></script>");
        }
        return content;
    }

}
