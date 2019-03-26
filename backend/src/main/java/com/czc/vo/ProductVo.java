package com.czc.vo;

import lombok.Data;

/**
 * Created by Even(陈志成) on 2019/3/25
 */
@Data
public class ProductVo {

    private Long id;

    private String imageHost;

    private String mainImage;

    private String name;

    private String price;

    public ProductVo() {

    }

    public ProductVo(Long id, String imageHost, String mainImage, String name, String price) {
        this.id = id;
        this.imageHost = imageHost;
        this.mainImage = mainImage;
        this.name = name;
        this.price = price;
    }

}
