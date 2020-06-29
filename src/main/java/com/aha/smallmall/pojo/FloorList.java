package com.aha.smallmall.pojo;

import java.util.Date;

public class FloorList {
    private String flId;

    private Date createTime;

    private Date updateTime;

    private String imageSrc;

    private String imageWidth;

    private String flName;

    private String ftQuery;

    private String ftId;

    public String getFlId() {
        return flId;
    }

    public void setFlId(String flId) {
        this.flId = flId == null ? null : flId.trim();
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

    public String getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(String imageWidth) {
        this.imageWidth = imageWidth == null ? null : imageWidth.trim();
    }

    public String getFlName() {
        return flName;
    }

    public void setFlName(String flName) {
        this.flName = flName == null ? null : flName.trim();
    }

    public String getFtQuery() {
        return ftQuery;
    }

    public void setFtQuery(String ftQuery) {
        this.ftQuery = ftQuery == null ? null : ftQuery.trim();
    }

    public String getFtId() {
        return ftId;
    }

    public void setFtId(String ftId) {
        this.ftId = ftId == null ? null : ftId.trim();
    }
}