package com.hquery.blog.app.service;

import com.hquery.blog.app.model.ContentDO;

import java.util.List;

/**
 * @author hquery.huang
 * 2018/1/21 22:27
 */
public interface ContentService {

    /**
     * 查出所有Content
     * @return
     */
    List<ContentDO> queryAll();

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    ContentDO selectByPrimaryKey(Long id);
}
