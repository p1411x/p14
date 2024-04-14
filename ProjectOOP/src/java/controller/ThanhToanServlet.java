/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dao.ChiTietHoaDonDaoimpl;
import dao.HoaDonDaoimpl;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.*;
import model.ChiTietHoaDon;
import model.GioHang;
import model.HoaDon;
import model.SanPham;
import model.TaiKhoan;

/**
 *ThanhToanServlet
 * @author SAD
 */
    public class ThanhToanServlet extends HttpServlet {
    private  HoaDonDaoimpl hdDao = new HoaDonDaoimpl();
    private  ChiTietHoaDonDaoimpl cthdDao= new ChiTietHoaDonDaoimpl();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String diaChiGiaoHang = request.getParameter("diaChiGiaoHang");     
        String phuongThucThanhToan = request.getParameter("phuongThucThanhToan");
        
        String taikhoan = request.getParameter("taikhoan");
        HttpSession session = request.getSession();
        GioHang cart =(GioHang) session.getAttribute("cart");
        
        try {
            Date date = new Date();
            String mhd = "" + date.getTime();
            TaiKhoan tk = new TaiKhoan();
            tk.setMaTaiKhoan(taikhoan);
            HoaDon hd =  new HoaDon(mhd, tk, diaChiGiaoHang, phuongThucThanhToan,
                    new Timestamp(new Date().getTime()), 0);
            
            hd.setMaHoaDon(mhd);
            hdDao.themHoaDon(hd);
            TreeMap<SanPham,Integer> list = cart.getList();
            for(Map.Entry<SanPham,Integer> ds : list.entrySet()  ) {
                SanPham sp= new SanPham();
                sp.setMaSanPham(ds.getKey().getMaSanPham());
                cthdDao.themChiTietHoaDon(new ChiTietHoaDon(0, hd, sp, ds.getValue(),
                        ds.getKey().getDonGia(), ds.getKey().getGiamGia()));
            }
                
            response.sendRedirect("/Web1/homecontrol");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

   

}
