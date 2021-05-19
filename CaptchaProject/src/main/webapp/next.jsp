<%@page import="com.captcha.botdetect.web.servlet.Captcha"%>
<%@page trimDirectiveWhitespaces="true"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="botDetect" uri="https://captcha.com/java/jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Captcha Project</title>
    <link rel="stylesheet" href="./asset/css/bootstrap.min.css"/>
    <!--<link rel="stylesheet" href="stylesheet.css" type="text/css" />-->
    <link rel="stylesheet" href="./asset/css/style.css" type="text/css" />
</head>
<body>
    <div class="container">
        <div class="jumbotron">
            <h1 class="bold text-center">Java Captcha Poject</h1>
            <p class="text-center">Congrats! Indeed you are human.</p>
            <br>
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <p class="text-center bold">User Registration Details</p>
                </div>
                <div class="panel panel-body">
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Name</th>
                                <th>Email</th>
                                <th>Phone</th>
                                <th>Password</th>
                                <th>Date</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>${name}</td>
                                <td>${email}</td>
                                <td>${phone}</td>
                                <td>${password}</td>
                                <td>${time}</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="panel-footer">
                    <a class="btn btn-link" href="/CaptchaProject">Close</a>
                </div>
            </div>
        </div>
        
        <div class="col-md-6 col-md-offset-3">
            
        </div>
    </div>
</body>
</html>
