
package dao;

import connect.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.*;
import model.DanhMuc;

public class DanhMucDaoimpl implements DanhMucDao{
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    @Override
    public ArrayList<DanhMuc> getListDanhMucCha() {
//        Connection connection = DBConnect.getConnection();
        String sql="SELECT * FROM danhmuc WHERE danhMucCha=''";
        ArrayList<DanhMuc> arr = new ArrayList<>();
        
        try {
//            PreparedStatement ps =connection.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
            DanhMuc dm = new DanhMuc();
            dm.setMaDanhMuc(rs.getString("maDanhMuc"));
            dm.setTenDanhMuc(rs.getString("tenDanhMuc"));
            dm.setDanhMucCha(rs.getString("danhMucCha"));
            arr.add(dm);
                     
        }
            
        } catch (Exception ex) {
//            Logger.getLogger(DanhMucDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
    @Override
     public ArrayList<DanhMuc> getListDanhMucCon(String maDanhMuc) {
//        Connection connection = DBConnect.getConnection();
        String sql="SELECT * FROM danhmuc WHERE danhMucCha='"+maDanhMuc+"'";
        ArrayList<DanhMuc> arr = new ArrayList<>();
        
        try {
//            PreparedStatement ps =connection.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
            DanhMuc dm = new DanhMuc();
            dm.setMaDanhMuc(rs.getString("maDanhMuc"));
            dm.setTenDanhMuc(rs.getString("tenDanhMuc"));
            dm.setDanhMucCha(rs.getString("danhMucCha"));
            arr.add(dm);
                     
        }
            
        } catch (Exception ex) {
//            Logger.getLogger(DanhMucDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
    public static void main(String[] args) {
        DanhMucDaoimpl d = new DanhMucDaoimpl();
        List<DanhMuc> list = d.getListDanhMucCha();
        for(DanhMuc o : list  ){
            System.out.println(o);
        }
    }
}
