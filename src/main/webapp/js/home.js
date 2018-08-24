
$(function(){
    $(".loadIMG").hide();
    $("#alertBack").hide();
    $("#seeProductResourceDiv").hide();
    $("#seeGiftLogResourceDiv").hide();
    $("#addProductResourceDiv").hide();
    $("#managerGiftLogResourceDiv").hide();


    $("#seeProductResource").click(function(){
        //清空input
        $("table input").each(function (index,element) {
            $(this).val("");
        });
        //移除资源附件
        $(".trfile").each(function (index,element) {
            $(this).remove();
        });
        $("#seeProductResourceDiv").show();
        $("#seeGiftLogResourceDiv").hide();
        $("#addProductResourceDiv").hide();
        $("#managerGiftLogResourceDiv").hide();
        var seeProductResource='seeProductResource.go';
        $(".loadIMG").show();
        $.ajax({
            url:seeProductResource,
            type:"GET",
            dataType:"json",
            success:function(msg){
                $(".loadIMG").hide();
                $(".urlword").parent().parent().remove();
                $.each(msg,function(index,obj){
                    var data="<tr class='trs'><td>"+obj.title+"</td><td><a class='urlword' href='http://wx.sterorea.me/Product/View.aspx?id="+obj.id+"'>"+'http://wx.sterorea.me/Product/View.aspx?id='+obj.id+"</a></td></tr>"
                    $("#productDataShow").append(data);
                });
            },
            error:function(){
                $(".loadIMG").hide();
                alert("系统操作繁忙，请稍后再试！")
            }
        })
    })
    $("#seeGiftLogResource").click(function(){
        $("table input").each(function (index,element) {
            $(this).val("");
        });
        $(".trfile").each(function (index,element) {
            $(this).remove();
        });
        $("#seeProductResourceDiv").hide();
        $("#seeGiftLogResourceDiv").show();
        $("#addProductResourceDiv").hide();
        $("#managerGiftLogResourceDiv").hide();
        $("#seeGiftLogResourceDiv h6").show();
        $(".GiftLogDataShow tbody").empty();
        $(".giftMsgTab").css("height","92%");
        var seeGiftLogResource="seeGiftLogResource.go";
        $(".loadIMG").show();
        $.ajax({
            url:seeGiftLogResource,
            type:"POST",
            dataType:"json",
            success:function(msg){
                $(".loadIMG").hide();
                $.each(msg,function(index,obj){
                    var begin="<tr class='trs'>";
                    var cent="";
                    var end="</tr>";
                    $(".GiftLogDataShow thead td").each(function (index, element) {
                        var elementid = $(element).attr("id");
                        var td="<td>";
                        for(var t in obj){
                            if(t.toUpperCase()==elementid.toUpperCase()){
                                cent=obj[t];
                            }
                        }
                        begin = begin + td + cent + "</td>";
                    })
                    var data = begin + end;
                    $(".GiftLogDataShow tbody").append(data);
                })
            },
            error:function(){
                $(".loadIMG").hide();
                alert("系统操作繁忙，请稍后再试！")
            }
        })

    })
    $("#addProductResource").click(function(){
        $("table input").each(function (index,element) {
            $(this).val("");
        });
        $(".trfile").each(function (index,element) {
            $(this).remove();
        });
        $("#seeProductResourceDiv").hide();
        $("#seeGiftLogResourceDiv").hide()
        $("#addProductResourceDiv").show();
        $("#managerGiftLogResourceDiv").hide();
    })
    $("#managerGiftLogResource").click(function(){
        $("table input").each(function (index,element) {
            $(this).val("");
        });
        $(".trfile").each(function (index,element) {
            $(this).remove();
        });
        $("#seeProductResourceDiv").hide();
        $("#seeGiftLogResourceDiv").hide()
        $("#addProductResourceDiv").hide();
        $("#managerGiftLogResourceDiv").show();
        $(".GiftLogDataShow tbody").empty();
        $("#seeGiftLogResourceDiv").show();
        $("#seeGiftLogResourceDiv h6").hide();
        $(".giftMsgTab").css("height","57%");
    })
    $(".sysTip").click(function(){
        $(".sysMessage").text("");
        $("#alertBack").hide();
    })
    $("#headIMG").click(function(){
        $("#loginout").toggle()
    })

});

function alert(message) {
    $(".sysMessage").text(message);
    $("#alertBack").show();
}