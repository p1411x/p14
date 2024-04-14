

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
            if (session.getAttribute("tenDangNhap")==null){
            response.sendRedirect("/Web1/account.jsp");
            }
            else {
             GioHang cart = (GioHang) session.getAttribute("cart");
            if (cart == null) {
                cart = new GioHang();
                session.setAttribute("cart",cart);
            }
            TreeMap<SanPham,Integer> list = cart.getList();
            //NumberFormat nf = NumberFormat.getInstance();
            //nf.setMinimumIntegerDigits(0);
        
        %>

        <jsp:include page="header.jsp"></jsp:include>
            <section id="cart_items">
                <div class="container">

                    <div class="review-payment">
                        <h2>Thông tin đơn hàng</h2>
                    </div>

                    <div class="table-responsive cart_info">
                        <table class="table table-condensed">
                            <thead>
                                <tr class="cart_menu">
                                    <td class="image">Item</td>
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

                            <tr>
                                <td colspan="4">&nbsp;</td>
                                <td colspan="2">
                                    <table class="table table-condensed total-result">
                                        <tr>
                                            <td>Cart Sub Total</td>
                                            <td>$59</td>
                                        </tr>
                                        <tr>
                                            <td>Exo Tax</td>
                                            <td>$2</td>
                                        </tr>
                                        <tr class="shipping-cost">
                                            <td>Shipping Cost</td>
                                            <td>Free</td>										
                                        </tr>
                                        <tr>
                                            <td>Total</td>
                                            <td><span>$61</span></td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>


                <div class="shopper-informations">
                    <div class="row">
                        <div class="col-sm-3">
                            <div class="shopper-info">
                                <p>Thông tin thanh toán</p>
                                <form action="ThanhToanServlet" method ="post">
                                    <p>Địa chỉ giao hàng</p>
                                    <textarea name="diaChiGiaoHang"  placeholder="" rows="5"></textarea>
                                    <p>Phương thức thanh toán</p>                    
                                    <select name ="phuongThucThanhToan">
                                        <option value ="Thanh toán khi giao hàng">Thanh toán khi giao hàng</option>
                                        <option value="Chuyển khoản ngân hàng" >Chuyển khoản ngân hàng </option>
                                    </select>
                                    <input type ="hidden" value="<%=session.getAttribute("tenDangNhap")%>"/>
                                    <input type="submit"  value="Xác nhận thanh toán" class="btn btn-primary">
                                </form>

                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </section> <!--/#cart_items-->
        <jsp:include page="footer.jsp"></jsp:include> 
        <%
            }
        %>
    </body>
</html>
