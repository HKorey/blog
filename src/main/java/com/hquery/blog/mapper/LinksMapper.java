package com.hquery.blog.mapper;

import com.hquery.blog.app.model.LinksDO;
import com.hquery.blog.app.model.LinksDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LinksMapper {
    long countByExample(LinksDOExample example);

    int deleteByExample(LinksDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LinksDO record);

    int insertSelective(LinksDO record);

    List<LinksDO> selectByExample(LinksDOExample example);

    LinksDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LinksDO record, @Param("example") LinksDOExample example);

    int updateByExample(@Param("record") LinksDO record, @Param("example") LinksDOExample example);

    int updateByPrimaryKeySelective(LinksDO record);

    int updateByPrimaryKey(LinksDO record);
}