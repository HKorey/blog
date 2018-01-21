package com.hquery.blog.mapper;

import com.hquery.blog.app.model.MetasDO;
import com.hquery.blog.app.model.MetasDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MetasMapper {
    long countByExample(MetasDOExample example);

    int deleteByExample(MetasDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MetasDO record);

    int insertSelective(MetasDO record);

    List<MetasDO> selectByExample(MetasDOExample example);

    MetasDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MetasDO record, @Param("example") MetasDOExample example);

    int updateByExample(@Param("record") MetasDO record, @Param("example") MetasDOExample example);

    int updateByPrimaryKeySelective(MetasDO record);

    int updateByPrimaryKey(MetasDO record);

    /**
     * queryByType
     * @param type
     * @return
     */
    List<MetasDO> queryByType(@Param("type") String type);
}