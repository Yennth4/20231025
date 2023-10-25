/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luat.service.impl;

import luat.model.PhieuHoTro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PhieuHoTroService {
    private List<PhieuHoTro> listPhieuHoTro= new ArrayList<>();

    public PhieuHoTroService() {
        listPhieuHoTro.add(new PhieuHoTro("Lục Văn Luật", "21-3-2020", false, "lucluathehehe", 
                "0987654321", "lucvanluat@gmail.com", "Hỗ trợ nạp tiền", "khi nạp tiền, tôi đã thực hiện chuyển tiền nhưng tài khoản chưa được cộng tiền",
                "Hỗ trợ nạp tiền", "Gọi điện","Chờ duyệt"));
        listPhieuHoTro.add(new PhieuHoTro("Nguyễn Hải Yến", "21-3-2020", true, "nguyenhaiyen2004", 
                "0987654321", "nguyenhaiyen@gmail.com", "Hỗ trợ tài khoản", 
                "tôi không thể đăng nhập vào tài khoản của mình",
                "Hỗ trợ tài khoản", "Nhắn tin","Chờ duyệt"));
        listPhieuHoTro.add(new PhieuHoTro("Nguyễn Vĩnh Long", "21-3-2020", false, "nguyenvinhlong", 
                "0987654321", "nguyenvinhlong@gmail.com", "Hỗ trợ máy tính", 
                "phím và chuột không hoạt động",
                "Hỗ trợ máy", "Tại máy","Chờ duyệt"));
        listPhieuHoTro.add(new PhieuHoTro("Vũ Ngọc Tú", "21-3-2020", false, "vungoctu", 
                "0987654321", "vungoctu@gmail.com", "Hỗ trợ tài khoản", 
                "tài khoản bị đánh cắp",
                "Hỗ trợ tài khoản", "Gọi điện","Chờ duyệt"));
        listPhieuHoTro.add(new PhieuHoTro("Nguyễn Tiến Mạnh", "21-3-2020", false, "nguyentienmanh", 
                "0987654321", "nguyentienmanh@gmail.com", "Hỗ trợ nạp tiền",
                "tôi nạp tiền nhưng hệ thống báo lỗi",
                "Hỗ trợ nạp tiền", "Gọi điện","Chờ duyệt"));
        listPhieuHoTro.add(new PhieuHoTro("Hoàng Thu Hiền", "21-3-2020", true, "hoangthuhien", 
                "0987654321", "hoangthuhien@gmail.com", "Hỗ trợ máy", 
                "máy tính đột ngột tắt khi tôi đang sử dụng",
                "Hỗ trợ máy", "Tại máy","Chờ duyệt"));
        listPhieuHoTro.add(new PhieuHoTro("aaaaa", "", false, "aaaaaa", 
                "1111111111", "", "", "",
                "", "","Chờ duyệt"));
    }
    
    public boolean themPhieuHoTro(PhieuHoTro hoTro){
        return hoTro!=null&&listPhieuHoTro.add(hoTro);
    }

    public List<PhieuHoTro> getListPhieuHoTro() {
        return listPhieuHoTro;
    }

    public void setListPhieuHoTro(List<PhieuHoTro> listPhieuHoTro) {
        this.listPhieuHoTro = listPhieuHoTro;
    }
    
    
}
