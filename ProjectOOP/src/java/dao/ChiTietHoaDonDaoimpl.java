/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.ChiTietHoaDon;

/**
 *
 * @author SAD
 */
public class ChiTietHoaDonDaoimpl implements ChiTietHoaDonDao {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void themChiTietHoaDon(ChiTietHoaDon cthd) {
        String sql
                = "INSERT INTO [dbo].[chitiethoadon]\n"
                + "           ([maChiTietHoaDon]\n"
                + "           ,[maHoaDon]\n"
                + "           ,[maSanPham]\n"
                + "           ,[soLuong]\n"
                + "           ,[donGia]\n"
                + "           ,[giamGia])\n"
                + "     VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, cthd.getMaChiTietHoaDon());
            ps.setString(2, cthd.getHoaDon().getMaHoaDon());
            ps.setString(3, cthd.getSanPham().getMaSanPham());
            ps.setInt(4, cthd.getSoLuong());
            ps.setDouble(5, cthd.getDonGia());          
            ps.setInt(6, cthd.getGiamGia());
            ps.executeUpdate();

        } catch (SQLException e) {

        }
    }
 
}
