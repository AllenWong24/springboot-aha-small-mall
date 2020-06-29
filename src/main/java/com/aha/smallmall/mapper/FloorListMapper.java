package com.aha.smallmall.mapper;

import com.aha.smallmall.pojo.FloorList;
import com.aha.smallmall.pojo.FloorListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FloorListMapper {
    long countByExample(FloorListExample example);

    int deleteByExample(FloorListExample example);

    int deleteByPrimaryKey(String flId);

    int insert(FloorList record);

    int insertSelective(FloorList record);

    List<FloorList> selectByExample(FloorListExample example);

    FloorList selectByPrimaryKey(String flId);

    int updateByExampleSelective(@Param("record") FloorList record, @Param("example") FloorListExample example);

    int updateByExample(@Param("record") FloorList record, @Param("example") FloorListExample example);

    int updateByPrimaryKeySelective(FloorList record);

    int updateByPrimaryKey(FloorList record);
}