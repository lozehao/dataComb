package com.xiand.server.impl;

import com.xiand.dao.mapper.MemberGiftDataMapper;
import com.xiand.entity.MemberGiftLog;
import com.xiand.server.interFace.MemberGiftDataServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Service
public class MemberGiftDataServerImpl implements MemberGiftDataServer {
    @Resource
    private MemberGiftDataMapper memberGiftLogDao;
    @Override
    public List<MemberGiftLog> seeGiftLogResource() {
        List<MemberGiftLog> memberGiftLogList=new ArrayList<>();
        try {
            memberGiftLogList=memberGiftLogDao.seeGiftLogResource();
        }catch(Exception e){
            System.out.println("========"+e);
        }
        return memberGiftLogList;
    }
    public List<MemberGiftLog> queryGiftLogData(MemberGiftLog memberGiftLog){
        return memberGiftLogDao.queryGiftLogData(memberGiftLog);
    };
}
