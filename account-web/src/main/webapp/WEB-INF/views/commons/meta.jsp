<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"%>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />

<link href="app/images/favicon.ico" rel="shortcut icon" type="image/x-icon" />
<!--[if lt IE 9]>
<script type="text/javascript" src="app/plugins/h-ui/lib/html5shiv.js"></script>
<script type="text/javascript" src="app/plugins/h-ui/lib/respond.min.js"></script>
<![endif]-->
<link href="app/plugins/h-ui/static/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="app/plugins/h-ui/lib/layer/2.4/skin/layer.css" rel="stylesheet" type="text/css" />
<link href="app/plugins/h-ui/lib/Hui-iconfont/1.0.8/iconfont.min.css" rel="stylesheet" type="text/css" />
<!--[if lt IE 9]>
<link href="app/plugins/h-ui/static/h-ui/css/H-ui.ie.css" rel="stylesheet" type="text/css"/>
<![endif]-->

<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<style type="text/css">
    .ui-sortable .panel-header{ cursor:move}
</style>
<!--jquery-->
<script type="text/javascript" src="app/plugins/jquery/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="app/scripts/commons/jquery.form.custom.js"></script>
<script type="text/javascript" src="app/scripts/commons/jquery.ajax.custom.js"></script>

<!--h-ui-->
<script type="text/javascript" src="app/plugins/h-ui/static/h-ui/js/H-ui.js"></script>
<script type="text/javascript" src="app/plugins/h-ui/lib/layer/2.4/layer.js"></script>

<%
    String extra = request.getParameter("extra");
%>

<%
    if(extra.contains("supersized")) { // 背景切换
%>
<link href="app/plugins/supersized/css/supersized.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="app/plugins/supersized/js/supersized.3.2.7.min.js"></script>
<script type="text/javascript" src="app/plugins/supersized/js/supersized-init.js"></script>
<%
    }
%>

<%
    if(extra.contains("validate")) { // jquery 验证
%>
<script type="text/javascript" src="app/plugins/h-ui/lib/jquery.validation/1.14.0/jquery.validate.min.js"></script>
<script type="text/javascript" src="app/plugins/h-ui/lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script type="text/javascript" src="app/plugins/h-ui/lib/jquery.validation/1.14.0/messages_zh.min.js"></script>
<script type="text/javascript" src="app/scripts/commons/jquery.validate.custom.js"></script>
<%
    }
%>




