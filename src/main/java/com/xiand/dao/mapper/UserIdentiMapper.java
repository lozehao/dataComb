package com.xiand.dao.mapper;

import com.xiand.entity.MemberInfo;

public interface UserIdentiMapper {
    public MemberInfo selectMeber(String usernmae, String password);
}
