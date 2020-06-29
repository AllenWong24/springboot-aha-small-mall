package com.aha.smallmall.pojo;

import java.util.Date;

public class Categories {
    private String catId;

    private Date createTime;

    private Date updateTime;

    private Boolean isDeleted;

    private String catName;

    private String catPid;

    private Integer catLevel;

    private String catKey;

    private String catIcon;

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId == null ? null : catId.trim();
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

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName == null ? null : catName.trim();
    }

    public String getCatPid() {
        return catPid;
    }

    public void setCatPid(String catPid) {
        this.catPid = catPid == null ? null : catPid.trim();
    }

    public Integer getCatLevel() {
        return catLevel;
    }

    public void setCatLevel(Integer catLevel) {
        this.catLevel = catLevel;
    }

    public String getCatKey() {
        return catKey;
    }

    public void setCatKey(String catKey) {
        this.catKey = catKey == null ? null : catKey.trim();
    }

    public String getCatIcon() {
        return catIcon;
    }

    public void setCatIcon(String catIcon) {
        this.catIcon = catIcon == null ? null : catIcon.trim();
    }
}