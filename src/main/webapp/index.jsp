<%@ taglib prefix="fmt" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>

    </head>
    <body>
        <center>
            <!--上传图片、文件的代码-->
            <form action="${pageContext.request.contextPath}/imgUpload.go" method="post" enctype="multipart/form-data" >
                <input type="file" name="file">
                <input type="submit">
            </form>
            <!--接收-->
        </center>
    </body>
</html>
