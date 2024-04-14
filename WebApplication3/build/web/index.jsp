<%-- 
    Document   : index
    Created on : Mar 16, 2024, 1:08:54 PM
    Author     : SAD
--%>

<%@page language ="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="dao.DAO"%>
<%@page import ="model.SanPham"%>
<%@page import ="java.util.List"%>
<%@page import="model.DanhMuc"%>
<%@page import="dao.DanhMucDaoimpl"%>

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
        <jsp:include page="slider.jsp"></jsp:include>
            <section>
                <div class ="container">
                    <div clas="row">
                        <!-- category-->
                        <div class="col-sm-3">
                            <div class="left-sidebar">
                                <h2>Danh Mục</h2>
                                <div class="panel-group category-products" id="accordian">
                                <c:forEach items="${listD}" var="o">

                                    <div class="panel panel-default">
                                        <div class="panel-heading">
                                            <h4 class="panel-title">
                                                <a data-toggle="collapse" data-parent="#accordian" href="#sportswear">
                                                    <span class="badge pull-right"><i class="fa fa-plus"></i></span>

                                                    ${o.tenDanhMuc}
                                                </a>
                                            </h4>
                                        </div>

                                        <div class="panel-body">
                                            <ul>
                                                <c:forEach begin="0" end ="${listDMC.getListDanhMucCon(o.maDanhMuc).size()-1}" step ="1" var ="i">
                                                    <li><a href="DanhMuccontrol?maDanhMuc=${listDMC.getListDanhMucCon(o.maDanhMuc).get(i).maDanhMuc}">${listDMC.getListDanhMucCon(o.maDanhMuc).get(i).tenDanhMuc} </a></li>
                                                    </c:forEach>
                                            </ul>
                                        </div>

                                    </div>
                                </c:forEach>



                            </div><!--/category-products-->

                            <!--                <div class="brands_products">brands_products
                                                <h2>Brands</h2>
                                                <div class="brands-name">
                                                    <ul class="nav nav-pills nav-stacked">
                                                        <li><a href="#"> <span class="pull-right">(50)</span>Acne</a></li>
                                                        <li><a href="#"> <span class="pull-right">(56)</span>Grüne Erde</a></li>
                                                        <li><a href="#"> <span class="pull-right">(27)</span>Albiro</a></li>
                                                        <li><a href="#"> <span class="pull-right">(32)</span>Ronhill</a></li>
                                                        <li><a href="#"> <span class="pull-right">(5)</span>Oddmolly</a></li>
                                                        <li><a href="#"> <span class="pull-right">(9)</span>Boudestijn</a></li>
                                                        <li><a href="#"> <span class="pull-right">(4)</span>Rösch creative culture</a></li>
                                                    </ul>
                                                </div>
                                            </div>/brands_products-->



                            <div class="shipping text-center"><!--shipping-->
                                <img src="images/home/shipping.jpg" alt="" />
                            </div><!--/shipping-->
                            <div style="clear: both ; margin-bottom:40px; "> </div>
                        </div>
                    </div>
                    <!-- category -->

                    <!-- product -->

                    <div class="col-sm-9 padding-right">
                        <div class="features_items"><!--features_items-->
                            <h2 class="title text-center">Sản phẩm đang bán</h2>
                            <c:forEach items="${listP}" var ="o">

                                <div class="col-sm-4">
                                    <div class="product-image-wrapper">
                                        <div class="single-products">
                                            <div class="productinfo text-center">
                                                <img src="${o.hinhAnh}" alt="" />
                                                <h2>${o.donGia} $</h2>
                                                <p>${o.tenSanPham}</p>
                                                <a href="GioHangServlet?command=insert&maSanPham=${o.maSanPham}&cartID=${System.currentTimeMillis()}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Thêm vào giỏ hàng</a>
                                            </div>
                                            <div class="product-overlay">
                                                <div class="overlay-content">
                                                    <h2>${o.donGia}</h2>
                                                    <p>${o.tenSanPham}</p>
                                                    <a href="GioHangServlet?command=insert&maSanPham=${o.maSanPham}&cartID=${System.currentTimeMillis()}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Thêm vào giỏ hàng</a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="choose">
                                            <ul class="nav nav-pills nav-justified ">
<!--                                                <li><a href ="#"><i class="fa fa-plus-square"></i> Add to </a></li>-->
                                                <li><a href ="detail?maSanPham=${o.maSanPham}"><i class="fa fa-plus-square"></i> Xem chi tiết </a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>

                        </div>
                    </div>
                    <!--   product -->
                    <div>
                    </div>
                    </section>
                    <jsp:include page="footer.jsp"></jsp:include>      
                    </body>
                    </html>
