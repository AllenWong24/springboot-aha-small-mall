package com.aha.smallmall.mapper;

import com.aha.smallmall.pojo.OrdersGoods;
import com.aha.smallmall.pojo.OrdersGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersGoodsMapper {
    long countByExample(OrdersGoodsExample example);

    int deleteByExample(OrdersGoodsExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrdersGoods record);

    int insertSelective(OrdersGoods record);

    List<OrdersGoods> selectByExample(OrdersGoodsExample example);

    OrdersGoods selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrdersGoods record, @Param("example") OrdersGoodsExample example);

    int updateByExample(@Param("record") OrdersGoods record, @Param("example") OrdersGoodsExample example);

    int updateByPrimaryKeySelective(OrdersGoods record);

    int updateByPrimaryKey(OrdersGoods record);
}