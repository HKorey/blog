package com.hquery.blog.app.service.impl;

import com.hquery.blog.mapper.ContentMapper;
import com.hquery.blog.app.model.ContentDO;
import com.hquery.blog.app.model.ContentDOExample;
import com.hquery.blog.app.service.ContentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hquery.huang
 * 2018/1/21 22:27
 */
@Service
public class ContentServiceImpl implements ContentService {

    @Resource
    private ContentMapper contentMapper;

    @Override
    public List<ContentDO> queryAll() {
        ContentDOExample example = new ContentDOExample();
        return contentMapper.selectByExample(example);
    }

    @Override
    public ContentDO selectByPrimaryKey(Long id) {
        return contentMapper.selectByPrimaryKey(id);
    }
}
