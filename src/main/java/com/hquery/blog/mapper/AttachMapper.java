package com.hquery.blog.mapper;

import com.hquery.blog.app.model.AttachDO;
import com.hquery.blog.app.model.AttachDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttachMapper {
    long countByExample(AttachDOExample example);

    int deleteByExample(AttachDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AttachDO record);

    int insertSelective(AttachDO record);

    List<AttachDO> selectByExample(AttachDOExample example);

    AttachDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AttachDO record, @Param("example") AttachDOExample example);

    int updateByExample(@Param("record") AttachDO record, @Param("example") AttachDOExample example);

    int updateByPrimaryKeySelective(AttachDO record);

    int updateByPrimaryKey(AttachDO record);
}