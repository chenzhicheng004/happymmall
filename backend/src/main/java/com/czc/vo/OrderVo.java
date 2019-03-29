package com.czc.vo;

import lombok.Data;

import java.util.List;

/**
 * Created by Even(陈志成) on 2019/3/29
 */
@Data
public class OrderVo {

    private List<OrderItemVo> orderItemVoList;

    private String orderNo;

    private String createTime;

    private String statusDesc;

    private String payment;
}
