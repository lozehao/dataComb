<%--
  Created by IntelliJ IDEA.
  User: luofubing
  Date: 2018/4/9
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/include/tags-lib.jsp"%>
<html lang="en">
<head>
  <meta charset="utf-8" />
  <link rel="shortcut icon" type="image/x-icon" href="image/titleLogo.png">
  <title>仙迪官网资源维护系统</title>
  <meta name="description" content="app, web app, responsive, responsive layout, admin, admin panel, admin dashboard, flat, flat ui, ui kit, AngularJS, ui route, charts, widgets, components" />
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
</head>
<body>
  <div class="app app-header-fixed" id="app">
    <%@include file="include/top-left.jsp"%>
    <!-- content -->
    <div class="app-content">
      <%@include file="right.jsp"%>
      <%--<iframe class="rightBox" style="width: 100%;height: 100% ;border:0.5px solid #cccccc" src="right.jsp"></iframe>
    --%>
    </div>
    <!-- /content -->
    <!-- 加载图片 -->
    <img class="loadIMG" src="image/load.png">
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
  </div>
</body>
</html>