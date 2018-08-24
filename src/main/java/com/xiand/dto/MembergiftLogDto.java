package com.xiand.dto;

import com.xiand.entity.MemberGiftLog;
public class MembergiftLogDto {
    private String aid;
    private String agentname;
    private String glid;
    private String mid;
    private String mname;
    private String rid;
    private String retailmobile;
    private String retailname;
    private String servicecheckid;

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getAgentname() {
        return agentname;
    }

    public void setAgentname(String agentname) {
        this.agentname = agentname;
    }

    public String getGlid() {
        return glid;
    }

    public void setGlid(String glid) {
        this.glid = glid;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getRetailmobile() {
        return retailmobile;
    }

    public void setRetailmobile(String retailmobile) {
        this.retailmobile = retailmobile;
    }

    public String getRetailname() {
        return retailname;
    }

    public void setRetailname(String retailname) {
        this.retailname = retailname;
    }

    public String getServicecheckid() {
        return servicecheckid;
    }

    public void setServicecheckid(String servicecheckid) {
        this.servicecheckid = servicecheckid;
    }

    public MemberGiftLog toBigObj(){
        MemberGiftLog memberGiftLog=new MemberGiftLog();
        if(aid!=null&&aid.length()>0)
            memberGiftLog.setAID(aid);
        if(agentname!=null&&agentname.length()>0)
            memberGiftLog.setAgentName(agentname);
        if(glid!=null&&glid.length()>0)
            memberGiftLog.setGLID(glid);
        if(mid!=null&&mid.length()>0)
            memberGiftLog.setMID(mid);
        if(mname!=null&&mname.length()>0)
            memberGiftLog.setMName(mname);
        if(rid!=null&&rid.length()>0)
            memberGiftLog.setRID(rid);
        if(retailmobile!=null&&retailmobile.length()>0)
            memberGiftLog.setRetailMobile(retailmobile);
        if(retailname!=null&&retailname.length()>0)
            memberGiftLog.setRetailName(retailname);
        if(servicecheckid!=null&&servicecheckid.length()>0)
            memberGiftLog.setServiceCheckID(servicecheckid);
        return memberGiftLog;
    }
}
