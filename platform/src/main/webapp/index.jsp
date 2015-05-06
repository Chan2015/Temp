<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<c:set var="emailSuffix" value="@sinodata.net.cn" />

<!DOCTYPE html>
<html class="bootstrap-admin-vertical-centered">
    <head>
        <title>Platform Login Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Bootstrap -->
        <link rel="stylesheet" media="screen" href="${ctx}/static/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" media="screen" href="${ctx}/static/bootstrap/css/bootstrap-theme.min.css">
        <!-- Bootstrap Admin Theme -->
        <link rel="stylesheet" media="screen" href="${ctx}/static/bootstrap/css/bootstrap-admin-theme.css">

        <script type="text/javascript" src="${ctx}/static/jquery/jquery-2.0.3.min.js"></script>
        <script type="text/javascript" src="${ctx}/static/bootstrap/scripts/bootstrap.min.js"></script>

        <!-- Custom styles -->
        <style type="text/css">
            .alert{
                margin: 0 auto 20px;
            }
        </style>

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
           <script type="text/javascript" src="js/html5shiv.js"></script>
           <script type="text/javascript" src="js/respond.min.js"></script>
        <![endif]-->
    </head>
    <body class="bootstrap-admin-without-padding">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                	<div id="message"></div>
                    <form method="post" action="${ctx}/basic/index" class="bootstrap-admin-login-form">
                        <h1>Login</h1>
                        <div class="form-group">
                            <input class="form-control" type="text" name="name" placeholder="E-mail" style="width:188px; float:left">
                            <input class="form-control" type="text" readonly="true" placeholder="${emailSuffix}" style="width:150px">
                        </div>
                        <div class="form-group">
                            <input class="form-control" type="password" name="password" placeholder="Password">
                        </div>
                        <button class="btn btn-lg btn-primary" type="submit">Submit</button>
                    </form>
                </div>
            </div>
        </div>


        <script type="text/javascript">
            $(function() {
                // Setting focus
                $('input[name="email"]').focus();

                // Setting width of the alert box
                var alertClass = $('.alert');
                var formWidth = $('.bootstrap-admin-login-form').innerWidth();
                var alertPadding = parseInt($('.alert').css('padding'));

                if (isNaN(alertPadding)) {
                    alertPadding = parseInt($(alertClass).css('padding-left'));
                }
'<div class="alert alert-info"><a class="close" data-dismiss="alert" href="#">&times;</a>Press enter key or click the Submit button</div>';
                $('.alert').width(formWidth - 2 * alertPadding);
            });
        </script>
    </body>
</html>
