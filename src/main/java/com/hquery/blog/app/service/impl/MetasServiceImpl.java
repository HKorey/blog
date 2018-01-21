package com.hquery.blog.app.service.impl;

import com.hquery.blog.mapper.MetasMapper;
import com.hquery.blog.app.model.MetasDO;
import com.hquery.blog.app.service.MetasService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hquery.huang
 * 2018/1/21 22:33
 */
@Service
public class MetasServiceImpl implements MetasService {

    @Resource
    private MetasMapper metasMapper;

    @Override
    public List<MetasDO> queryByType(String type) {
        return metasMapper.queryByType(type);
    }

    @Override
    public MetasDO findOne(Long aLong) {
        return null;
    }
}
