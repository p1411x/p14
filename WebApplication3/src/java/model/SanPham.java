/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author SAD
 */
public class SanPham implements Comparable<SanPham> {
    private String maSanPham;
    private String maDanhMuc;
    private  String tenSanPham;
    private  String hinhAnh;
    private  int soLuong;
    private String moTa;
    private double donGia;
    private  int giamGia;
    private DanhMuc danhMuc;

    public SanPham() {
    }

    public SanPham(String maSanPham, DanhMuc danhMuc,String maDanhMuc, String tenSanPham, String hinhAnh, int soLuong, String moTa, double donGia, int giamGia) {
        this.maSanPham = maSanPham;
        this.maDanhMuc = maDanhMuc;
        this.tenSanPham = tenSanPham;
        this.hinhAnh = hinhAnh;
        this.soLuong = soLuong;
        this.moTa = moTa;
        this.donGia = donGia;
        this.giamGia = giamGia;
        this.danhMuc=danhMuc;
    }
    public SanPham(String maSanPham,String maDanhMuc, String tenSanPham, String hinhAnh, int soLuong, String moTa, double donGia, int giamGia) {
        this.maSanPham = maSanPham;
        this.maDanhMuc = maDanhMuc;
        this.tenSanPham = tenSanPham;
        this.hinhAnh = hinhAnh;
        this.soLuong = soLuong;
        this.moTa = moTa;
        this.donGia = donGia;
        this.giamGia = giamGia;
    
    }

    public void setDanhMuc(DanhMuc danhMuc) {
        this.danhMuc = danhMuc;
    }

    public DanhMuc getDanhMuc() {
        return danhMuc;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(String maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(int giamGia) {
        this.giamGia = giamGia;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSanPham=" + maSanPham + ", maDanhMuc=" + maDanhMuc + ", tenSanPham=" + tenSanPham + ", hinhAnh=" + hinhAnh + ", soLuong=" + soLuong + ", moTa=" + moTa + ", donGia=" + donGia + ", giamGia=" + giamGia + '}';
    }

    @Override
    public int compareTo(SanPham sp) {
       return Integer.parseInt(this.maSanPham) - Integer.parseInt(sp.maSanPham);
    }

    
   }

   
