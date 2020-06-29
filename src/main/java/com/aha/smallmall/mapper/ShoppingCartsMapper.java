package com.aha.smallmall.mapper;

import com.aha.smallmall.pojo.ShoppingCarts;
import com.aha.smallmall.pojo.ShoppingCartsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoppingCartsMapper {
    long countByExample(ShoppingCartsExample example);

    int deleteByExample(ShoppingCartsExample example);

    int deleteByPrimaryKey(String cartId);

    int insert(ShoppingCarts record);

    int insertSelective(ShoppingCarts record);

    List<ShoppingCarts> selectByExample(ShoppingCartsExample example);

    ShoppingCarts selectByPrimaryKey(String cartId);

    int updateByExampleSelective(@Param("record") ShoppingCarts record, @Param("example") ShoppingCartsExample example);

    int updateByExample(@Param("record") ShoppingCarts record, @Param("example") ShoppingCartsExample example);

    int updateByPrimaryKeySelective(ShoppingCarts record);

    int updateByPrimaryKey(ShoppingCarts record);
}