$(function(){
    //初始化复选框触发样式
    if($("[name='checkbox']").attr("checked")=="checked"){
        $(".sub_button").css("background-color","#1C86EE");
        $(".sub_button").attr("disabled",false);
    }else{
        $(".sub_button").css("background-color","#7b8188");
        $(".sub_button").attr("disabled",true);
    }
    //隐藏alert时候启用input
    $("#alertBack").hide();
    $("input").attr("disable",false);

    //input聚焦触发
    $(".submit_form input").focus(function(){
        $(".error").text("");
    })
    $("#username").focus(function(){
        if($(this).val().indexOf("请输入")!=-1){
            $(this).val("");
        }
    });
    $("#username").blur(function(){
        if($(this).val().trim().length<1){
            $(this).val("请输入您的用户名");
        }
    });

    //回车监听
    $(document).keypress(function(e) {
        var eCode = e.keyCode ? e.keyCode : e.which ? e.which : e.charCode;
        if (eCode == 13){
            if($("#alertBack").is(":visible")){
                $(".sysMessage").text("");
                $("#alertBack").hide();
            }else {
                toSubmit();
            }
        }
    });
    //alert确认事件
    $(".sysTip").click(function(){
        $(".sysMessage").text("");
        $("#alertBack").hide();
        $("input").attr("disable",false);
    })
    $("[name='checkbox']").click(function(){
        if($(this).attr("checked")=="checked"){
            $(".sub_button").css("background-color","#1C86EE");
            $(".sub_button").attr("disabled",false);
        }else{
            $(".sub_button").css("background-color","#7b8188");
            $(".sub_button").attr("disabled",true);
        }
    })
})

//表单提交
function toSubmit(){
    var userN=false;
    var userP=false;
    var check=false;
    var reginx = /^[a-zA-Z0-9_-]{4,16}$/;
    //用户名密码验证
    if(($("#username").val().trim()).length>4 && ($("#username").val().trim()).length<16 && ($("#username").val()).indexOf("请输入")==-1){
        if(reginx.test($("#username").val())){
            userN=true;
            if(($("#userpwd").val().length>5) && $("#userpwd").val().length<11){
                userP=true;
                //复选框
                if($("[name='checkbox']").attr("checked")=="checked"){
                    check=true;
                }else{
                    alert("请勾选左下角确认操作！")
                }
            }else{
                alert("请输入6-10位的非空密码");
            }
        }else{
            alert("请输入4-16位正确格式的用户名");
        }
    }else{
        alert("请输入4-16位正确格式的用户名");
    }
    if(userN && userP && check){
        $(".submit_form").submit();
    }
}

//alert弹出
function alert(message) {
    $(".sysMessage").text(message);
    $("#alertBack").show();
    $("input").attr("disable",true);
}