package com.xiand.control;

import com.xiand.dto.MembergiftLogDto;
import com.xiand.entity.MemberGiftLog;
import com.xiand.server.interFace.MemberGiftDataServer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class MemberGiftLogController {
    @Resource
    public MemberGiftDataServer memberGiftDataServer;
    @ResponseBody
    @RequestMapping(value = "/seeGiftLogResource.go",method = RequestMethod.POST)
    public List<MemberGiftLog> seeGiftLogResource(){
        return memberGiftDataServer.seeGiftLogResource();
    }
    @ResponseBody
    @RequestMapping(value = "/queryGiftLogData.go",method = RequestMethod.POST)
    public List<MemberGiftLog> queryGiftLogData(@RequestParam Map<String,String> giftlogdto){
        try {
            MembergiftLogDto membergiftLogDto=new MembergiftLogDto();
            org.apache.commons.beanutils.BeanUtils.populate(membergiftLogDto,giftlogdto);
            MemberGiftLog memberGiftLog=membergiftLogDto.toBigObj();
            List<MemberGiftLog> memberGiftLogList=memberGiftDataServer.queryGiftLogData(memberGiftLog);
            return memberGiftLogList;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }

    }
}
