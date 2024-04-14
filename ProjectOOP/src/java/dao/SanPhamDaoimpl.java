/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import model.SanPham;
import model.DanhMuc;
import connect.DBContext;

public class SanPhamDaoimpl implements SanPhamDao {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
@Override
public ArrayList<SanPham> getListProductByCategory(String maDanhMuc) {
        
//        Connection cons = DBContext.getConnection();
        String sql="SELECT * FROM sanpham WHERE maDanhMuc ='"+maDanhMuc+"'";
        ArrayList<SanPham> arr = new ArrayList<>(); 
        try {
//            PreparedStatement ps = cons.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
             conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                SanPham sp = new SanPham();
                sp.setMaSanPham(rs.getString("maSanPham"));
                DanhMuc dm=new DanhMuc(rs.getString("maDanhMuc"),"","");
                sp.setDanhMuc(dm);
                sp.setTenSanPham(rs.getString("tenSanPham"));
                sp.setHinhAnh(rs.getString("hinhAnh"));
                sp.setSoLuong(rs.getInt("soLuong"));
                sp.setMoTa(rs.getString("moTa"));
                sp.setDonGia(rs.getDouble("donGia"));
                sp.setGiamGia(rs.getInt("giamGia"));
                arr.add(sp);
                
            }
            
        } catch (Exception ex) {
            
        }
        return arr;
    } 

    public ArrayList<SanPham> getChiTietSanPham(String maSanPham) {
        
//        Connection cons = DBContext.getConnection();
        String sql="SELECT * FROM sanPham WHERE maSanPham = '"+maSanPham+"'";
        ArrayList<SanPham> arr = new ArrayList<>(); 
        
        try {
//            PreparedStatement ps = cons.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                SanPham sp = new SanPham();
                sp.setMaSanPham(rs.getString("maSanPham"));
                DanhMuc dm=new DanhMuc(rs.getString("maDanhMuc"),"","");
                sp.setDanhMuc(dm);
                sp.setTenSanPham(rs.getString("tenSanPham"));
                sp.setHinhAnh(rs.getString("hinhAnh"));
                sp.setSoLuong(rs.getInt("soLuong"));
                sp.setMoTa(rs.getString("moTa"));
                sp.setDonGia(rs.getDouble("donGia"));
             //   sp.setDon_gia_giam(rs.getDouble("don_gia_giam"));
                sp.setGiamGia(rs.getInt("giamGia"));
                arr.add(sp);
                
            }
            
        } catch (Exception ex) {
             
        }
        return arr;
    
    }
    
    public SanPham getChiTietSanPham1(String maSanPham) {
        
//        Connection cons = DBContext.getConnection();
        String sql="SELECT * FROM sanPham WHERE maSanPham = '"+maSanPham+"'";
        SanPham sp = new SanPham();
        
        try {
//            PreparedStatement ps = cons.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
            
                sp.setMaSanPham(rs.getString("maSanPham"));
                DanhMuc dm=new DanhMuc(rs.getString("maDanhMuc"),"","");
                sp.setDanhMuc(dm);
                sp.setTenSanPham(rs.getString("tenSanPham"));
                sp.setHinhAnh(rs.getString("hinhAnh"));
                sp.setSoLuong(rs.getInt("soLuong"));
                sp.setMoTa(rs.getString("moTa"));
                sp.setDonGia(rs.getDouble("donGia"));
             //   sp.setDon_gia_giam(rs.getDouble("don_gia_giam"));
                sp.setGiamGia(rs.getInt("giamGia"));
            
                
            }
            
        } catch (Exception ex) {
             
        }
    return sp;
    
    }
}

        
