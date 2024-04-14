<%-- 
    Document   : account
    Created on : Mar 16, 2024, 1:49:24 PM
    Author     : SAD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng nhập ,đăng ký thành viên</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/prettyPhoto.css" rel="stylesheet">
        <link href="css/price-range.css" rel="stylesheet">
        <link href="css/animate.css" rel="stylesheet">
        <link href="css/main.css" rel="stylesheet">
        <link href="css/responsive.css" rel="stylesheet">
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.scrollUp.min.js"></script>
        <script src="js/price-range.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </head>
    <body>
        <%
            String tenTaiKhoanErr="",tenDangNhapErr="",matKhauErr="";
            if(request.getAttribute("tenTaiKhoanErr") != null){
                tenTaiKhoanErr = (String)  request.getAttribute("tenTaiKhoanErr");
            }
            if(request.getAttribute("tenDangNhapErr") != null){
                tenDangNhapErr = (String)  request.getAttribute("tenDangNhapErr");
            }
             if(request.getAttribute("matKhauErr") != null){
                matKhauErr = (String)  request.getAttribute("matKhauErr");
            }
             String tenTaiKhoan="",tenDangNhap="",matKhau="";
             if(request.getAttribute("tenTaiKhoan") != null){
                tenTaiKhoan = (String)  request.getAttribute("tenTaiKhoan");
            }
            if(request.getAttribute("tenDangNhap") != null){
                tenDangNhap = (String)  request.getAttribute("tenDangNhap");
            }
             if(request.getAttribute("matKhau") != null){
                matKhau = (String)  request.getAttribute("matKhau");
            }
            String err ="";
          if(request.getAttribute("err") != null){
                err = (String) request.getAttribute("err");
            }
        %>
        <jsp:include page="header.jsp"></jsp:include>

            <section id="form"><!--form-->
                <div class="container">
                    <div class="row">
                        <div class="col-sm-4 col-sm-offset-1">
                            <div class="login-form"><!--login form-->
                                <h2>Đăng nhập hệ thống</h2>
                                <form action="DangNhapServlet" method="post">
                                     <p style="color :red"> <%=err%></p>
                                    <input type="email" placeholder="Địa chỉ email đăng nhập" name ="tenDangNhap" />                                    
                                    <input type="password" placeholder="Mật khẩu đăng nhập" name="matKhau" />
                                    <span>
                                        <input type="checkbox" class="checkbox"> 
                                        Duy trì đăng nhập
                                    </span>
                                    <button type="submit" class="btn btn-default">Đăng nhập</button>
                                </form>
                            </div><!--/login form-->
                        </div>
                        <div class="col-sm-1">
                            <h2 class="or">hoặc</h2>
                        </div>
                        <div class="col-sm-4">
                            <div class="signup-form" ><!--sign up form-->
                                <h2>Đăng ký thành viên</h2>
                                <form action="DangKyServlet" method="post">
                                <p style="color :red"> <%=tenTaiKhoanErr%></p>
                                <input type="text" placeholder="Tên Tài Khoản" name="tenTaiKhoan" value="<%=tenTaiKhoan%>"/>
                                <p style="color :red"> <%=tenDangNhapErr%></p>
                                <input type="email" placeholder="Địa chỉ Email đăng ký" name ="tenDangNhap" value="<%=tenDangNhap%>"/>
                                <p style="color :red"> <%=matKhauErr%></p>
                                <input type="password" placeholder="Mật khẩu" name ="matKhau" value ="<%=matKhau%>"/>
                                <button type="submit" class="btn btn-default">Đăng ký</button>
                            </form>
                        </div><!--/sign up form-->
                    </div>
                </div>
            </div>
        </section><!--/form-->

        <jsp:include page="footer.jsp"></jsp:include>  

    </body>
</html>
