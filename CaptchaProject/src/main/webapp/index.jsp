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
        <div class="jumbotron text-center">
            <h1 class="bold">Java Captcha Poject</h1>
            <p>Only Humans allowed!...</p>
        </div>
        <div class="col-md-6 col-md-offset-3">
            <div class="panel panel-default">
                <div class="panel-heading text-center">
                    <% if(request.getSession().getAttribute("msg") != null){ %>
                    <div class="alert alert-danger">
                        <p class="bold text-center">${messages.msg}</p>
                    </div>
                    <%} %>
                    <p class="bold">Please fill the form correctly</p>
                </div>
                <form method="post" action="FormMaster">
                    <div class="panel-body">
                        <div class="form-group">
                            <label for="name">Name:</label>
                            <input type="text" name="name" value="${param.name}" class="form-control" placeholder="Name" required=""/>
                            <!--<label class="incorrect" for="name">${messages.nameIncorrect}</label>-->
                        </div>

                        <div class="form-group">
                            <label for="email">Email:</label>
                            <input type="email" name="email" class="form-control" value="${param.email}" placeholder="Email" required/>
                            <!--<label class="incorrect" for="email">${messages.emailIncorrect}</label>-->
                        </div>
                        
                        <div class="form-group">
                            <label for="phone">Phone:</label>
                            <input type="number" name="phone" value="${param.phone}" class="form-control" placeholder="Phone" required=""/>
                        </div>
                        
                        <div class="form-group">
                            <label for="phone">Password:</label>
                            <input type="password" name="password" value="${param.password}" class="form-control" placeholder="Password" required=""/>
                        </div>
                        
                        <%
                            if (request.getSession().getAttribute("isCaptchaSolved") == null) {
                        %>
                        <div class="form-group">
                            <label for="captchaCode" class="prompt">Retype the characters from the picture:</label>

                            <!-- Adding BotDetect Captcha to the page -->
                            <botDetect:captcha id="formCaptcha" 
                                        userInputID="captchaCode"
                                        codeLength="3"
                                        imageWidth="150"
                                        imageStyle="GRAFFITI2" />

                            <div class="validationDiv">
                                <input id="captchaCode" type="text" name="captchaCode" class="form-control" placeholder="Enter captcha code" required=""/>
                                <label class="incorrect" for="captchaCode">${messages.captchaIncorrect}</label>
                            </div>
                        </div>
                                
                        <%
                            }
                        %>

                        <!--<div class="input">
                            <label for="message">Short message:</label>
                            <textarea class="inputbox" name="message" rows="5" cols="40">${param.message}</textarea>
                            <label class="incorrect" for="message">${messages.messageIncorrect}</label>
                        </div>-->
                    </div>
                    <div class="panel-footer">
                        <input type="submit" name="submitButton" id="submitButton" value="Submit" class="btn btn-primary"/>
                    </div>
                 
                </form>
            </div>
            
        </div>
    </div>
</body>
</html>
