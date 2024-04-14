/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author SAD
 */
public class HoaDon {
    private String maHoaDon;
    private TaiKhoan taiKhoan;
    private String diaChiGiaoHang;
    private String phuongThucThanhToan;
    private Timestamp ngayMuaHang;
    private int tinhTrang;
    public HoaDon() {
    }

    public HoaDon(String maHoaDon, TaiKhoan taiKhoan, String diaChiGiaoHang, String phuongThucThanhToan, Timestamp ngayMuaHang,int tinhTrang) {
        this.maHoaDon = maHoaDon;
        this.taiKhoan = taiKhoan;
        this.diaChiGiaoHang = diaChiGiaoHang;
        this.phuongThucThanhToan = phuongThucThanhToan;
        this.ngayMuaHang = ngayMuaHang;
        this.tinhTrang = tinhTrang;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getDiaChiGiaoHang() {
        return diaChiGiaoHang;
    }

    public void setDiaChiGiaoHang(String diaChiGiaoHang) {
        this.diaChiGiaoHang = diaChiGiaoHang;
    }

    public String getPhuongThucThanhToan() {
        return phuongThucThanhToan;
    }

    public void setPhuongThucThanhToan(String phuongThucThanhToan) {
        this.phuongThucThanhToan = phuongThucThanhToan;
    }

    public Timestamp getNgayMuaHang() {
        return ngayMuaHang;
    }

    public void setNgayMuaHang(Timestamp ngayMuaHang) {
        this.ngayMuaHang = ngayMuaHang;
    }
    
}
