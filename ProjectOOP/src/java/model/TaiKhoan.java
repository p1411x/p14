/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author SAD
 */
public class TaiKhoan {
    private  String maTaiKhoan;
    private String tenTaiKhoan;
    private String tenDangNhap;
    private String matKhau;
    private int quyenTruyCap;
    private  int tinhTrang;

    public TaiKhoan() {
    }

    public TaiKhoan(String maTaiKhoan, String tenTaiKhoan, String tenDangNhap, String matKhau, int quyenTruyCap, int tinhTrang) {
        this.maTaiKhoan = maTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.quyenTruyCap = quyenTruyCap;
        this.tinhTrang = tinhTrang;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setQuyenTruyCap(int quyenTruyCap) {
        this.quyenTruyCap = quyenTruyCap;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public int getQuyenTruyCap() {
        return quyenTruyCap;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    
    
}
