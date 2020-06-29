package com.aha.smallmall.pojo;

import java.util.Date;

public class GoodsPics {
    private String picsId;

    private String goodsId;

    private Date createTime;

    private Date updateTime;

    private String picsBig;

    private String picsMid;

    private String picsSma;

    public String getPicsId() {
        return picsId;
    }

    public void setPicsId(String picsId) {
        this.picsId = picsId == null ? null : picsId.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
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

    public String getPicsBig() {
        return picsBig;
    }

    public void setPicsBig(String picsBig) {
        this.picsBig = picsBig == null ? null : picsBig.trim();
    }

    public String getPicsMid() {
        return picsMid;
    }

    public void setPicsMid(String picsMid) {
        this.picsMid = picsMid == null ? null : picsMid.trim();
    }

    public String getPicsSma() {
        return picsSma;
    }

    public void setPicsSma(String picsSma) {
        this.picsSma = picsSma == null ? null : picsSma.trim();
    }
}