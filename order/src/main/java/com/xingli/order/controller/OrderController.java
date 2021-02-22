package com.xingli.order.controller;

import com.alibaba.fastjson.JSONObject;
import com.xingli.common.entity.po.Payment;
import com.xingli.common.entity.vo.CommonResult;
import com.xingli.common.util.CommonConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping(value = "/consumer/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        String postForObject = restTemplate.postForObject(CommonConstant.PAYMENT_URL + "/payment/create", payment, String.class);
        CommonResult commonResult = JSONObject.parseObject(postForObject, CommonResult.class);
        return commonResult;
    }

}
