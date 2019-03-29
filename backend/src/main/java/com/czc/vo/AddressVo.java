package com.czc.vo;

import lombok.Data;

/**
 * Created by Even(陈志成) on 2019/3/29
 */
@Data
public class AddressVo {

    private Boolean isActive;

    private Long id;

    private String receiverCity;

    private String receiverProvince;

    private String receiverName;

    private String receiverAddress;

    private String receiverPhone;

    private Boolean isUpdate;

    private String receiverMobile;

}
