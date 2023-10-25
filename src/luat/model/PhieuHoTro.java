
package luat.model;

import java.util.Date;


public class PhieuHoTro {
    private String hoTen;
    private String ngaySinh;
    private Boolean gioiTinh;
    private String tenTaiKhoan;
    private String soDienThoai;
    private String email;
    private String tieuDe;
    private String noiDung;
    private String loaiHoTro;
    private String phuongThucHoTro;
    private String trangThai ;
    public PhieuHoTro() {
    }

    public PhieuHoTro(String hoTen, String ngaySinh, Boolean gioiTinh, String tenTaiKhoan, String soDienThoai, String email, String tieuDe, String noiDung, String loaiHoTro, String phuongThucHoTro,String trangThai) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.tieuDe = tieuDe;
        this.noiDung = noiDung;
        this.loaiHoTro = loaiHoTro;
        this.phuongThucHoTro = phuongThucHoTro;
        this.trangThai=trangThai;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }



   

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

  

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getLoaiHoTro() {
        return loaiHoTro;
    }

    public void setLoaiHoTro(String loaiHoTro) {
        this.loaiHoTro = loaiHoTro;
    }

    public String getPhuongThucHoTro() {
        return phuongThucHoTro;
    }

    public void setPhuongThucHoTro(String phuongThucHoTro) {
        this.phuongThucHoTro = phuongThucHoTro;
    }
    
}
