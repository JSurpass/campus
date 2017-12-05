<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>科师“贰货”坊</title>
    <link rel="stylesheet" href="../../../static/css/user.css" />
    <link rel="stylesheet" href="../../../static/css/index.css" />
    <link rel="stylesheet" href="../../../static/css/materialize-icon.css" />
    <script type="text/javascript" src="../../../static/js/jquery-3.2.1.min.js" ></script>
    <script type="text/javascript" src="../../../static/js/index.js" ></script>
<body ng-view="ng-view">
<!--
    作者：hlk_1135@outlook.com
    时间：2017-05-05
    描述：顶部
-->
<div ng-controller="headerController" class="header stark-components navbar-fixed ng-scope">
    <nav class="white nav1">
        <div class="nav-wrapper">
            <div href="<%=basePath%>goods/homeGoods" class="logo">
                <div class="image"></div>
                <div class="text">
                    <a class="a1">科师</a>
                    <a class="a2">“贰货”坊</a><br>
                    <a class="a3">ksu.market</a>
                </div>
            </div>
            <div class="nav-wrapper search-bar">
                <form ng-submit="search()" class="ng-pristine ng-invalid ng-invalid-required" action="/goods/search">
                    <div class="input-field">
                        <input id="search" name="str" placeholder="搜点什么吧233..." style="height: 40px;"
                               class="ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required"/>
                        <label for="search" class="active">
                            <i ng-click="search()" class="iconfont"></i>
                        </label>
                    </div>
                </form>
            </div>
            <div class="handle">
                <ul class="right">
                    <c:if test="${empty cur_user}">
                        <li class="publish-btn">
                            <button ng-click="showLogin()" data-position="bottom" data-delay="50"
                                    data-tooltip="需要先登录哦！" class="red lighten-1 waves-effect waves-light btn" data-tooltip-id="510d3084-e666-f82f-3655-5eae4304a83a"	>
                                我要发布</button>
                        </li>
                    </c:if>
                    <c:if test="${!empty cur_user}">
                        <li class="publish-btn">
                            <button data-position="bottom" class="red lighten-1 waves-effect waves-light btn">
                                <a href="/goods/publishGoods">我要发布</a>
                            </button>
                        </li>
                        <li>
                            <a href="/user/allGoods">我发布的商品</a>
                        </li>
                        <li>
                            <a></a>
                        </li>
                        <li class="notification">
                            <i ng-click="showNotificationBox()" class="iconfont"></i>
                            <div ng-show="notification.tagIsShow" class="notification-amount red lighten-1 ng-binding ng-hide">0 </div>
                        </li>
                        <li class="changemore">
                            <a class="changeMoreVertShow()">
                                <i class="iconfont"></i>
                            </a>
                            <div class="more-vert">
                                <ul class="dropdown-content">
                                    <li><a href="/user/home">个人中心</a></li>
                                    <li><a>消息</a></li>
                                    <li><a onclick="ChangeName()">更改用户名</a></li>
                                    <li><a href="/user/logout">退出登录</a></li>
                                </ul>
                            </div>
                        </li>
                    </c:if>
                    <c:if test="${empty cur_user}">
                        <li>
                            <a onclick="showLogin()">登录</a>
                        </li>
                        <li>
                            <a onclick="showSignup()">注册</a>
                        </li>
                    </c:if>
                </ul>
            </div>
        </div>
    </nav>
</div>
<!--
    作者：hlk_1135@outlook.com
    时间：2017-05-05
    描述：登录
-->
<div ng-controller="loginController" class="ng-scope">
    <div id="login-show" class="login stark-components">
        <div class="publish-box z-depth-4">
            <div class="row">
                <a onclick="showLogin()">
                    <div class="col s12 title"></div>
                </a>
                <form:form action="/user/login" method="post"  role="form">
                    <div class="input-field col s12">
                        <input type="text" name="phone" required="required" pattern="^1[0-9]{10}$" class="validate ng-pristine ng-empty ng-invalid ng-invalid-required ng-valid-pattern ng-touched" />
                        <label>手机</label>
                    </div>
                    <div class="input-field col s12">
                        <input type="password" name="password" required="required" class="validate ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required" />
                        <label>密码</label>
                        <a ng-click="showForget()" class="forget-btn">忘记密码？</a>
                    </div>
                    <button type="submit" class="waves-effect waves-light btn login-btn red lighten-1">
                        <i class="iconfont left"></i>
                        <em>点击登录</em>
                    </button>
                    <div class="box-account">
                        <ul>
                            <li><div class="qq"></div></li>
                            <li><div class="wx"></div></li>
                            <li><div class="wb"></div></li>
                        </ul>
                    </div>
                    <div ng-show="checkTelIsShow" class="col s12 signup-area">
                        <em>没有账号？赶快</em>
                        <a onclick="showSignup()" class="signup-btn">注册</a>
                        <em>吧！</em>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</div>
<!--
    作者：hlk_1135@outlook.com
    时间：2017-05-06
    描述：注册
-->
<div ng-controller="signupController" class="ng-scope">
    <div id="signup-show" class="signup stark-components">
        <div class="publish-box z-depth-4">
            <div class="row">
                <a onclick="showSignup()">
                    <div class="col s12 title"></div>
                </a>
                <form:form action="/user/addUser" method="post"  role="form">
                    <div class="input-field col s12">
                        <input type="text" name="username" required="required" class="validate ng-pristine ng-empty ng-invalid ng-invalid-required ng-valid-pattern ng-touched" />
                        <label>昵称</label>
                    </div>
                    <div class="input-field col s12">
                        <input type="text" name="phone" required="required" pattern="^1[0-9]{10}$" class="validate ng-pristine ng-empty ng-invalid ng-invalid-required ng-valid-pattern ng-touched" />
                        <label>手机</label>
                    </div>
                    <div class="input-field col s12">
                        <input type="password" name="password" required="required" class="validate ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required" />
                        <label>密码</label>
                    </div>
                    <div ng-show="checkTelIsShow" class="col s12">
                        <button type="submit" class="waves-effect waves-light btn verify-btn red lighten-1">
                            <i class="iconfont left"></i>
                            <em>点击注册</em>
                        </button>
                    </div>
                    <div ng-show="checkTelIsShow" class="login-area col s12">
                        <em>已有账号？去</em>
                        <a onclick="showLogin()">登录</a>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</div>
<!--更改用户名-->
<div ng-controller="changeNameController" class="ng-scope">
    <div id="changeName" class="change-name stark-components">
        <div class="publish-box z-depth-4">
            <div class="row">
                <div class="col s12 title">
                    <h1>修改用户名</h1>
                </div>
                <form:form action="/user/changeName" method="post" role="form">
                    <div class="input-field col s12">
                        <input type="text" name="username" required="required" class="validate ng-pristine ng-empty ng-invalid ng-invalid-required ng-valid-pattern ng-touched" />
                        <label>修改用户名</label>
                    </div>
                    <div ng-show="checkTelIsShow" class="col s12">
                        <button class="waves-effect waves-light btn publish-btn red lighten-1">
                            <i class="iconfont left"></i>
                            <em>确认</em>
                        </button>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</div>
<!--
    作者：hlk_1135@outlook.com
    时间：2017-05-05
    描述：左侧导航条
-->
<div ng-controller="sidebarController" class="sidebar stark-components ng-scope">
    <li ng-class="{true: 'active'}[isAll]">
        <a href="/goods/catalog/1" class="index">
            <img src="../../../static/images/index.png">
            <em>最新发布</em>
        </a>
    </li>
    <li ng-class="{true: 'active'}[isDigital]">
        <a href="/goods/catalog/1" class="digital">
            <img src="../../../static/images/digital.png"  />
            <em>闲置数码</em>
        </a>
    </li>
    <li ng-class="{true: 'active'}[isRide]">
        <a href="/goods/catalog/2" class="ride">
            <img src="../../../static/images/ride.png"/>
            <em>校园代步</em>
        </a>
    </li>
    <li ng-class="{true: 'active'}[isCommodity]">
        <a href="/goods/catalog/3" class="commodity">
            <img src="../../../static/images/commodity.png"/>
            <em>电器日用</em>
        </a>
    </li>
    <li ng-class="{true: 'active'}[isBook]">
        <a href="/goods/catalog/4" class="book">
            <img src="../../../static/images/book.png"/>
            <em>图书教材</em>
        </a>
    </li>
    <li ng-class="{true: 'active'}[isMakeup]">
        <a href="/goods/catalog/5" class="makeup">
            <img src="../../../static/images/makeup.png"/>
            <em>美妆衣物</em>
        </a>
    </li>
    <li ng-class="{true: 'active'}[isSport]">
        <a href="/goods/catalog/6" class="sport">
            <img src="../../../static/images/sport.png"/>
            <em>运动棋牌</em>
        </a>
    </li>
    <li ng-class="{true: 'active'}[isSmallthing]">
        <a href="/goods/catalog/7" class="smallthing">
            <img src="../../../static/images/smallthing.png"/>
            <em>票券小物</em>
        </a>
    </li>
    <div class="info">
        <a href="" target="_blank">关于我们</a><em>-</em>
        <a href="">联系我们</a>
        <p>&copy;2017 翎羽工作室</p>
    </div>
</div>
<!--
    作者：hlk_1135@outlook.com
    时间：2017-05-05
    描述：右侧显示部分
-->
<div class="main-content">
    <!--
        作者：hlk_1135@outlook.com
        时间：2017-05-05
        描述：右侧banner（图片）部分
    -->
    <div class="slider-wapper">
        <div class="slider" style="height: 440px; touch-action: pan-y; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);">
            <ul class="slides" style="height: 400px;">
                <li class="active" style="opacity: 1;">
                    <a href="">
                        <div class="bannerimg">

                        </div>
                    </a>
                </li>
            </ul>
        </div>
    </div>
    <!--
        作者：hlk_1135@outlook.com
        时间：2017-05-05
        描述：最新发布
    -->
    <div class="index-title">
        <a href="">最新发布</a>
        <hr class="hr1">
        <hr class="hr2">
    </div>
    <div class="waterfoo stark-components row">
        <div class="item-wrapper normal">
            <c:forEach var="item" items="${catelogGoods1}">
                <div class="card col">
                    <a href="<%=basePath%>goods/goodsId/${item.goods.id}">
                        <div class="card-image">
                            <img src="../upload/${item.images[0].imgUrl}" />
                        </div>
                        <div class="card-content item-price"><c:out value="${item.goods.price}"></c:out></div>
                        <div class="card-content item-name">
                            <p><c:out value="${item.goods.name}"></c:out></p>
                        </div>
                        <div class="card-content item-location">
                            <p>鲁东大学</p>
                            <p><c:out value="${item.goods.startTime}"></c:out></p>
                        </div>
                    </a>
                </div>
            </c:forEach>
        </div>
    </div>
    <!--
        作者：hlk_1135@outlook.com
        时间：2017-05-05
        描述：闲置数码
    -->
    <div class="index-title">
        <a href="">闲置数码</a>
        <hr class="hr1">
        <hr class="hr2">
    </div>
    <div class="waterfoo stark-components row">
        <div class="item-wrapper normal">
            <c:forEach var="item" items="${catelogGoods1}">
                <div class="card col">
                    <a href="<%=basePath%>goods/goodsId/${item.goods.id}">
                        <div class="card-image">
                            <img src="../upload/${item.images[0].imgUrl}" />
                        </div>
                        <div class="card-content item-price"><c:out value="${item.goods.price}"></c:out></div>
                        <div class="card-content item-name">
                            <p><c:out value="${item.goods.name}"></c:out></p>
                        </div>
                        <div class="card-content item-location">
                            <p>鲁东大学</p>
                            <p><c:out value="${item.goods.startTime}"></c:out></p>
                        </div>
                    </a>
                </div>
            </c:forEach>
        </div>
    </div>
    <!--
        作者：hlk_1135@outlook.com
        时间：2017-05-05
        描述：校园代步
    -->
    <div class="index-title">
        <a href="">校园代步</a>
        <hr class="hr1">
        <hr class="hr2">
    </div>
    <div class="waterfoo stark-components row">
        <div class="item-wrapper normal">
            <c:forEach var="item" items="${catelogGoods2}">
                <div class="card col">
                    <a href="<%=basePath%>goods/goodsId/${item.goods.id}">
                        <div class="card-image">
                            <img src="../upload/${item.images[0].imgUrl}" />
                        </div>
                        <div class="card-content item-price"><c:out value="${item.goods.price}"></c:out></div>
                        <div class="card-content item-name">
                            <p><c:out value="${item.goods.name}"></c:out></p>
                        </div>
                        <div class="card-content item-location">
                            <p>鲁东大学</p>
                            <p><c:out value="${item.goods.startTime}"></c:out></p>
                        </div>
                    </a>
                </div>
            </c:forEach>
        </div>
    </div>
    <div class="index-title">
        <a href="">电器日用</a>
        <hr class="hr1">
        <hr class="hr2">
    </div>
    <div class="waterfoo stark-components row">
        <div class="item-wrapper normal">
            <c:forEach var="item" items="${catelogGoods3}">
                <div class="card col">
                    <a href="<%=basePath%>goods/goodsId/${item.goods.id}">
                        <div class="card-image">
                            <img src="../upload/${item.images[0].imgUrl}" />
                        </div>
                        <div class="card-content item-price"><c:out value="${item.goods.price}"></c:out></div>
                        <div class="card-content item-name">
                            <p><c:out value="${item.goods.name}"></c:out></p>
                        </div>
                        <div class="card-content item-location">
                            <p>鲁东大学</p>
                            <p><c:out value="${item.goods.startTime}"></c:out></p>
                        </div>
                    </a>
                </div>
            </c:forEach>
        </div>
    </div>
    <div class="index-title">
        <a href="">图书教材</a>
        <hr class="hr1">
        <hr class="hr2">
    </div>
    <div class="waterfoo stark-components row">
        <div class="item-wrapper normal">
            <c:forEach var="item" items="${catelogGoods4}">
                <div class="card col">
                    <a href="<%=basePath%>goods/goodsId/${item.goods.id}">
                        <div class="card-image">
                            <img src="../upload/${item.images[0].imgUrl}" />
                        </div>
                        <div class="card-content item-price"><c:out value="${item.goods.price}"></c:out></div>
                        <div class="card-content item-name">
                            <p><c:out value="${item.goods.name}"></c:out></p>
                        </div>
                        <div class="card-content item-location">
                            <p>鲁东大学</p>
                            <p><c:out value="${item.goods.startTime}"></c:out></p>
                        </div>
                    </a>
                </div>
            </c:forEach>
        </div>
    </div>
    <div class="index-title">
        <a href="">美妆衣物</a>
        <hr class="hr1">
        <hr class="hr2">
    </div>
    <div class="waterfoo stark-components row">
        <div class="item-wrapper normal">
            <c:forEach var="item" items="${catelogGoods5}">
                <div class="card col">
                    <a href="<%=basePath%>goods/goodsId/${item.goods.id}">
                        <div class="card-image">
                            <img src="../upload/${item.images[0].imgUrl}" />
                        </div>
                        <div class="card-content item-price"><c:out value="${item.goods.price}"></c:out></div>
                        <div class="card-content item-name">
                            <p><c:out value="${item.goods.name}"></c:out></p>
                        </div>
                        <div class="card-content item-location">
                            <p>鲁东大学</p>
                            <p><c:out value="${item.goods.startTime}"></c:out></p>
                        </div>
                    </a>
                </div>
            </c:forEach>
        </div>
    </div>
    <div class="index-title">
        <a href="">运动棋牌</a>
        <hr class="hr1">
        <hr class="hr2">
    </div>
    <div class="waterfoo stark-components row">
        <div class="item-wrapper normal">
            <c:forEach var="item" items="${catelogGoods6}">
                <div class="card col">
                    <a href="<%=basePath%>goods/goodsId/${item.goods.id}">
                        <div class="card-image">
                            <img src="../upload/${item.images[0].imgUrl}" />
                        </div>
                        <div class="card-content item-price"><c:out value="${item.goods.price}"></c:out></div>
                        <div class="card-content item-name">
                            <p><c:out value="${item.goods.name}"></c:out></p>
                        </div>
                        <div class="card-content item-location">
                            <p>鲁东大学</p>
                            <p><c:out value="${item.goods.startTime}"></c:out></p>
                        </div>
                    </a>
                </div>
            </c:forEach>
        </div>
    </div>
    <div class="index-title">
        <a href="">票券小物</a>
        <hr class="hr1">
        <hr class="hr2">
    </div>
    <div class="waterfoo stark-components row">
        <div class="item-wrapper normal">
            <c:forEach var="item" items="${catelogGoods7}">
                <div class="card col">
                    <a href="<%=basePath%>goods/goodsId/${item.goods.id}">
                        <div class="card-image">
                            <img src="../upload/${item.images[0].imgUrl}" />
                        </div>
                        <div class="card-content item-price"><c:out value="${item.goods.price}"></c:out></div>
                        <div class="card-content item-name">
                            <p><c:out value="${item.goods.name}"></c:out></p>
                        </div>
                        <div class="card-content item-location">
                            <p>鲁东大学</p>
                            <p><c:out value="${item.goods.startTime}"></c:out></p>
                        </div>
                    </a>
                </div>
            </c:forEach>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
    (function(){
        var $wrap=$("#wrap"),
            $pages=$("#product_list").find(".product_box"),
            $controlBox=$("#control_box"),
            $productBtns=$("#product_btns"),
            $controls=$controlBox.find("a"),
            $icLine=$("#ic_line"),
            $listTops=$("#list_top").find("li"),
            $hNav=$("#h_nav"),
            $hNavli=$hNav.find("li"),
            $hSubnav=$("#h_subnav"),
            $hSubDD=$hSubnav.find("dd"),
            $hBdot=$("#h_bdot"),
            $hSdot=$("#h_sdot"),
            $footer=$("#footer"),
            $bgs=$pages.find(".bg_box img"),
            $mainBoxs=$pages.find(".main_box"),
            $moreNav=$("#more_nav"),
            $rptBg=$("#rpt_bg");
        var data={
            pLength:$pages.length,
            curP:0,
            isCan:true,
            isOnbtn:false,
            fColor:[2,2,1,1,1],
            dur: 3500,
            cNum:0
        };
        var aDD=$controls.eq(0).width()+parseInt($controls.eq(0).css("margin-right").slice(0,-2))*2;
        var cId;
        var isCss3=function(){
            var style=document.createElement("div").style;
            for(var k in style){
                if(k.toLowerCase().indexOf("animation")>0){
                    return true;
                }
            }
            return false;
        }();
        var isIE6=navigator.userAgent.indexOf("MSIE 6.0") > 0;
        //页面自缩放
        var resize=function(){
            var w=$(window).width(),
                h=$(window).height();
            $wrap.height(h);
            $moreNav.height(h);
            if(w/h<1920/1080){
                $bgs.height(h).css({width:"auto",margin:-.5*h+"px 0 0 "+-.5*1920/1080*h+"px"});
            }else{
                $bgs.width(w).css({height:"auto",margin:-.5*w*1080/1920+"px 0 0 "+-.5*w+"px"});
            }
            var imgH=$bgs.height();
            $mainBoxs.height(imgH).css("margin-top",-.5*imgH+"px");
            var cls;
            if(isCss3){
                document.getElementById("wrap").className="wrap big_view xbig";
                switch(true){
                    case w>=1920:{cls="";break;}
                    case w<1920&&w>=1680:{cls="small9";break;}
                    case w<1680&&w>=1600:{cls="small8";break;}
                    case w<1600&&w>=1536:{cls="small7";break;}
                    case w<1536&&w>=1440:{cls="small6";break;}
                    case w<1440&&w>=1366:{cls="small5";break;}
                    case w<1366&&w>=1280:{cls="small4";break;}
                    case w<1280&&w>=1024:{cls="small3";break;}
                    case w<1024:{cls="small2";break;}
                }
                for(var i=0;i<data.pLength;i++){
                    $pages.eq(i).find(".content").attr("class","content "+cls);
                }
                $productBtns.find(".content").attr("class","content "+cls);
            }else{
                switch(true){
                    case w>=1600:{cls="big_view";break;}
                    case w<1600&&w>=1440:{cls="mid_view";break;}
                    case w<1440:{cls="small_view";break;}
                }
                var ws=$wrap[0].className;
                if(isIE6&&(ws.indexOf("big")!=-1||ws.indexOf("mid")!=-1||ws.indexOf("small")!=-1)&&ws.indexOf(cls)==-1)
                    location.reload();
                wrap.className="wrap "+cls;
            }
            aDD=$controls.eq(0).width()+parseInt($controls.eq(0).css("margin-right").slice(0,-2))*2;
        };
        $(window).resize(resize);
        resize();

        var pageChange=function(idx){
            if(data.isOnbtn)
                return;
            if(idx>=-1&&idx<data.pLength&&idx!=data.curP&&data.isCan){
                data.isCan=false;
                data.cNum++;
                clearInterval(cId);
                idx=idx==-1?data.pLength-1:idx;
                $controls.removeClass("cur").eq(idx).addClass("cur");
                $pages.eq(data.curP).css({zIndex:0});
                $icLine.css({left:aDD*idx});
                // $footer.attr("class","footer f_color"+data.fColor[idx]);
                $pages.eq(idx).addClass("show").css({opacity:0,zIndex:1}).animate({opacity:1},400,function(){
                    $pages.eq(data.curP).removeClass("show");
                    $(this).addClass("show");
                    data.isCan=true;
                    data.curP=idx;
                    data.cNum--;
                    if(data.cNum==0){
                        cId=setInterval(function(){
                            pageChange((data.curP+1)%data.pLength);
                        },data.dur);
                    }
                });
            }
        }
        $controls.on("mouseenter",function(){
            data.isCan=true;
            pageChange($controls.index(this));
            $icLine.css({left:aDD*$controls.index(this)});
            data.isOnbtn=true;
        });
        $controls.on("mouseleave",function(){
            data.isOnbtn=false;
        });

        var isBottom=false;
        var bAni;
        var bottomHide=function(){
            if(isBottom){
                isBottom=false;
                if(bAni)
                    clearTimeout(bAni),bAni=null;
                $footer.removeClass("show");
                $productBtns.removeClass("show");
                $rptBg.removeClass("show");
            }
        }
        var bottomShow=function(){
            if(!isBottom){
                isBottom=true;
                $footer.addClass("show");
                $productBtns.addClass("show");
                $rptBg.addClass("show");
                if(bAni)
                    clearTimeout(bAni);
                bAni=setTimeout(bottomHide,2000);
            }
        }
        $footer.on("mouseenter",function(){
            if(bAni)
                clearTimeout(bAni),bAni=null;
        });
        $footer.on("mouseleave",function(){
            if(bAni)
                clearTimeout(bAni);
            bAni=setTimeout(bottomHide,2000);
        });
        $(document).on("mousewheel DOMMouseScroll",function(event){
            var sd=event.originalEvent.wheelDelta||event.originalEvent.detail*-1;
            if(sd>0){
                bottomHide();
            }
            else{
                bottomShow();
            }
        });
        cId=setInterval(function(){
            pageChange((data.curP+1)%data.pLength);
        },data.dur);

        //导航事件

        $("#nav_more").on("mouseenter",function(){
            $moreNav.addClass("show");
        });
        $moreNav.on("mouseleave",function(){
            $moreNav.removeClass("show");
            $hBdot.css({left:-9999,top:106});
        })
        $hNavli.on("mouseenter",function(){
            $hBdot.css({left:18,top:106+$hNavli.index(this)*69});
        });
        $hNav.on("mouseleave",function(){
            $hBdot.css({left:-9999});
        });
        $hSubnav.find("dt").on("mouseenter",function(){
            $hBdot.css({left:18});
            $hSdot.css({left:-9999});
        });
        $hSubDD.on("mouseenter",function(){
            $hSdot.css({left:18,top:53+$hSubDD.index(this)*44});
            $hBdot.css({left:-9999});
        });
        $hSubnav.on("mouseleave",function(){
            $hSdot.css({left:-9999});
        });
    })();
</script>
</html>