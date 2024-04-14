/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dao.TaiKhoanDaoimpl;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


/**
 *
 * @author SAD
 */
public class DangNhapServlet extends HttpServlet {
   
    private TaiKhoanDaoimpl taiKhoanDao = new TaiKhoanDaoimpl();
 

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
     if(request.getParameter("command").equals("logout")){
         HttpSession session = request.getSession();
         session.invalidate();
         response.sendRedirect("/Web1/homecontrol");
     }
    } 

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String tenDangNhap = request.getParameter("tenDangNhap");     
        String matKhau = request.getParameter("matKhau");
        
        String err="";
        if(tenDangNhap.equals("") || matKhau.equals("") ){
            err = "Vui lòng đăng nhập đầy đủ thông tin";         
        }
        else if(taiKhoanDao.KiemTraDangNhap(tenDangNhap ,matKhau) == false){
            
                err ="Emai hoặc mật khẩu không chính xác";
            
        }
         if(err.length() >0 ){
             request.setAttribute("err", err);
        }
         String url="/account.jsp";
         try {
            if(err.length() == 0){
                HttpSession session = request.getSession();
                session.setAttribute("tenDangNhap",tenDangNhap);
                url ="/homecontrol";
            } else {
                url="/account.jsp";
            }
              RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
             rd.forward(request, response);
        } catch (Exception e) {
        }
    }

    

}
