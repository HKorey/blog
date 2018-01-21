package com.hquery.blog.app.service;

import com.hquery.blog.app.model.ContentDO;

import java.util.List;

/**
 * @author hquery.huang
 * 2018/1/21 22:27
 */
public interface ContentService {

    List<ContentDO> queryAll();

}
