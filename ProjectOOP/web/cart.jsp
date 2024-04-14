<%-- 
    Document   : Cart
    Created on : Mar 16, 2024, 1:40:21 PM
    Author     : SAD
--%>

<%@page language ="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.TreeMap"%>
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
        
        
        <%  
            GioHang cart = (GioHang) session.getAttribute("cart");
            if (cart == null) {
                cart = new GioHang();
                session.setAttribute("cart", cart);
            }
            TreeMap<SanPham,Integer> list = cart.getList();
        %>
        
        <jsp:include page="header.jsp"></jsp:include>

            <section>
                <div class ="container">
                    <div clas="row">

                        <section id="cart_items">
                            <div class="container">
                               
                                <div class="table-responsive cart_info">
                                    <table class="table table-condensed">
                                        <thead>
                                            <tr class="cart_menu">
                                                <td class="image">Sản Phẩm</td>
                                                <td class="description"></td>
                                                <td class="price">Price</td>
                                                <td class="quantity">Quantity</td>
                                                <td class="total">Total</td>
                                                <td></td>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <%
                                                for (Map.Entry<SanPham, Integer > ds : list.entrySet()){
                                                
                                                
                                            %>
                                            <tr>
                                                <td class="cart_product">
                                                    <a href=""><img src="<%=ds.getKey().getHinhAnh()%>" alt=""></a>
                                                </td>
                                                <td class="cart_description">
                                                    <h4><a href=""><%=ds.getKey().getTenSanPham()%></a></h4>
                                                    <p>Mã sản phẩm: <%=ds.getKey().getMaSanPham()%></p>
                                                </td>
                                                <td class="cart_price">
                                                    <p><%=ds.getKey().getDonGia() %>$</p>
                                                </td>
                                                <td class="cart_quantity">
                                                    <div class="cart_quantity_button">
                                                        <a class="cart_quantity_up" href="GioHangServlet?command=plus&maSanPham=<%=ds.getKey().getMaSanPham()%>&cartID=<%=System.currentTimeMillis()%>"> + </a>
                                                        <input class="cart_quantity_input" type="text" value="<%=ds.getValue()%>" autocomplete="off" size="2" disabled="">
                                                        <a class="cart_quantity_down" href="GioHangServlet?command=sub&maSanPham=<%=ds.getKey().getMaSanPham()%>&cartID=<%=System.currentTimeMillis()%>"> - </a>
                                                    </div>
                                                </td>
                                                <td class="cart_total">
                                                    <p class="cart_total_price"> <%=ds.getValue() * ds.getKey().getDonGia() %></p>
                                                </td>
                                                <td class="cart_delete">
                                                    <a class="cart_quantity_delete" href="GioHangServlet?command=remove&maSanPham=<%=ds.getKey().getMaSanPham()%>&cartID=<%=System.currentTimeMillis()%>"><i class="fa fa-times"></i></a>
                                                </td>
                                            </tr>

                                            
                                            
                                            
                                            <%
                                                }
                                            %>
                                            
                                            
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </section> <!--/#cart_items-->
                        <section id="do_action">
                            <div class="container">
                                <div class="heading">
                                    <h3>What would you like to do next?</h3>
                                    <p>Choose if you have a discount code or reward points you want to use or would like to estimate your delivery cost.</p>
                                </div>
                                <div class="row">
                                    <div class="col-sm-6">
                                        <div class="chose_area">
                                            <ul class="user_option">
                                                <li>
                                                    <input type="checkbox">
                                                    <label>Use Coupon Code</label>
                                                </li>
                                                <li>
                                                    <input type="checkbox">
                                                    <label>Use Gift Voucher</label>
                                                </li>
                                                <li>
                                                    <input type="checkbox">
                                                    <label>Estimate Shipping & Taxes</label>
                                                </li>
                                            </ul>
                                            <ul class="user_info">
                                                <li class="single_field">
                                                    <label>Country:</label>
                                                    <select>
                                                        <option>United States</option>
                                                        <option>Bangladesh</option>
                                                        <option>UK</option>
                                                        <option>India</option>
                                                        <option>Pakistan</option>
                                                        <option>Ucrane</option>
                                                        <option>Canada</option>
                                                        <option>Dubai</option>
                                                    </select>

                                                </li>
                                                <li class="single_field">
                                                    <label>Region / State:</label>
                                                    <select>
                                                        <option>Select</option>
                                                        <option>Dhaka</option>
                                                        <option>London</option>
                                                        <option>Dillih</option>
                                                        <option>Lahore</option>
                                                        <option>Alaska</option>
                                                        <option>Canada</option>
                                                        <option>Dubai</option>
                                                    </select>

                                                </li>
                                                <li class="single_field zip-field">
                                                    <label>Zip Code:</label>
                                                    <input type="text">
                                                </li>
                                            </ul>
                                            <a class="btn btn-default update" href="">Get Quotes</a>
                                            <a class="btn btn-default check_out" href="">Continue</a>
                                        </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <div class="total_area">
                                            <ul>
                                                <li>Cart Sub Total <span>$59</span></li>
                                                <li>Eco Tax <span>$2</span></li>
                                                <li>Shipping Cost <span>Free</span></li>
                                                <li>Total <span>$61</span></li>
                                            </ul>
                                            <a class="btn btn-default update" href="">Update</a>
                                            <a class="btn btn-default check_out" href="">Check Out</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </section><!--/#do_action-->



                        <div>
                        </div>
                        </section>
                    <jsp:include page="footer.jsp"></jsp:include>   

                    </body>
                    </html>
