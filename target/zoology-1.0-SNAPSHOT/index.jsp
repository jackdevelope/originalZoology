<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/1/10
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            $.ajax({
                url :"http://localhost:8080/zoology_war_exploded//departmentSelAll",
                type:"GET",
                contentType :"application/json;charset=utf-8",
                date :{
                    sign :"successful",
                },
                success :function (result) {
                    //将得到的前台数据转换为json
                    /*var message = JSON.stringify(result);*/
                    alert("接受到的数据是：" + result);//输出默认的json字符串
                    if (result != null&&result != ""){
                        var message=eval("("+result+")");//万能转换,拿到对象
                        console.log(message);
                    }
                },
                error :function (result) {
                    console.log("错误!!")
                }
            });
        });
    </script>
</head>
<body>

</body>
</html>
