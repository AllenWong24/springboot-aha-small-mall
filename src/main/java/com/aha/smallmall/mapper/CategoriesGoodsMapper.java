package com.aha.smallmall.mapper;

import com.aha.smallmall.pojo.CategoriesGoods;
import com.aha.smallmall.pojo.CategoriesGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoriesGoodsMapper {
    long countByExample(CategoriesGoodsExample example);

    int deleteByExample(CategoriesGoodsExample example);

    int deleteByPrimaryKey(String id);

    int insert(CategoriesGoods record);

    int insertSelective(CategoriesGoods record);

    List<CategoriesGoods> selectByExample(CategoriesGoodsExample example);

    CategoriesGoods selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CategoriesGoods record, @Param("example") CategoriesGoodsExample example);

    int updateByExample(@Param("record") CategoriesGoods record, @Param("example") CategoriesGoodsExample example);

    int updateByPrimaryKeySelective(CategoriesGoods record);

    int updateByPrimaryKey(CategoriesGoods record);
}