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
import java.util.*;
import model.TaiKhoan;
import tool.MaHoa;
/**
 *
 * @author SAD
 */
public class DangKyServlet extends HttpServlet {
   
    private TaiKhoanDaoimpl taiKhoanDao = new TaiKhoanDaoimpl();
   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      
    } 

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String tenDangNhap = request.getParameter("tenDangNhap");
        String tenTaiKhoan = request.getParameter("tenTaiKhoan");
        String matKhau = request.getParameter("matKhau");
      
        String tenTaiKhoanErr="",tenDangNhapErr="",matKhauErr="";
        if(tenTaiKhoan.equals("")){
            tenTaiKhoanErr += "Vui lòng đăng nhập tên tài khoản của bạn ";
            
        }
         if(tenTaiKhoanErr.length() >0 ){
             request.setAttribute("tenTaiKhoanErr", tenTaiKhoanErr);
        }
         
         if(tenDangNhap.equals("")){
             tenDangNhapErr += "Vui lòng nhập email đăng ký";
         }
         else{
             if(taiKhoanDao.KiemTraTaiKhoan(tenDangNhap)==true){
                 tenDangNhapErr="Địa chỉ email đã được đăng ký";
             }
             
         }
         
         if(tenDangNhapErr.length() > 0){
             request.setAttribute("tenDangNhapErr", tenDangNhapErr);
         }
         
         if(matKhau.equals("")){
             matKhauErr += "Vui lòng nhập mật khẩu";
         }
         if(matKhauErr.length() > 0){
             request.setAttribute("matKhauErr", matKhauErr);
         }
         
         request.setAttribute("tenTaiKhoan", tenTaiKhoan);
         request.setAttribute("tenDangNhap", tenDangNhap);
         request.setAttribute("matKhau", matKhau);
         
         
         
         
         String url ="/account.jsp";
         try {
            if(matKhauErr.length()==0 && tenDangNhapErr.length()==0&& tenTaiKhoanErr.length()==0 ) {
                Date id = new Date();
                
                TaiKhoan tk = new TaiKhoan("" + id.getTime(), tenTaiKhoan, tenDangNhap, matKhau, 2, 1);
                taiKhoanDao.themTaiKhoan(tk);
                  url ="/homecontrol" ; 
            }
            else{
                 url ="/account.jsp" ;
            }
             RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
             rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
         
    }

    

}
