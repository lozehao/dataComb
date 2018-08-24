<%--
  Created by IntelliJ IDEA.
  User: luofubing
  Date: 2018/4/13
  Time: 00:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/include/tags-lib.jsp"%>
<link rel="stylesheet" type="text/css" href="css/right.css">
<html>
<head>
</head>
<body>
    <div class="rightdiv">
        <!-- 产品查看 -->
        <div id="seeProductResourceDiv">
            <h6>>产品资源查看<</h6>
            <hr size="5px" style="border-top:1px solid #8ca6cc;margin-top: 12px">
            <div class="dataMsg">
                <table id="productDataShow">
                    <thead>
                        <td>资源名称</td>
                        <td>资源查看地址</td>
                    </thead>
                </table>
            </div>
        </div>
        <!-- 产品添加 -->
        <div id="addProductResourceDiv">
            <h6>>产品资源新增<</h6>
            <hr size="5px" style="border-top:1px solid #8ca6cc;margin-top: 12px">
            <div class="">
                <div class="buttonBut">
                    <span></span>
                    <button type="button" class="emptyDo">清空填写</button>
                    <button type="button" id="addFile">增加资源附件</button>
                </div>
                <form id="updataFrom" action="${pageContext.request.contextPath}/addProductResource.go" enctype="multipart/form-data" method="post">
                    <table id="resourceAdd">
                        <tr>
                            <td class="tabItem">资&emsp;源&emsp;编&emsp;号:</td>
                            <td><input type="text" name="resourceID" value=""/><font class="bat">*</font></td>
                        </tr>
                        <tr>
                            <td class="tabItem" >资&emsp;源&emsp;名&emsp;称:</td>
                            <td><input type="text" name="resourceName" value=""/><font class="bat">*</font></td>
                        </tr>
                        <tr>
                            <td class="tabItem">资&emsp;源&emsp;附&emsp;件:</td>
                            <td><input type="file" name="resourceFile"/><font class="filebat">*</font></td>
                        </tr>
                    </table>
                </form>
                <div class="submitBut">
                    <button type="button" class="datasubmit">提交资源</button>
                </div>
            </div>
        </div>

        <!-- 礼品操作 -->
        <div id="managerGiftLogResourceDiv">
            <h6>>核对订单兑换信息<</h6>
            <hr size="5px" style="border-top:1px solid #8ca6cc;margin-top: 12px">
            <div id="managerbox">
                <form id="queryDataFrom">
                    <table>
                        <thead>
                        <tr><td colspan="3">请按要求输入条件进行查询(<font size="1px" color="red">部分框限填数字</font>)</td></tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>礼品订单号:<input type="text" name="glid" value="" onkeyup="this.value=this.value.replace(/\D/g,'')"/></td>
                            <td>会员&emsp;编号:<input name="mid" value="" type="text"/></td>
                            <td>会员姓名:<input name="mname" value="" type="text"/></td>
                        </tr>
                        <tr>
                            <td>门店&emsp;编号:<input name="rid" value="" type="text"/></td>
                            <td>门店&emsp;名称:<input name="retailname" value="" type="text"/></td>
                            <td>门店电话:<input  name="retailmobile" value="" type="text" onkeyup="this.value=this.value.replace(/\D/g,'')"/></td>
                        </tr>
                        <tr>
                            <td>代理商编号:<input name="aid" value="" type="text"/></td>
                            <td>代理商名称:<input name="agentname" value="" type="text"/></td>
                            <td>订单批次:<input name="servicecheckid" value="" type="text"/></td>
                        </tr>
                        </tbody>
                    </table>
                </form>
                <div class="managerSubmitBut">
                    <button type="button" class="queryEmptyDo">清空填写</button>
                    <button type="button" class="queryDatasubmit">提交资源</button>
                </div>
            </div>
            <div id="queryResult"></div>
        </div>
        <!-- 礼品查看 -->
        <div id="seeGiftLogResourceDiv">
            <h6>>会员礼品数据查看<</h6>
            <hr size="5px" style="border-top:1px solid #8ca6cc;margin-top: 12px">
            <div class="giftMsgTab">
                <table class="GiftLogDataShow">
                    <thead>
                        <td width="12%" id="GLID">订单编号</td>
                        <td width="5%" id="MID">会员编号</td>
                        <td width="5%" id="MName">会员名称</td>
                        <td width="5%" id="MMobile">联系电话</td>
                        <td width="14%" id="GiftName">礼品名称</td>
                        <td width="4%" id="GiftClassID">兑换数量</td>
                        <td width="5%" id="Score">价值积分</td>
                        <td width="6%" id="RID">门店编号</td>
                        <td width="8%" id="RetailName">门店名称</td>
                        <td width="5%" id="RetailMobile">门店电话</td>
                        <td width="7%" id="AID">代理商编号</td>
                        <td width="8%" id="AgentName">代理商名称</td>
                        <td width="5%" id="Province">所在省</td>
                        <td width="5%" id="City">所在市</td>
                        <td width="5%" id="Status">状态</td>
                    </thead>
                    <tbody>
                    </tbody>
                </table>
            </div>
        </div>

    </div>
    <script src="js/right.js"></script>
</body>
</html>
