<%-- 
    Document   : category
    Created on : Mar 15, 2024, 9:56:58 PM
    Author     : SAD
--%>

<%@page language ="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.DanhMuc"%>
<%@page import ="java.util.List"%>
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

    </head>
    <body>
        <%  DanhMucDaoimpl dm = new DanhMucDaoimpl();
            DanhMucDaoimpl dm1= new DanhMucDaoimpl();
        
            List<DanhMuc> list = dm.getListDanhMucCha();
           
            request.setAttribute("listD", list);
            
            request.setAttribute("listDMC", dm1);
        %>
<!--        String index = request.getParameter("index");
        if(index==null){
            index="1";
        }
        int indexPage = Integer.parseInt(index);
        ProductDAOImp1 sanphamDAO = new ProductDAOImp1();  
        List<SanPham> pageProduct = sanphamDAO.getPageProDuct(indexPage);
        request.setAttribute("listTC", pageProduct);
        request.setAttribute("numberPage", sanphamDAO.getNumberPage());-->
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
    </body>
</html>
