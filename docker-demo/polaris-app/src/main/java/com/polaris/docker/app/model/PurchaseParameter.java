package com.polaris.docker.app.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "PurchaseParameter", description = "parameter for purchase request")
public class PurchaseParameter implements Serializable {
    private static final long serialVersionUID = -7961100328981674043L;

    @ApiModelProperty(value = "user id", required = true, example = "1234")
    private String userId;
    @ApiModelProperty(value = "product to purchase", required = true, example = "Huawei Mate 30 Pro")
    private String product;
    @ApiModelProperty(value = "quantity to purchase", required = true, example = "2")
    private Integer quantity;
    @ApiModelProperty(value = "price in total", required = true, example = "9999")
    private Double price;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
