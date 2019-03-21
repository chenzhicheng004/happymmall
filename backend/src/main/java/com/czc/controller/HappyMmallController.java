package com.czc.controller;

import com.alibaba.fastjson.JSONObject;
import com.czc.vo.UserRegisterVo;
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

    @RequestMapping("user/login.do")
    public Map login(String username, String password) {
        System.out.println(username + "===" + password);
        Map<String, Object> result = new HashMap<>();
        result.put("status", 0);
        return result;
    }

    @RequestMapping("user/logout.do")
    public Map logout() {
        Map<String, Object> result = new HashMap<>();
        result.put("status", 0);
        return result;
    }

    @RequestMapping("user/check_valid.do")
    public Map checkValid() {
        Map<String, Object> result = new HashMap<>();
        result.put("status", 0);
        return result;
    }

    @RequestMapping("user/register.do")
    public Map register(UserRegisterVo userinfo) {
        System.out.println(JSONObject.toJSONString(userinfo));
        Map<String, Object> result = new HashMap<>();
        result.put("status", 0);
        return result;
    }

    @RequestMapping("user/forget_get_question.do")
    public Map forgetGetQuestion(String username) {
        System.out.println(username);
        Map<String, Object> result = new HashMap<>();
        result.put("status", 0);
        result.put("data", "aabb");
        return result;
    }

    @RequestMapping("user/forget_check_answer.do")
    public Map forgetCheckAnswer(String username) {
        System.out.println(username);
        Map<String, Object> result = new HashMap<>();
        result.put("status", 0);
        result.put("data", "token");
        return result;
    }

    @RequestMapping("user/forget_reset_password.do")
    public Map forgetResetPassword() {
        Map<String, Object> result = new HashMap<>();
        result.put("status", 0);
        return result;
    }

    @RequestMapping("user/get_information.do")
    public Map getInformation() {
        Map<String, Object> result = new HashMap<>();
        Map<String, Object> data = new HashMap<>();
        result.put("status", 0);
        data.put("username", "aa");
        data.put("phone", "phone");
        data.put("email", "email");
        data.put("question", "question");
        data.put("answer", "answer");
        result.put("data", data);
        return result;
    }

    @RequestMapping("user/update_information.do")
    public Map updateInformation(UserRegisterVo userinfo) {
        System.out.println(JSONObject.toJSONString(userinfo));
        Map<String, Object> result = new HashMap<>();
        result.put("status", 0);
        return result;
    }

    @RequestMapping("user/reset_password.do")
    public Map resetPassword() {
        Map<String, Object> result = new HashMap<>();
        result.put("status", 0);
        return result;
    }
}
