package com.hquery.blog.app.service;

import com.hquery.blog.app.model.MetasDO;

import java.util.List;

/**
 * @author hquery.huang
 * 2018/1/21 22:33
 */
public interface MetasService {

    /**
     * queryByType
     * @param type
     * @return
     */
    List<MetasDO> queryByType(String type);

    /**
     * selectByPrimaryKey
     * @param id
     * @return
     */
    MetasDO selectByPrimaryKey(Long id);
}
