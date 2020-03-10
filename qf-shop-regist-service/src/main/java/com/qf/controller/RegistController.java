package com.qf.controller;

import com.qf.constant.RabbitConstant;
import com.qf.service.IRegistService;
import com.qf.dto.ResultBean;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class RegistController {

    @Autowired
    private IRegistService registService;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping("register")
    @ResponseBody
    public String register(){
        return "register";
    }

    @RequestMapping("getCode/{phone}")
    @ResponseBody
    public ResultBean getCode(@PathVariable String phone){
        rabbitTemplate.convertAndSend(RabbitConstant.SMS_TOPIC_EXCHANGE,"sms.send",phone);
        return ResultBean.success();
    }

    @RequestMapping("doRegist/{phone}/{code}/{password}")
    @ResponseBody
    public ResultBean regist(@PathVariable String phone,@PathVariable String code,@PathVariable String password){
        return registService.regist(phone,code,password);
    }
}
