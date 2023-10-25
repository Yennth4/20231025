package yen.model;

public class KhuyenMaiThem {
    private int ma;
    private String ten;
    private String thoiGianBatDau;
    private String thoiGianKetThuc;
    private String giaTri;
    private String dieuKien;
    private int soLuong;
    private String moTa;
    private String loaiKhuyenMai;

    public KhuyenMaiThem() {
    }

    public KhuyenMaiThem(int ma, String ten, String thoiGianBatDau, String thoiGianKetThuc, String giaTri, String dieuKien, int soLuong, String moTa, String loaiKhuyenMai) {
        this.ma = ma;
        this.ten = ten;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.giaTri = giaTri;
        this.dieuKien = dieuKien;
        this.soLuong = soLuong;
        this.moTa = moTa;
        this.loaiKhuyenMai = loaiKhuyenMai;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(String thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public String getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(String thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public String getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(String giaTri) {
        this.giaTri = giaTri;
    }

    public String getDieuKien() {
        return dieuKien;
    }

    public void setDieuKien(String dieuKien) {
        this.dieuKien = dieuKien;
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

    public String getLoaiKhuyenMai() {
        return loaiKhuyenMai;
    }

    public void setLoaiKhuyenMai(String loaiKhuyenMai) {
        this.loaiKhuyenMai = loaiKhuyenMai;
    }
    
    
}
