<%--
  Created by IntelliJ IDEA.
  User: luofubing
  Date: 2018/4/9
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/include/tags-lib.jsp"%>
<html>
<head>
<!-- http://www.sterorea.cn/favicon.ico -->
<link rel="shortcut icon" type="image/x-icon" href="image/titleLogo.png">
<link rel="stylesheet" href="css/login.css" type="text/css" charset="UTF-8"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<META HTTP-EQUIV="pragma" CONTENT="no-cache">
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache, must-revalidate">
<META HTTP-EQUIV="expires" CONTENT="0">
<title>仙迪官网资源维护系统</title>
</head>
<body class="login" mycollectionplug="bind">
    <div class="login_m">
        <div class="login_logo" style="font-size: 30px;color: white"><span><img src="image/companyLogo.png" alt="SVNDV CMS MANAGER"></span></div>
        <div class="login_boder">
            <div class="login_padding" id="login_model">
                <center><font size="5" color="#322d2c"><em>官网资源维护系统</em></font></center>
                <input type="hidden" class="errorMsg" value="${user.userName}"/>
                <form class="submit_form" action="${ctx}/userIdentifide.go" method="post">
                    <h2 style="color: #5a5a5a;margin-top: 15px">用户名:</h2>
                  <label>
                    <input type="text" name="userName" id="username" class="txt_input txt_input2" value="请输入您的用户名">
                  </label>
                  <h2 style="color: #5a5a5a">密 码:</h2>
                  <label>
                    <input type="password" name="passWord" id="userpwd" class="txt_input" value="">
                  </label>
                  <p class="forgot"><span class="error">${message}</span></p>
                  <div class="rem_sub">
                      <div class="rem_sub_l">
                            <input type="checkbox" name="checkbox" id="save_me">
                            <label type="checkbox">仅供维护人员操作</label>
                      </div>
                      <label>
                          <input type="button" onclick="toSubmit();" disabled="disabled" class="sub_button" id="button"  value="登录" style="opacity: 0.8;">
                      </label>
                  </div>
                </form>
            </div>
        </div>
    </div>
    <!--弹框-->
    <div id="alertBack">
        <div id="alertBox">
            <div id="alertHead">系统消息</div>
            <div id="alertButton">
                <div class="sysMessage">消息内容</div>
                <button type="button" class="sysTip">确认</button>
            </div>
        </div>
    </div>
     <br> <br>
    <p align="center" style="display:blcolor: #7b7474;">系统最终解释权归  ©   &emsp; www.xdgroup.net&emsp; 所有</p>
</body>
<script src="js/jquery-1.8.3.min.js"></script>
<script src="js/login.js"></script>
</html>