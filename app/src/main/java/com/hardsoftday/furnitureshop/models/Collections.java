package com.hardsoftday.furnitureshop.models;

public class Collections {

    String collectionsId;
    String collectionsName;
    String collectionsDesc;
    String collectionsPrice;
    Integer collectionsImg;


    public Collections(String collectionsId, String collectionsName, String collectionsDesc, String collectionsPrice, Integer collectionsImg) {
        this.collectionsId = collectionsId;
        this.collectionsName = collectionsName;
        this.collectionsDesc = collectionsDesc;
        this.collectionsPrice = collectionsPrice;
        this.collectionsImg = collectionsImg;
    }

    public String getCollectionsId() {
        return collectionsId;
    }

    public void setCollectionsId(String collectionsId) {
        this.collectionsId = collectionsId;
    }

    public String getCollectionsName() {
        return collectionsName;
    }

    public void setCollectionsName(String collectionsName) {
        this.collectionsName = collectionsName;
    }

    public String getCollectionsDesc() {
        return collectionsDesc;
    }

    public void setCollectionsDesc(String collectionsDesc) {
        this.collectionsDesc = collectionsDesc;
    }

    public String getCollectionsPrice() {
        return collectionsPrice;
    }

    public void setCollectionsPrice(String collectionsPrice) {
        this.collectionsPrice = collectionsPrice;
    }

    public Integer getCollectionsImg() {
        return collectionsImg;
    }

    public void setCollectionsImg(Integer collectionsImg) {
        this.collectionsImg = collectionsImg;
    }
}