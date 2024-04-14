/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.HoaDon;
import java.sql.Timestamp;

/**
 *
 * @author SAD
 */
public class HoaDonDaoimpl  implements HoaDonDao{
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    @Override
    public void themHoaDon(HoaDon hd) {
     String sql =
              "INSERT INTO [dbo].[hoadon]\n"
                + "           ([maHoaDon]\n"
                + "           ,[taiKhoan]\n"
                + "           ,[diaChiGiaoHang]\n"
                + "           ,[phuongThucThanhToan]\n"
                + "           ,[ngayGiaoHang]\n"
                + "           ,[tinhTrang])\n"
                + "     VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,hd.getMaHoaDon());
            ps.setString(2,hd.getTaiKhoan().getMaTaiKhoan());
            ps.setString(3,hd.getDiaChiGiaoHang());
            ps.setString(4,hd.getPhuongThucThanhToan());
            ps.setTimestamp(5, hd.getNgayMuaHang());
     
            ps.setInt(6,hd.getTinhTrang() );
            ps.executeUpdate();
            
            
            
        } catch (SQLException e) {
            
        } 
    }
    
}
