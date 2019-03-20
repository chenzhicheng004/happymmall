package com.czc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Even(陈志成) on 2019/3/20
 */
@RestController
public class HappyMmallController {

    @RequestMapping("user/get_user_info.do")
    public Map getUserInfo() {
        Map<String, Object> result = new HashMap<>();
        Map<String, Object> data = new HashMap<>();
        data.put("username", "aabb");
        result.put("status", 0);
        result.put("data", data);
        return result;
    }

    @RequestMapping("cart/get_cart_product_count.do")
    public Map getCartProductCount() {
        Map<String, Object> result = new HashMap<>();
        result.put("status", 0);
        result.put("data", 20);
        return result;
    }

}
