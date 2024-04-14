<%-- 
    Document   : details
    Created on : Mar 16, 2024, 1:25:43 PM
    Author     : SAD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        <jsp:include page="header.jsp"></jsp:include>

            <section>
                <div class ="container">
                    <div clas="row">
                    <jsp:include page="category.jsp"></jsp:include>
                        <div class="col-sm-9 padding-right">
                            <div class="product-details"><!--product-details-->
                                <div class="col-sm-5">
                                    <div class="view-product">
                                        <img src="${detail.hinhAnh}" alt="" />
                                        
                                    </div>
                                </div>
                                <div class="col-sm-7">
                                    <div class="product-information"><!--/product-information-->
                                        <img src="images/product-details/new.jpg" class="newarrival" alt="" />
                                        <h2>${detail.tenSanPham}</h2>
                                        <p>Mã sản phẩm :${detail.maSanPham} </p>
                                         <span>
                                            <span>${detail.donGia} $</span>                                           
                                            <button type="button" class="btn btn-fefault cart">
                                                <a href="GioHangServlet?command=insert&maSanPham=${detail.maSanPham}&cartID=${System.currentTimeMillis()}" >
                                                <i class="fa fa-shopping-cart"></i>
                                                Thêm vào giỏ hàng</a>
                                            </button>
                                        </span>
                                        <p><b>Số lượng : </b>${detail.soLuong} sản phẩm </p>
                                        <p><b>Giảm giá : </b> ${detail.giamGia} %</p>
                                        <p><b> Mô tả : </b> ${detail.moTa} </p>
                                        
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div>
                        </div>
                        </section>
                    <jsp:include page="footer.jsp"></jsp:include>      
                    </body>
                    </html>
