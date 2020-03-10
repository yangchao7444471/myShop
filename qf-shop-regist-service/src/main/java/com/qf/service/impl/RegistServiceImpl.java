package com.qf.service.impl;


import com.qf.constant.RedisConstant;
import com.qf.entity.TUser;
import com.qf.mapper.TUserMapper;
import com.qf.service.IRegistService;
import com.qf.dto.ResultBean;
import com.qf.util.SpringSecurityUtil;
import com.qf.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RegistServiceImpl implements IRegistService {

    @Autowired
    private TUserMapper mapper;

    @Autowired
    private RedisTemplate redisTemplate;


    @Override
    public ResultBean regist(String phone, String code, String password) {
        String redisKey = StringUtil.getRedisKey(RedisConstant.REGISTER_PHONE,phone);
        String redisCode = (String) redisTemplate.opsForValue().get(redisKey);
        if(code.equals(redisCode)){
            TUser user = new TUser();
            user.setPhone(phone);
            user.setPassword(SpringSecurityUtil.getEncodePassword(password));
            mapper.insertSelective(user);
            return ResultBean.success("注册成功");
        }
        return ResultBean.error("验证码错误,请重新获取输入");
    }
}
