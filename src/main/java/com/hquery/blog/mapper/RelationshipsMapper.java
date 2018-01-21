package com.hquery.blog.mapper;

import com.hquery.blog.app.model.RelationshipsDO;
import com.hquery.blog.app.model.RelationshipsDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationshipsMapper {
    long countByExample(RelationshipsDOExample example);

    int deleteByExample(RelationshipsDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RelationshipsDO record);

    int insertSelective(RelationshipsDO record);

    List<RelationshipsDO> selectByExample(RelationshipsDOExample example);

    RelationshipsDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RelationshipsDO record, @Param("example") RelationshipsDOExample example);

    int updateByExample(@Param("record") RelationshipsDO record, @Param("example") RelationshipsDOExample example);

    int updateByPrimaryKeySelective(RelationshipsDO record);

    int updateByPrimaryKey(RelationshipsDO record);
}