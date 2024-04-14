
package dao;

import connect.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.DanhMuc;
import model.SanPham;

public class DAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null ;
    public List<SanPham> getAllSanPham(){
        List<SanPham> list = new ArrayList<>();
        String query ="select * from sanpham";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                
                list.add(new SanPham(rs.getString("maSanPham"),
                                    rs.getString("maDanhMuc"),
                                    rs.getString("tenSanPham"),
                                    rs.getString("hinhAnh"),
                                    rs.getInt("soLuong"),
                                    rs.getString("moTa"),
                                    rs.getDouble("donGia"),
                                    rs.getInt("giamGia")));
                
            }
        } catch (Exception e) {
        } 
        
        return list;
    }
    public List<DanhMuc> getListDanhMuc(){
        List<DanhMuc> list = new ArrayList<>();
        String query ="select * from danhmuc";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                
                list.add(new DanhMuc(rs.getString(1),
                                    rs.getString(2),
                                    rs.getString(3)));
            }
        } catch (Exception e) {
        }       
        return list;
    }
  

    public static void main(String[] args) {
        DAO dao = new DAO();
        List<SanPham> list = dao.getAllSanPham();
         List<DanhMuc> listD = dao.getListDanhMuc();
        for(DanhMuc o : listD  ){
            System.out.println(o);
        }
        for(SanPham o : list  ){
            System.out.println(o);
        }
    }
}
