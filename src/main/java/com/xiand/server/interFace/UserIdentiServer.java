package com.xiand.server.interFace;

import com.xiand.entity.MemberInfo;

public interface UserIdentiServer {
    public MemberInfo selectMeber(String usernmae, String password);
}
