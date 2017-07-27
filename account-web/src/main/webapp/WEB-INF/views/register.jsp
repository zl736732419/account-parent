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
        <jsp:param name="extra" value="validate"/>
    </jsp:include>
    <title>权限系统</title>
    <meta name="keywords" content="权限系统">
    <link href="app/styles/register.css" rel="stylesheet" type="text/css"/>
    <link href="app/styles/commons.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <div class="containBox">
        <jsp:include page="commons/navbar.jsp">
            <jsp:param name="title" value="用户注册"/>
        </jsp:include>
        <div class="wap-container">
            <div class="container ui-sortable">
                <div class="row cl">
                    <div class="col-md-3 col-md-offset-4 col-xs-8 col-xs-offset-2">
                        <h4 class="form-header">用户注册</h4>
                        <form class="register-form" id="register-form" action="" method="post" class="form form-horizontal responsive" >
                            <div class="row cl row-item">
                                <div class="formControls">
                                    <input type="text" class="input-text size-XL" name="username" id="username">
                                    <span class="register-label" data-left="60">用户名</span>
                                </div>
                            </div>
                            <div class="row cl row-item">
                                <div class="formControls">
                                    <input type="password" class="input-text size-XL" autocomplete="off" onpaste="return false;"
                                           oncopy="return false;" name="password" id="password">
                                    <span class="register-label" data-left="48">密码</span>
                                </div>
                            </div>
                            <div class="row cl row-item">
                                <div class="formControls">
                                    <input type="password" class="input-text size-XL" autocomplete="off" onpaste="return false;"
                                           name="confirmPwd" id="confirmPwd">
                                    <span class="register-label" data-left="72">确认密码</span>
                                </div>
                            </div>
                            <div class="row cl row-item">
                                <div class="formControls">
                                    <input type="text" class="input-text size-XL" name="email" id="email" autocomplete="off">
                                    <span class="register-label" data-left="48">邮箱</span>
                                </div>
                            </div>
                            <div class="row cl row-item">
                                <div class="formControls">
                                    <input type="text" class="input-text size-XL" autocomplete="off" name="telephone" id="telephone">
                                    <span class="register-label" data-left="60">手机号</span>
                                </div>
                            </div>
    
                            <div class="row cl row-item">
                                <div class="formControls col-xs-8 validate-code-input">
                                    <input type="text" class="input-text size-XL" autocomplete="off" id="validateCode" name="validateCode">
                                    <span class="register-label" data-left="60">验证码</span>
                                </div>
                                <div class="formControls col-xs-4 validate-code-img" title="换一换">
                                    <img class="img-code" src="<%=basePath%>verify/image" onclick="createNewImage(this)">
                                </div>
                            </div>
                            <div class="row cl row-item">
                                <div>
                                    <input class="btn btn-block btn-danger size-XL" type="submit" value="&nbsp;&nbsp;点击注册&nbsp;&nbsp;">
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
        animateLabel();
        validateForm();
    });
    
    // 选中某一个输入框时，将标签左移
    function animateLabel() {
        $('#register-form').find('input').on('focus', function () {
            var $input = $(this);
            var $label = $input.parents('.row-item').find('.register-label');
            var left = parseInt($label.css('left'));
            if (left >= 0) {
                var left = -$label.data('left');
                $label.css({
                    left: left + 'px'
                });
            }
        });
    }
    
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
                },
                confirmPwd: {
                    required: true,
                    minlength: 6,
                    maxlength: 20,
                    equalTo: '#password'
                },
                email: {
                    required: true,
                    email: true
                },
                telephone: {
                    required: true,
                    telephone: true
                }
            },
            // jquery validate验证表单提交
            submitHandler: function(form){
                var url = '<%=basePath%>register';
                var data = $('#register-form').serializeForm();
                $.ajaxwrapper.postForm(url, data, function (data) {
                    if (!data.success) {
                        
                    }
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
