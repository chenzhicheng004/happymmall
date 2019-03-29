package com.czc.vo;

import lombok.Data;

import java.util.List;

/**
 * Created by Even(陈志成) on 2019/3/29
 */
@Data
public class OrderDetailVo {

    private String orderNo;

    private String createTime;

    private String receiverName;

    private AddressVo shippingVo;

    private String statusDesc;

    private String paymentTypeDesc;

    private Boolean needPay;

    private Boolean isCancelable;

    private List<OrderItemVo> orderItemVoList;

    private String payment;

}
