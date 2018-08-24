package com.xiand.dao.mapper;

import com.xiand.entity.MemberGiftLog;

import java.util.List;

public interface MemberGiftDataMapper {
    public List<MemberGiftLog> seeGiftLogResource();
    public List<MemberGiftLog> queryGiftLogData(MemberGiftLog memberGiftLog);
}
