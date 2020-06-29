package com.aha.smallmall.mapper;

import com.aha.smallmall.pojo.Navigations;
import com.aha.smallmall.pojo.NavigationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NavigationsMapper {
    long countByExample(NavigationsExample example);

    int deleteByExample(NavigationsExample example);

    int deleteByPrimaryKey(String navId);

    int insert(Navigations record);

    int insertSelective(Navigations record);

    List<Navigations> selectByExample(NavigationsExample example);

    Navigations selectByPrimaryKey(String navId);

    int updateByExampleSelective(@Param("record") Navigations record, @Param("example") NavigationsExample example);

    int updateByExample(@Param("record") Navigations record, @Param("example") NavigationsExample example);

    int updateByPrimaryKeySelective(Navigations record);

    int updateByPrimaryKey(Navigations record);
}