<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.3.1.min.js"></script>
<%
      String path = request.getContextPath();
      String basePath = request.getScheme() + "://"
                  + request.getServerName() + ":" + request.getServerPort()
                  + path + "/";
%>
<script type= "text/javascript" src= "<%=basePath %>js/jquery-3.3.1.min.js"></script >
<script type="text/javascript">
$(document).ready(function(){
      $("#btnlogin").click(function(){
            var json = {  
                    'id':$(':input[name=id]').val(),  
                'password':$(':input[name=password]').val()
                };
            var route = window.location.href;
                var postdata = JSON.stringify(json);//json对象转换json字符串
               // alert(postdata);
                $.ajax({  
                type : 'POST',  
                contentType : 'application/json;charset=UTF-8',//注意类型  
                processData : false,  
                url : '<%=path%>/login.do',  
                dataType : 'json',  
                data : postdata,  
                success : function(data) {  
                    alert('user : '+data.id+"登录成功");
                    window.location.href="/MVC/hello.do";
                },  
                error : function(err) {  
                    console.log(err.responseText);
                    alert("登录失败"); 
                    window.location.reload();
                }  
              }); 
      });
    });
</script>
<title>Insert title here</title>
</head>
<body>
<form id="form1" name="myform" method="post" action="login.do" >
      用户:<input type="text" name="id"/>
      密码:<input type="password" name="password"/>
     <input type="button" value="登录" id="btnlogin">  
     <input type="submit" value="nmsl"/>
 </form>
 姓名:${user.name}<br>
密码:${user.pwd}<br>
name:${name}<br>
</body>
</html>
