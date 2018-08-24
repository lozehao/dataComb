package com.xiand.server.impl;

import com.xiand.dao.mapper.UserIdentiMapper;
import com.xiand.entity.MemberInfo;
import com.xiand.server.interFace.UserIdentiServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("userIdentiServerImpl")
public class UserIdentiServerImpl implements UserIdentiServer {
    @Resource
    private UserIdentiMapper userIdentiMapper;
    @Override
    public MemberInfo selectMeber(String username, String password) {
        MemberInfo memberInfo =userIdentiMapper.selectMeber(username,password);
        if(memberInfo !=null){
            return memberInfo;
        }
        return null;
    }
}
