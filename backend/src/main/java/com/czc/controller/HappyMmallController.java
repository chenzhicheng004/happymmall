package com.czc.controller;

import com.alibaba.fastjson.JSONObject;
import com.czc.vo.CartVo;
import com.czc.vo.ProductVo;
import com.czc.vo.UserRegisterVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    @RequestMapping("product/list.do")
    public Map productList() {
        Map<String, Object> result = new HashMap<>();
        Map<String, Object> data = new HashMap<>();
        List<ProductVo> list = new ArrayList<>();
        ProductVo vo = new ProductVo();
        list.add(new ProductVo(1L, "http://springforall.ufile.ucloud.com.cn", "/static/img/2d33b00f9596e606b113e7f5ce57e3b71511619", "aaa", "22"));
        list.add(new ProductVo(2L, "http://springforall.ufile.ucloud.com.cn", "/static/img/2d33b00f9596e606b113e7f5ce57e3b71511619", "aaa", "22"));
        list.add(new ProductVo(3L, "http://springforall.ufile.ucloud.com.cn", "/static/img/2d33b00f9596e606b113e7f5ce57e3b71511619", "aaa", "22"));
        list.add(new ProductVo(4L, "http://springforall.ufile.ucloud.com.cn", "/static/img/2d33b00f9596e606b113e7f5ce57e3b71511619", "aaa", "22"));
        list.add(new ProductVo(5L, "http://springforall.ufile.ucloud.com.cn", "/static/img/2d33b00f9596e606b113e7f5ce57e3b71511619", "aaa", "22"));
        list.add(new ProductVo(6L, "http://springforall.ufile.ucloud.com.cn", "/static/img/2d33b00f9596e606b113e7f5ce57e3b71511619", "aaa", "22"));
        data.put("list", list);
        data.put("hasPreviousPage", true);
        data.put("prePage", 1);
        data.put("hasNextPage", true);
        data.put("nextPage", 3);
        data.put("pages", 8);

        result.put("status", 0);
        result.put("data", data);
        return result;
    }

    @RequestMapping("product/detail.do")
    public Map detail(Long productId) {
        System.out.println(productId);
        Map<String, Object> result = new HashMap<>();
        Map<String, Object> data = new HashMap<>();
        data.put("subImages","a,b,c");
        data.put("imageHost","aa");
        data.put("mainImage","aa");
        data.put("name","aa");
        data.put("subtitle","bb");
        data.put("stock","22");
        data.put("price","￥22");
        data.put("detail","<span>aaabbb</span>");
        result.put("status", 0);
        result.put("data", data);
        return result;
    }

    @RequestMapping("cart/add.do")
    public Map add(Long productId,Integer count) {
        Map<String, Object> result = new HashMap<>();
        result.put("status", 0);
        return result;
    }

    @RequestMapping("cart/list.do")
    public Map list() {
        Map<String, Object> result = new HashMap<>();
        Map<String, Object> data = new HashMap<>();
        data.put("allChecked", true);
        List<CartVo> list = new ArrayList<>();
        CartVo vo = new CartVo();
        vo.setProductId(1L);
        vo.setImageHost("");
        vo.setProductMainImage("");
        vo.setProductName("aaa");
        vo.setProductPrice("333");
        vo.setProductStock(323);
        vo.setQuantity(1);
        vo.setProductTotalPrice("555");
        vo.setProductChecked(true);
        list.add(vo);

        CartVo vo1 = new CartVo();
        vo1.setProductId(2L);
        vo1.setImageHost("");
        vo1.setProductMainImage("");
        vo1.setProductName("aaa");
        vo1.setProductPrice("333");
        vo1.setProductStock(323);
        vo1.setQuantity(2);
        vo1.setProductTotalPrice("555");
        vo1.setProductChecked(true);
        list.add(vo1);
        data.put("cartProductVoList", list);
        data.put("cartTotalPrice", "666");

        result.put("status", 0);
        result.put("data", data);
        return result;
    }

    @RequestMapping("cart/update.do")
    public Map update() {
        return list();
    }

    @RequestMapping("cart/select.do")
    public Map select() {
        return list();
    }

    @RequestMapping("cart/delete_product.do")
    public Map deleteProduct() {
        return list();
    }
}
