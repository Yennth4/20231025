package yen.model;

public class DanhSachKhuyenMai {
    private int STT;
    private String ten;
    private String thoiGian;
    private String giaTri;
    private String moTa;

    public DanhSachKhuyenMai() {
    }

    public DanhSachKhuyenMai(int STT, String ten, String thoiGian, String giaTri, String moTa) {
        this.STT = STT;
        this.ten = ten;
        this.thoiGian = thoiGian;
        this.giaTri = giaTri;
        this.moTa = moTa;
    }

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(String giaTri) {
        this.giaTri = giaTri;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
    
}
