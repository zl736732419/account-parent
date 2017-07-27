<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE HTML>
<html>
<base href="<%=basePath%>">
<head>
    <jsp:include page="commons/meta.jsp">
        <jsp:param name="extra" value="validate_supersized"/>
    </jsp:include>
    <title>权限系统</title>
    <meta name="keywords" content="权限系统">
    <link href="app/styles/commons.css" rel="stylesheet" type="text/css"/>
    <link href="app/styles/login.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="containBox">
    <jsp:include page="commons/navbar.jsp">
        <jsp:param name="title" value="用户登录"/>
    </jsp:include>
    <div class="wap-container">
        <div class="container ui-sortable">
            <div class="row cl">
                <div class="col-md-3 col-md-offset-4 col-xs-8 col-xs-offset-2 login-panel">
                    <h4 class="form-header">用户登录</h4>
                    <form class="login-form" id="login-form" action="" method="post" class="form form-horizontal responsive" >
                        <div class="row cl row-item">
                            <div class="formControls">
                                <input type="text" class="input-text size-XL form-input" name="username" id="username" placeholder="用户名">
                            </div>
                        </div>
                        <div class="row cl row-item">
                            <div class="formControls">
                                <input type="password" class="input-text size-XL form-input" autocomplete="off" onpaste="return false;"
                                       oncopy="return false;" name="password" id="password" placeholder="密码">
                            </div>
                        </div>
                        <div class="row cl row-item">
                            <div class="formControls col-xs-8 validate-code-input">
                                <input type="text" class="input-text size-XL form-input" autocomplete="off" id="validateCode" name="validateCode" placeholder="验证码">
                            </div>
                            <div class="formControls col-xs-4 validate-code-img" title="换一换">
                                <img class="img-code" src="<%=basePath%>verify/image" onclick="createNewImage(this)" width="100%" height="100%">
                            </div>
                        </div>
                        <div class="row cl row-item">
                            <div>
                                <input class="btn btn-block btn-success size-XL" type="submit" value="&nbsp;&nbsp;登录&nbsp;&nbsp;">
                            </div>
                            <div class="register-tip">
                                <a href="<%=basePath%>login">没有账号，去注册>></a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>

<script>

    $().ready(function () {
        layer.alert('Hello layer');
        validateForm();
    });

    // 表单验证
    function validateForm() {
        $("#register-form").validate({
            submitHandler:function(form){
                form.submit();
            },
            rules: {
                username: {
                    required: true,
                    minlength: 4,
                    maxlength: 20
                },
                password: {
                    required: true,
                    minlength: 6,
                    maxlength: 20
                }
            },
            // jquery validate验证表单提交
            submitHandler: function(form){
                var url = '<%=basePath%>login';
                var data = $('#login-form').serializeForm();
                $.ajaxwrapper.postForm(url, data, function () {
                    
                });
            }
        });
    }

    // 生成新的验证码
    function createNewImage(img) {
        var url = $(img).attr('src');
        var index = url.indexOf("?");
        var prefix = url;
        if (index != -1) {
            prefix = url.substring(0, index);
        }

        $(img)[0].src = prefix + "?time=" + new Date().getTime();
    }
</script>
</html>

