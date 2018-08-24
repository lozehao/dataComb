<%--<%@ page import="org.apache.struts2.ServletActionContext" %>
<%@ page import="com.rollout.pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: luofubing
  Date: 2018/4/9
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/include/tags-lib.jsp"%>

<meta name="description" content="app, web app, responsive, responsive layout, admin, admin panel, admin dashboard, flat, flat ui, ui kit, AngularJS, ui route, charts, widgets, components" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
<link rel="stylesheet" href="css/bootstrap.css" type="text/css" />
<link rel="stylesheet" href="css/mate.css" type="text/css" />
<link rel="stylesheet" href="css/icons.css" type="text/css" />
<link rel="stylesheet" href="css/home.css" type="text/css" />
<div class="app-header navbar">
    <!-- 网站标志图 -->
    <div class="navbar-header bg-dark" style="height: 50px;background-color: #74c0d9">
        <div style="width: 100%;height: 100%">
            <img src="image/02.png" style="width: 100%;height: 80%;margin-top: 5px;">
        </div>
    </div>
    <!-- 顶部右侧工具栏 -->
    <div class="collapse pos-rlt navbar-collapse box-shadow bg-white-only">
        <!-- 左侧菜单缩略按钮和用户按钮 -->
        <div class="nav navbar-nav hidden-xs">
            <a href="#" class="btn no-shadow navbar-btn" data-toggle="class:app-aside-folded" data-target=".app">
                >>
            </a>
        </div>

        <!-- / 搜索框 -->
        <!-- 顶部右侧用户通知和用户状态信息 -->
        <ul class="nav navbar-nav navbar-right">
            <!-- 用户状态信息 -->
            <li class="dropdown">
                <a href="#" data-toggle="dropdown" class="dropdown-toggle clear" data-toggle="dropdown">
                      <span class="thumb-sm avatar pull-right m-t-n-sm m-b-n-sm m-l-sm">
                            <img id="headIMG" src="image/head.png" alt="...">
                            <i class="on md b-white bottom"></i>
                      </span>
                    <span class="hidden-sm hidden-md"></span></b>
                </a>
                <!-- dropdown -->
                <ul id="loginout" class="dropdown-menu animated fadeInRight w" style="width: 50px">
                    <li>
                        <a ui-sref="access.signin" href="${ctx}/loginOut">退出登录<img style="width: 20px;height: 20px;margin-left:25px" src="image/logout.png"/></a>
                    </li>
                </ul>
            </li>
            <!-- 用户状态信息 -->
        </ul>
        <!-- / 顶部右侧用户通知和用户信息 -->
    </div>
    <!-- / 顶部右侧工具栏 -->
</div>
<div class="app-aside hidden-xs bg-dark">
    <input class="currUserRoleId" type="hidden" value=""/>
    <div class="aside-wrap">
        <div class="navi-wrap">
            <!-- user -->
            <!-- / user -->

            <!-- menu 用户认证,子用户管理,题库管理,考题申请,试卷生成,历史出卷管理,消息管理,个人管理,积分榜,系统管理-->
            <input type="hidden" class="moudid" value="${MoudId}"/>
            <nav ui-nav class="navi">
                <ul class="nav">
                    <li class="hidden-folded padder m-t m-b-sm text-muted text-xs">
                        <span style="font-size: 15px;" class="hidden-folded m-l-xs"><em>- 官网资源维护系统 -</em></span>
                    </li>
                    <li class="hidden-folded padder m-t m-b-sm text-muted text-xs">
                        <span translate="aside.nav.HEADER" style="color: white">操作菜单</span>
                    </li>
                    <li>
                        <a class="auto">
                            <img style="width: 14px;height: 14px" src="image/sys_manage.png"/>&emsp;
                            <span class="font-bold" translate="aside.nav.DASHBOARD">果本产品资源管理</span>
                        </a>
                        <ul class="nav nav-sub dk">
                            <li ui-sref-active="active">
                                <a ui-sref="app.dashboard-v1" id="seeProductResource">
                                    <span>产品资源查看</span>
                                </a>
                            </li>
                            <li ui-sref-active="active">
                                <a ui-sref="app.dashboard-v2" id="addProductResource">
                                    <span>产品资源新增</span>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li ui-sref-active="active" >
                        <a ui-sref="app.calendar">
                            <img style="width: 14px;height: 14px" src="image/sys_manage.png"/>&emsp;
                            <span class="font-bold" translate="aside.nav.CALENDAR">果本会员订单管理</span>
                        </a>
                        <ul class="nav nav-sub dk">
                            <li ui-sref-active="active">
                                <a ui-sref="app.dashboard-v1" id="seeGiftLogResource">
                                    <span>礼品订单兑换数据</span>
                                </a>
                            </li>
                            <li ui-sref-active="active">
                                <a ui-sref="app.dashboard-v2" id="managerGiftLogResource">
                                    <span>核对订单兑换信息</span>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a class="auto" id="managerResource">
                            <img style="width: 14px;height: 14px" src="image/sys_manage.png"/>&emsp;
                            <span class="font-bold">资源定向管理</span>
                        </a>
                    </li>
                </ul>
            </nav>
            <!-- / aside footer -->
        </div>
    </div>
</div>
<!-- jQuery -->
<script src="js/jquery-1.8.3.min.js"></script>
<script src="js/bootstrap.js"></script>
<script src="js/home.js"></script>
<script type="text/javascript">
    +function ($) {
        $(function(){
            $(document).on('click', '[data-toggle^="class"]', function(e){
                e && e.preventDefault();
                //console.log('abc');
                var $this = $(e.target), $class , $target, $tmp, $classes, $targets;
                !$this.data('toggle') && ($this = $this.closest('[data-toggle^="class"]'));
                $class = $this.data()['toggle'];
                $target = $this.data('target') || $this.attr('href');
                $class && ($tmp = $class.split(':')[1]) && ($classes = $tmp.split(','));
                $target && ($targets = $target.split(','));
                $classes && $classes.length && $.each($targets, function( index, value ) {
                    if ( $classes[index].indexOf( '*' ) !== -1 ) {
                        var patt = new RegExp( '\\s' +
                            $classes[index].
                            replace( /\*/g, '[A-Za-z0-9-_]+' ).
                            split( ' ' ).
                            join( '\\s|\\s' ) +
                            '\\s', 'g' );
                        $($this).each( function ( i, it ) {
                            var cn = ' ' + it.className + ' ';
                            while ( patt.test( cn ) ) {
                                cn = cn.replace( patt, ' ' );
                            }
                            it.className = $.trim( cn );
                        });
                    }
                    ($targets[index] !='#') && $($targets[index]).toggleClass($classes[index]) || $this.toggleClass($classes[index]);
                });
                $this.toggleClass('active');
            });
            // collapse nav
            $(document).on('click', 'nav a', function (e) {
                var $this = $(e.target), $active;
                $this.is('a') || ($this = $this.closest('a'));

                $active = $this.parent().siblings( ".active" );
                $active && $active.toggleClass('active').find('> ul:visible').slideUp(200);

                ($this.parent().hasClass('active') && $this.next().slideUp(200)) || $this.next().slideDown(200);
                $this.parent().toggleClass('active');

                $this.next().is('ul') && e.preventDefault();

                setTimeout(function(){ $(document).trigger('updateNav'); }, 300);
            });
        });
    }(jQuery);
</script>
