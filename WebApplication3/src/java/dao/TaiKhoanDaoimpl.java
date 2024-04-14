/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connect.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import model.DanhMuc;
import model.SanPham;
import model.TaiKhoan;

/**
 *
 * @author SAD
 */
public class TaiKhoanDaoimpl implements TaiKhoanDao {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    @Override
    public boolean KiemTraTaiKhoan(String tenDangNhap) {
        //        Connection cons = DBContext.getConnection();
        String sql="SELECT tenDangNhap FROM taikhoan WHERE tenDangNhap ='"+tenDangNhap+"'";
        
        try {
//            PreparedStatement ps = cons.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
             conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                
                return true;  
            }
            
        } catch (Exception ex) {
            
        }
        return false;
    }

    @Override
    public void themTaiKhoan(TaiKhoan tk) {
      String sql =
              "INSERT INTO [dbo].[taikhoan]\n"
                + "           ([maTaiKhoan]\n"
                + "           ,[tenTaiKhoan]\n"
                + "           ,[tenDangNhap]\n"
                + "           ,[matKhau]\n"
                + "           ,[quyenTruyCap]\n"
                + "           ,[tinhTrang])\n"
                + "     VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,tk.getMaTaiKhoan());
            ps.setString(2,tk.getTenTaiKhoan());
            ps.setString(3,tk.getTenDangNhap());
            ps.setString(4,tk.getMatKhau());
            ps.setInt(5, tk.getQuyenTruyCap());
            ps.setInt(6, tk.getTinhTrang());
            ps.executeUpdate();
            
            
            
        } catch (SQLException e) {
         
        }
        
        
    }

    @Override
    public boolean KiemTraDangNhap(String tenDangNhap, String matKhau) {
       String sql="SELECT tenDangNhap FROM taikhoan WHERE tenDangNhap ='"+tenDangNhap+"'and matKhau='"+matKhau+"'" ;
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                return  true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    
}
