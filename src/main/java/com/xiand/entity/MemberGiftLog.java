package com.xiand.entity;

import java.util.Date;

public class MemberGiftLog {
    private int ID                      ;
    private String GLID                 ;
    private String MID                  ;
    private String MName                ;
    private String MMobile              ;
    private String GiftID               ;
    private String GiftName             ;
    private String GiftClassID          ;
    private int Score                   ;
    private String AID                  ;
    private String AgentName            ;
    private String RID                  ;
    private String RetailName           ;
    private String RetailMobile         ;
    private String Province             ;
    private String City                 ;
    private String District             ;
    private String Address              ;
    private String Remark               ;
    private String Status               ;
    private java.util.Date AddTime                 ;
    private String ServiceCheckID       ;
    private Date ServiceCheckTime       ;
    private Date WarehouseCheckTime     ;
    private Date AgrentCheckTime        ;
    private Date RetailGetTime          ;
    private Date MemberGetTime          ;
    private int CancellationState       ;
    private String Cancellation         ;
    private Date CancellationTime;
    private String CancellationReason     ;
    //private String shop_code            ;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getGLID() {
        return GLID;
    }

    public void setGLID(String GLID) {
        this.GLID = GLID;
    }

    public String getMID() {
        return MID;
    }

    public void setMID(String MID) {
        this.MID = MID;
    }

    public String getMName() {
        return MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public String getMMobile() {
        return MMobile;
    }

    public void setMMobile(String MMobile) {
        this.MMobile = MMobile;
    }

    public String getGiftID() {
        return GiftID;
    }

    public void setGiftID(String giftID) {
        GiftID = giftID;
    }

    public String getGiftName() {
        return GiftName;
    }

    public void setGiftName(String giftName) {
        GiftName = giftName;
    }

    public String getGiftClassID() {
        return GiftClassID;
    }

    public void setGiftClassID(String giftClassID) {
        GiftClassID = giftClassID;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public String getAID() {
        return AID;
    }

    public void setAID(String AID) {
        this.AID = AID;
    }

    public String getAgentName() {
        return AgentName;
    }

    public void setAgentName(String agentName) {
        AgentName = agentName;
    }

    public String getRID() {
        return RID;
    }

    public void setRID(String RID) {
        this.RID = RID;
    }

    public String getRetailName() {
        return RetailName;
    }

    public void setRetailName(String retailName) {
        RetailName = retailName;
    }

    public String getRetailMobile() {
        return RetailMobile;
    }

    public void setRetailMobile(String retailMobile) {
        RetailMobile = retailMobile;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Date getAddTime() {
        return AddTime;
    }

    public void setAddTime(Date addTime) {
        AddTime = addTime;
    }

    public String getServiceCheckID() {
        return ServiceCheckID;
    }

    public void setServiceCheckID(String serviceCheckID) {
        ServiceCheckID = serviceCheckID;
    }

    public Date getServiceCheckTime() {
        return ServiceCheckTime;
    }

    public void setServiceCheckTime(Date serviceCheckTime) {
        ServiceCheckTime = serviceCheckTime;
    }

    public Date getWarehouseCheckTime() {
        return WarehouseCheckTime;
    }

    public void setWarehouseCheckTime(Date warehouseCheckTime) {
        WarehouseCheckTime = warehouseCheckTime;
    }

    public Date getAgrentCheckTime() {
        return AgrentCheckTime;
    }

    public void setAgrentCheckTime(Date agrentCheckTime) {
        AgrentCheckTime = agrentCheckTime;
    }

    public Date getRetailGetTime() {
        return RetailGetTime;
    }

    public void setRetailGetTime(Date retailGetTime) {
        RetailGetTime = retailGetTime;
    }

    public Date getMemberGetTime() {
        return MemberGetTime;
    }

    public void setMemberGetTime(Date memberGetTime) {
        MemberGetTime = memberGetTime;
    }

    public int getCancellationState() {
        return CancellationState;
    }

    public void setCancellationState(int cancellationState) {
        CancellationState = cancellationState;
    }

    public String getCancellation() {
        return Cancellation;
    }

    public void setCancellation(String cancellation) {
        Cancellation = cancellation;
    }

    public Date getCancellationTime() {
        return CancellationTime;
    }

    public void setCancellationTime(Date cancellationTime) {
        CancellationTime = cancellationTime;
    }

    public String getCancellationReason() {
        return CancellationReason;
    }

    public void setCancellationReason(String cancellationReason) {
        CancellationReason = cancellationReason;
    }

    @Override
    public String toString() {
        return "MemberGiftLog{" +
                "ID=" + ID +
                ", GLID='" + GLID + '\'' +
                ", MID='" + MID + '\'' +
                ", MName='" + MName + '\'' +
                ", MMobile='" + MMobile + '\'' +
                ", GiftID='" + GiftID + '\'' +
                ", GiftName='" + GiftName + '\'' +
                ", GiftClassID='" + GiftClassID + '\'' +
                ", Score=" + Score +
                ", AID='" + AID + '\'' +
                ", AgentName='" + AgentName + '\'' +
                ", RID='" + RID + '\'' +
                ", RetailName='" + RetailName + '\'' +
                ", RetailMobile='" + RetailMobile + '\'' +
                ", Province='" + Province + '\'' +
                ", City='" + City + '\'' +
                ", District='" + District + '\'' +
                ", Address='" + Address + '\'' +
                ", Remark='" + Remark + '\'' +
                ", Status='" + Status + '\'' +
                ", AddTime=" + AddTime +
                ", ServiceCheckID='" + ServiceCheckID + '\'' +
                ", ServiceCheckTime=" + ServiceCheckTime +
                ", WarehouseCheckTime=" + WarehouseCheckTime +
                ", AgrentCheckTime=" + AgrentCheckTime +
                ", RetailGetTime=" + RetailGetTime +
                ", MemberGetTime=" + MemberGetTime +
                ", CancellationState=" + CancellationState +
                ", Cancellation='" + Cancellation + '\'' +
                ", CancellationTime=" + CancellationTime +
                ", CancellationReason='" + CancellationReason + '\'' +
                '}';
    }
//    public String getShop_code() {
//        return shop_code;
//    }
//
//    public void setShop_code(String shop_code) {
//        this.shop_code = shop_code;
//    }
}
