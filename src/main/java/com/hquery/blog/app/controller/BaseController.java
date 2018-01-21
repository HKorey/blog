package com.hquery.blog.app.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;

/**
 * @author hquery.huang
 * 2018/1/21 20:55
 */
public abstract class BaseController {

    public static String THEME = "pages";

    public String render(String viewName) {
        return THEME + "/" + viewName;
    }

    public BaseController title(HttpServletRequest request, String title) {
        request.setAttribute("title", title);
        return this;
    }

    public BaseController keywords(HttpServletRequest request, String keywords) {
        request.setAttribute("keywords", keywords);
        return this;
    }

}
