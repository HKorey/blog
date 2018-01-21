package com.hquery.blog.mapper;

import com.hquery.blog.app.model.ContentDO;
import com.hquery.blog.app.model.ContentDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author hquery.huang
 */
public interface ContentMapper {
    long countByExample(ContentDOExample example);

    int deleteByExample(ContentDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ContentDO record);

    int insertSelective(ContentDO record);

    List<ContentDO> selectByExample(ContentDOExample example);

    ContentDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ContentDO record, @Param("example") ContentDOExample example);

    int updateByExample(@Param("record") ContentDO record, @Param("example") ContentDOExample example);

    int updateByPrimaryKeySelective(ContentDO record);

    int updateByPrimaryKey(ContentDO record);
}