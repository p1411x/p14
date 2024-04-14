/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import model.TaiKhoan;

/**
 *
 * @author SAD
 */
public interface TaiKhoanDao {
    // kiểm tra tài khoản tồn tại chưa
    public boolean KiemTraTaiKhoan(String tenDangNhap);
    
    // thêm mới tài khoản
    public void themTaiKhoan(TaiKhoan tk);
    public boolean KiemTraDangNhap(String tenDangNhap,String matKhau);
    
}
