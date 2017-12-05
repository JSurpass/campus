// index页面初始化
$(function(){
    $(".qq").on("click",function(){
        alert("qq");
    });
    $(".wx").on("click",function(){
        alert("wx");
    });
    $(".wb").on("click",function(){
        alert("wb");
    });
});


function showLogin() {
    if($("#signup-show").css("display")=='block'){
        $("#signup-show").css("display","none");
    }
    if($("#login-show").css("display")=='none'){
        $("#login-show").css("display","block");
    }else{
        $("#login-show").css("display","none");
    }
}
function showSignup() {
    if($("#login-show").css("display")=='block'){
        $("#login-show").css("display","none");
    }
    if($("#signup-show").css("display")=='none'){
        $("#signup-show").css("display","block");
    }else{
        $("#signup-show").css("display","none");
    }
}
function ChangeName() {
    if($("#changeName").css("display")=='none'){
        $("#changeName").css("display","block");
    }else{
        $("#changeName").css("display","none");
    }
}

function ShowForget() {
    if($("#changeName").css("display")=='none'){
        $("#changeName").css("display","block");
    }else{
        $("#changeName").css("display","none");
    }
}