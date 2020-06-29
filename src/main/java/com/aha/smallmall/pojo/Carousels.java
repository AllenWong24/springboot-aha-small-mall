package com.aha.smallmall.pojo;

import java.util.Date;

public class Carousels {
    private String caroId;

    private Date createTime;

    private Date updateTime;

    private String imageSrc;

    private String goodsId;

    public String getCaroId() {
        return caroId;
    }

    public void setCaroId(String caroId) {
        this.caroId = caroId == null ? null : caroId.trim();
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

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc == null ? null : imageSrc.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }
}