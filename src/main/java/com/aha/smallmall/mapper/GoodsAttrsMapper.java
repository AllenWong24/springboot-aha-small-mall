package com.aha.smallmall.mapper;

import com.aha.smallmall.pojo.GoodsAttrs;
import com.aha.smallmall.pojo.GoodsAttrsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsAttrsMapper {
    long countByExample(GoodsAttrsExample example);

    int deleteByExample(GoodsAttrsExample example);

    int deleteByPrimaryKey(String attrId);

    int insert(GoodsAttrs record);

    int insertSelective(GoodsAttrs record);

    List<GoodsAttrs> selectByExample(GoodsAttrsExample example);

    GoodsAttrs selectByPrimaryKey(String attrId);

    int updateByExampleSelective(@Param("record") GoodsAttrs record, @Param("example") GoodsAttrsExample example);

    int updateByExample(@Param("record") GoodsAttrs record, @Param("example") GoodsAttrsExample example);

    int updateByPrimaryKeySelective(GoodsAttrs record);

    int updateByPrimaryKey(GoodsAttrs record);
}