/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luat.model;

/**
 *
 * @author Admin
 */
public class DaoDich {

    private String ten;
    private String ngay;
    private String nhanVien;
    private String ma;
    private String sanPham;
    private String sotien;
    private String giamGia;
    private String thanhTien;
    private int trangThai;
    private int phuongThuc;

    public DaoDich() {
    }

    public DaoDich(String ten, String ngay, String nhanVien, String ma, String sanPham, String sotien, String giamGia, String thanhTien, int trangThai, int phuongThuc) {
        this.ten = ten;
        this.ngay = ngay;
        this.nhanVien = nhanVien;
        this.ma = ma;
        this.sanPham = sanPham;
        this.sotien = sotien;
        this.giamGia = giamGia;
        this.thanhTien = thanhTien;
        this.trangThai = trangThai;
        this.phuongThuc = phuongThuc;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(String nhanVien) {
        this.nhanVien = nhanVien;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public String getSotien() {
        return sotien;
    }

    public void setSotien(String sotien) {
        this.sotien = sotien;
    }

    public String getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(String giamGia) {
        this.giamGia = giamGia;
    }

    public String getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(String thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public int getPhuongThuc() {
        return phuongThuc;
    }

    public void setPhuongThuc(int phuongThuc) {
        this.phuongThuc = phuongThuc;
    }
    

}
