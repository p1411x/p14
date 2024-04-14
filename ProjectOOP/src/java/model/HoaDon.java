/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.security.Timestamp;

/**
 *
 * @author SAD
 */
public class HoaDon {
    private String maHoaDon;
    private TaiKhoan taiKhoan;
    private String diaChiGiaoHang;
    private String phuongThucThanhToan;
    private Timestamp ngayGiaoHang;
    private Timestamp ngayMuaHang;
    private String tinhTrang;
    public HoaDon() {
    }

    public HoaDon(String maHoaDon, TaiKhoan taiKhoan, String diaChiGiaoHang, String phuongThucThanhToan, Timestamp ngayGiaoHang, Timestamp ngayMuaHang) {
        this.maHoaDon = maHoaDon;
        this.taiKhoan = taiKhoan;
        this.diaChiGiaoHang = diaChiGiaoHang;
        this.phuongThucThanhToan = phuongThucThanhToan;
        this.ngayGiaoHang = ngayGiaoHang;
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

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
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

    public Timestamp getNgayGiaoHang() {
        return ngayGiaoHang;
    }

    public void setNgayGiaoHang(Timestamp ngayGiaoHang) {
        this.ngayGiaoHang = ngayGiaoHang;
    }

    public Timestamp getNgayMuaHang() {
        return ngayMuaHang;
    }

    public void setNgayMuaHang(Timestamp ngayMuaHang) {
        this.ngayMuaHang = ngayMuaHang;
    }
    
}
