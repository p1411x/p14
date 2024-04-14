/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.TreeMap;

/**
 *
 * @author SAD
 */
public class GioHang {
    private  TreeMap<SanPham,Integer> list;
    private long cartID;

    public GioHang() {
        list= new TreeMap<>() ;
        cartID = System.currentTimeMillis();
        
        
    }

    @Override
    public String toString() {
        return "GioHang{" + "list=" + list + ", cartID=" + cartID + '}';
    }

    public void setList(TreeMap<SanPham, Integer> list) {
        this.list = list;
    }

    public void setCartID(long cartID) {
        this.cartID = cartID;
    }

    public GioHang(TreeMap<SanPham, Integer> list, long cartID) {
        this.list = list;
        this.cartID = cartID;
    }

    public TreeMap<SanPham, Integer> getList() {
        return list;
    }

    public long getCartID() {
        return cartID;
    }
    // cac phương thức thêm sửa xóa của giỏ hàng
    public void addToCart(SanPham sp, int soLuong){
        boolean bln = list.containsKey(sp);
        if(bln) {
                    int s1 = list.get(sp);
            soLuong += s1;
            list.put(sp,soLuong);
            
        }else {
            list.put(sp, soLuong);
            
        }
    }
    public void subToCart(SanPham sp, int soLuong){
        boolean bln = list.containsKey(sp);
        if(bln){
            int sl = list.get(sp);
            soLuong =sl - soLuong;
            if(soLuong<=0){
                list.remove(sp);
            }else{
                list.remove(sp);
                list.put(sp, soLuong);
            }
        }      
    }
    public void removeToCart(SanPham sp){
        boolean bln = list.containsKey(sp);
        if(bln){
            list.remove(sp);
        }
    }
    
    
}
