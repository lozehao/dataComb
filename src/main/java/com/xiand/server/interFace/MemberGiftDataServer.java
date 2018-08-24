package com.xiand.server.interFace;

import com.xiand.dao.mapper.MemberGiftDataMapper;
import com.xiand.entity.MemberGiftLog;

import java.util.List;

public interface MemberGiftDataServer {
    public List<MemberGiftLog> seeGiftLogResource();
    public List<MemberGiftLog> queryGiftLogData(MemberGiftLog memberGiftLog);
}
