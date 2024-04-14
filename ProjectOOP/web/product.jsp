<%-- 
    Document   : product
    Created on : Mar 15, 2024, 10:09:36 PM
    Author     : SAD
--%>

<%@page language ="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="dao.DAO"%>
<%@page import ="model.SanPham"%>
<%@page import ="model.GioHang"%>
<%@page import ="java.util.List"%>
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
        <% DAO dao = new DAO();
        List<SanPham> list = dao.getAllSanPham();
        
        // b2 : set data to jsp
       
       request.setAttribute("listP", list);
       GioHang cart  = (GioHang) session.getAttribute("cart");
       if (cart==null){
                cart= new GioHang();
                session.setAttribute("cart",cart );
            }
        %>
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
                                    <li><a href ="#"><i class="fa fa-plus-square"></i> Add to </a></li>
                                    <li><a href ="detail?maSanPham=${o.maSanPham}"><i class="fa fa-plus-square"></i> Xem chi tiết </a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </c:forEach>

            </div>
        </div>
    </body>
</html>