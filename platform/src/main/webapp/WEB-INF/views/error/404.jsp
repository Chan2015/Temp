<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html class="error-page">
    <head>
        <title>404 error page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- Bootstrap -->
        <link rel="stylesheet" media="screen" href="${ctx}/static/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" media="screen" href="${ctx}static/bootstrap/css/bootstrap-theme.min.css">

        <!-- Bootstrap Admin Theme -->
        <link rel="stylesheet" media="screen" href="${ctx}/static/bootstrap/css/bootstrap-admin-theme.css">
        <link rel="stylesheet" media="screen" href="${ctx}/static/bootstrap/bootstrap-admin-theme-change-size.css">

        <!-- Bootstrap Error Page -->
        <link rel="stylesheet" media="screen" href="${ctx}/static/bootstrap/css/bootstrap-error-page.css">

        <script type="text/javascript" src="${ctx}/static/jquery/jquery-2.0.3.min.js"></script>
        <script type="text/javascript" src="${ctx}/static/bootstrap/scripts/bootstrap-admin-theme-change-size.js"></script>

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
           <script type="text/javascript" src="js/html5shiv.js"></script>
           <script type="text/javascript" src="js/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <!-- content -->
        <div class="container-fluid">
            <div class="row-fluid">
                <div class="col-lg-12">
                    <div class="centering text-center">
                        <div class="text-center">
                            <h2 class="without-margin">Don't worry. It's <span class="text-success"><big>404</big></span> error only.</h2>
                            <h4 class="text-success">Page not found</h4>
                        </div>
                        <div class="text-center">
                            <h3><small>Choose an option below</small></h3>
                        </div>
                        <hr>
                    </div>
                </div>
            </div>
        </div>

        <!-- footer -->
        <div class="navbar navbar-footer navbar-fixed-bottom">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <footer role="contentinfo">
                            <p class="left">Sinodata</p>
                            <p class="right">&copy; 2015</p>
                        </footer>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
