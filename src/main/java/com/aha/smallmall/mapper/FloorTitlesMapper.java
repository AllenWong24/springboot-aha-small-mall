package com.aha.smallmall.mapper;

import com.aha.smallmall.pojo.FloorTitles;
import com.aha.smallmall.pojo.FloorTitlesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FloorTitlesMapper {
    long countByExample(FloorTitlesExample example);

    int deleteByExample(FloorTitlesExample example);

    int deleteByPrimaryKey(String ftId);

    int insert(FloorTitles record);

    int insertSelective(FloorTitles record);

    List<FloorTitles> selectByExample(FloorTitlesExample example);

    FloorTitles selectByPrimaryKey(String ftId);

    int updateByExampleSelective(@Param("record") FloorTitles record, @Param("example") FloorTitlesExample example);

    int updateByExample(@Param("record") FloorTitles record, @Param("example") FloorTitlesExample example);

    int updateByPrimaryKeySelective(FloorTitles record);

    int updateByPrimaryKey(FloorTitles record);
}