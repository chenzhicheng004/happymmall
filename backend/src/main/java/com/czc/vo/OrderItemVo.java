package com.czc.vo;

import lombok.Data;

/**
 * Created by Even(陈志成) on 2019/3/29
 */
@Data
public class OrderItemVo {

    private Long productId;

    private String imageHost;

    private String productImage;

    private String productName;

    private String currentUnitPrice;

    private String quantity;

    private String totalPrice;

}
