package com.aha.smallmall.pojo;

import java.util.Date;

public class Orders {
    private String orderId;

    private Date createTime;

    private Date updateTime;

    private Boolean isDeleted;

    private String userId;

    private String orderAddress;

    private Boolean orderPayStatus;

    private String orderPayMethod;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress == null ? null : orderAddress.trim();
    }

    public Boolean getOrderPayStatus() {
        return orderPayStatus;
    }

    public void setOrderPayStatus(Boolean orderPayStatus) {
        this.orderPayStatus = orderPayStatus;
    }

    public String getOrderPayMethod() {
        return orderPayMethod;
    }

    public void setOrderPayMethod(String orderPayMethod) {
        this.orderPayMethod = orderPayMethod == null ? null : orderPayMethod.trim();
    }
}