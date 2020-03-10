package com.qf.controller;

import com.qf.service.ICodeService;
import com.qf.dto.ResultBean;
import com.qf.service.IRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("user")
public class RegistController {

    //@Autowired
    //private ICodeService codeService;

    //@Autowired
    //private IDoRegistService doRegistService;

    @Autowired
    private IRegisterService registerService;

    @RequestMapping("register")
    public String register(){
        return registerService.register();
    }

    @RequestMapping("getCode")
    public ResultBean getCode(@RequestParam String phone){
//        return codeService.getCode(phone);
        return null;
    }

    @RequestMapping("doRegist")
    public ResultBean doRegis(@RequestParam String phone,@RequestParam String code,@RequestParam String password){
//        return doRegistService.regist(phone,code,password);
        return null;
    }
}
