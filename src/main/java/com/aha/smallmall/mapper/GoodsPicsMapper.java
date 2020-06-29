package com.aha.smallmall.mapper;

import com.aha.smallmall.pojo.GoodsPics;
import com.aha.smallmall.pojo.GoodsPicsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsPicsMapper {
    long countByExample(GoodsPicsExample example);

    int deleteByExample(GoodsPicsExample example);

    int deleteByPrimaryKey(String picsId);

    int insert(GoodsPics record);

    int insertSelective(GoodsPics record);

    List<GoodsPics> selectByExample(GoodsPicsExample example);

    GoodsPics selectByPrimaryKey(String picsId);

    int updateByExampleSelective(@Param("record") GoodsPics record, @Param("example") GoodsPicsExample example);

    int updateByExample(@Param("record") GoodsPics record, @Param("example") GoodsPicsExample example);

    int updateByPrimaryKeySelective(GoodsPics record);

    int updateByPrimaryKey(GoodsPics record);
}