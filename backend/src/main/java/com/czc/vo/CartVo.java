package com.czc.vo;

import lombok.Data;

/**
 * Created by Even(陈志成) on 2019/3/26
 */
@Data
public class CartVo {

    private Long productId;

    private Boolean productChecked;

    private String imageHost;

    private String productMainImage;

    private String productName;

    private String productPrice;

    private String productTotalPrice;

    private Integer quantity;

    private Integer productStock;

}
