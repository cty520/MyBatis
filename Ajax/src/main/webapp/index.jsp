<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript"src="js/jqurery-1.12.4.js"></script>
    <script type="text/javascript"></script>
     var data={"name":"微冷的雨","age":20,"address":"河南安阳"};

    var data=[{"name":"微冷的雨","age":20,"address":"北京上地"},
    {"name":"微热的翔","age":22,"address":"河南郑州"}]

    var userArray = [ {
    "id" : 2,
    "name" : "admin",
    "pwd" : "123"
    }, {
    "id" : 3,
    "name" : "詹姆斯",
    "pwd" : "11111"
    }, {
    "id" : 4,
    "name" : "梅西",
    "pwd" : "6666"
    } ];

    var $table = $("<table border='1'></table>")
    //在table内部追加一行  tr
    .append("<tr><td>ID</td><td>用户名</td><td>密码</td></tr>");
    $.each(userArray,function(i,dom) {
    $table.append("<tr><td>" + dom.id + "</td><td>"
    + dom.name + "</td><td>"
    + dom.pwd + "</td></tr>");
    });



    $("#objectArrayDiv").append($table);
</head>
<body>

</body>
</html>
