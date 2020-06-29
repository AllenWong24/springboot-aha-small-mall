package com.aha.smallmall.mapper;

import com.aha.smallmall.pojo.Collections;
import com.aha.smallmall.pojo.CollectionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectionsMapper {
    long countByExample(CollectionsExample example);

    int deleteByExample(CollectionsExample example);

    int deleteByPrimaryKey(String collId);

    int insert(Collections record);

    int insertSelective(Collections record);

    List<Collections> selectByExample(CollectionsExample example);

    Collections selectByPrimaryKey(String collId);

    int updateByExampleSelective(@Param("record") Collections record, @Param("example") CollectionsExample example);

    int updateByExample(@Param("record") Collections record, @Param("example") CollectionsExample example);

    int updateByPrimaryKeySelective(Collections record);

    int updateByPrimaryKey(Collections record);
}