package com.qf.service;

import com.qf.dto.ResultBean;

public interface IRegistService {

    ResultBean regist(String phone, String code, String password);
}
