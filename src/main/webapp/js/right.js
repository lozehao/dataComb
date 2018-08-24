$(function(){
    $("#addFile").click(function(){
        $("#resourceAdd").append("<tr class='trfile'><td class='tabItem'>资&emsp;源&emsp;附&emsp;件:</td><td><input type='file' name='resourceFile'/><a class='filebats'>×</a></td></tr>")
    })
    $(".emptyDo").click(function(){
        $("#updataFrom input").each(function (index,element) {
            $(this).val("");
        })
    })
    $(".queryEmptyDo").click(function(){
        $("#queryDataFrom input").each(function (index,element) {
            $(this).val("");
        })
    })

    $(".filebats").live("click",function(){
       $(this).parents(".trfile").remove();})
    $(".datasubmit").click(function(){
        //表单验证
        var num=0;
        var sum=0;
        $("#resourceAdd input").each(function(index,element){
            var updata=$(this).val();
            if(updata==null || updata.trim().length<1){
                num++;
            }
        })
        if(num==0){
            $("[type='file']").each(function (index,element) {
                var filename=$(element).val();
                $("[type='file']").each(function (index,elements) {
                    var filenames=$(elements).val();
                    if(filename==filenames){
                        sum++;
                    }
                })
            })
            if(sum>3) {
                alert("请勿选择重复文件!")
            }else{
                $("#updataFrom").submit();
            }
        }else{
            alert("请输入必填项!")
        }
    })
    $(".queryDatasubmit").click(function(){
        //表单验证
        var num=0;
        $("#queryDataFrom input").each(function(index,element){
            var data=$(element).val();
            if(data==null || data.trim().length<1){
                num++;
            }
        })
        if(num<9){
                $(".GiftLogDataShow tbody").empty();
                var formjosn=$("#queryDataFrom").serializeArray();
                var formdata=transformToJson(formjosn);
                var dataurl="queryGiftLogData.go";
                $(".loadIMG").show();
                $.ajax({
                    url : dataurl,
                    type : 'post',
                    traditional : true,
                    data:formdata,
                    //data:JSON.stringify(formdata),
                    datatype : 'json',
                    contentType: 'application/x-www-form-urlencoded',
                    //contentType : 'application/json',
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
        }else{
            alert("至少输入一项查询条件!")
        }
    })

})
function transformToJson(formData){
    var obj={}
    for (var i in formData) {
        /*[{"name":"user","value":"hpc"},{"name":"pwd","value":"123"},{"name":"sex","value":"M"},{"name":"age","value":"100"},{"name":"phone","value":"13011112222"},{"name":"email","value":"xxx@xxx.com"}]
        */
        //下标为的i的name做为json对象的key，下标为的i的value做为json对象的value
        obj[formData[i].name]=formData[i]['value'];
    }
    return obj;
}