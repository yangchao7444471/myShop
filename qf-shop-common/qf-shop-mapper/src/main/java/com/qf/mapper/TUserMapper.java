package com.qf.mapper;

import com.qf.entity.TUser;

public interface TUserMapper {

    int insertSelective(TUser user);
}