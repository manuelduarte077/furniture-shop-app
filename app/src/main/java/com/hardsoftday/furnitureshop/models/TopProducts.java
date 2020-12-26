package com.hardsoftday.furnitureshop.models;

public class TopProducts {

    String productsId;
    String productsName;
    String productsPrice;
    Integer imageUrl;

    public TopProducts(String productsId, String productsName, String productsPrice, Integer imageUrl) {
        this.productsId = productsId;
        this.productsName = productsName;
        this.productsPrice = productsPrice;
        this.imageUrl = imageUrl;
    }

    public String getProductsId() {
        return productsId;
    }

    public void setProductsId(String productsId) {
        this.productsId = productsId;
    }

    public String getProductsName() {
        return productsName;
    }

    public void setProductsName(String productsName) {
        this.productsName = productsName;
    }

    public String getProductsPrice() {
        return productsPrice;
    }

    public void setProductsPrice(String productsPrice) {
        this.productsPrice = productsPrice;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}
