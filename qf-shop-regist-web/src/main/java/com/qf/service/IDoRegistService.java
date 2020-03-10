package com.qf.service;

import com.qf.dto.ResultBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient("shop-regist-service")
public interface IDoRegistService {
    //@RequestMapping("user/doRegist")
    //ResultBean regist(@RequestParam String phone, @RequestParam String code, @RequestParam String password);
}
