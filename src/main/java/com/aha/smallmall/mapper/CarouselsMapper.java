package com.aha.smallmall.mapper;

import com.aha.smallmall.pojo.Carousels;
import com.aha.smallmall.pojo.CarouselsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarouselsMapper {
    long countByExample(CarouselsExample example);

    int deleteByExample(CarouselsExample example);

    int deleteByPrimaryKey(String caroId);

    int insert(Carousels record);

    int insertSelective(Carousels record);

    List<Carousels> selectByExample(CarouselsExample example);

    Carousels selectByPrimaryKey(String caroId);

    int updateByExampleSelective(@Param("record") Carousels record, @Param("example") CarouselsExample example);

    int updateByExample(@Param("record") Carousels record, @Param("example") CarouselsExample example);

    int updateByPrimaryKeySelective(Carousels record);

    int updateByPrimaryKey(Carousels record);
}