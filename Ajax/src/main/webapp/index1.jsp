<%--
  Created by IntelliJ IDEA.
  User: adminastrator
  Date: 2017/10/5
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>





<html>
<head>

    <title>Title</title>
    <script type="text/javascript"src="js/jqurery.js"></script>
    <script type="text/javascript">
    $(function(){
         $("[name=uname]").blur(function() {

              new Ajax();
         });
         });
        function newAjax (){
        $.ajax({
            url:"/FirstServlet",
             type:"Post",
            date:{"uname":$("[name=uname]").val()},
            async:true,
            success:function (data) {
                $("#msg").html(data);
            }

        })
    }

    function oldAjax() {

    }
    </script>
</head>
<body>

</body>
</html>
