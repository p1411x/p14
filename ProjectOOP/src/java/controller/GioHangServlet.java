/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.SanPhamDaoimpl;
import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.*;
import model.GioHang;
import model.SanPham;

/**
 *
 * @author SAD
 */

public class GioHangServlet extends HttpServlet {

    private SanPhamDaoimpl sanPhamDao = new SanPhamDaoimpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        GioHang cart = (GioHang) session.getAttribute("cart");
        String msp = request.getParameter("maSanPham");
        String command = request.getParameter("command");
        ArrayList<Long> listBuy = null;
        String url ="/cart.jsp";
        try {
            listBuy = (ArrayList<Long>) session.getAttribute("cartID");
            long idBuy = 0;
            if (request.getParameter("cartID") != null) {
                idBuy = Long.parseLong(request.getParameter("cartID"));
            }
            SanPham sp = sanPhamDao.getChiTietSanPham1(msp);
            switch (command) {
                case "insert":
                    if (listBuy == null) {
                        listBuy = new ArrayList<>();
                        session.setAttribute("cartID", listBuy);
                    }
                    if(listBuy.indexOf(idBuy)== -1 ){
                        cart.addToCart(sp, 1);
                        listBuy.add(idBuy);
                    }
                    url= "/cart.jsp";
                    break;
                case "plus":
                    if(listBuy == null){
                        listBuy = new ArrayList<>();
                        session.setAttribute("cart", listBuy);
                    }
                    if (listBuy.indexOf(idBuy)== -1){
                        cart.addToCart(sp, 1);
                        listBuy.add(idBuy);
                    }
                    url ="/cart.jsp";
                    break;
                case "sub"  :
                 if(listBuy == null){
                        listBuy = new ArrayList<>();
                        session.setAttribute("cart", listBuy);
                    }
                    if (listBuy.indexOf(idBuy)== -1){
                        cart.subToCart(sp, 1);
                        listBuy.add(idBuy);
                    }
                    url ="/cart.jsp";
                    break;
                case "remove" :
                    cart.removeToCart(sp);
                    url ="/cart.jsp";
                default:
                    break;
            }
            RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
            rd.forward(request, response);
        }
    
    catch (Exception e) {
        }
   }
}
