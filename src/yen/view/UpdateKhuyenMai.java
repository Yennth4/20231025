
package yen.view;

import home.ViewHome;
import java.util.ArrayList;
import java.util.List;
import yen.model.KhuyenMaiSua;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import yen.model.KhuyenMaiSua;

public class UpdateKhuyenMai extends javax.swing.JFrame {

    List<KhuyenMaiSua> list = new ArrayList<>();
    public UpdateKhuyenMai() {
        initComponents();
        
        
        list.add(new KhuyenMaiSua(1, "Mùa hè thả ga", "1/1/2023", "30/08/2023", "Giảm 20% cho tất cả các giờ chơi trong buổi tối.", "true", 30, "Hãy tận hưởng mùa hè cùng chúng tôi! Trong suốt tháng 8, bạn sẽ được giảm giá 20% cho mỗi giờ chơi vào buổi tối từ 18:00 đến 22:00. Điều này áp dụng cho cả các game hot nhất", "Giảm giá giờ chơi"));
        list.add(new KhuyenMaiSua(2, "Ngày Thứ Sáu Sốc", "2/1/2023", "25/11/2023", "Giảm giá 50% cho tất cả khách hàng vào ngày Thứ Sáu.", "Khách hàng", 50, "Hãy bắt đầu cuối tuần của bạn với mức giá sốc vào ngày Thứ Sáu! Tất cả khách hàng đến vào Thứ Sáu sẽ được giảm giá 50% cho mỗi giờ chơi.", "Giảm giá giờ chơi"));
        list.add(new KhuyenMaiSua(3, "Combo Học Tập", "5/1/2023", "31/12/2023", "Giảm 30% cho giờ chơi vào buổi trưa từ 11:00 đến 14:00.", "true", 40, "", "Giờ chơi miễn phí"));
        list.add(new KhuyenMaiSua(4, "Tháng Giảm Giá Đặc Biệt", "6/1/2023", "31/12/2023", "Giảm 30% cho giờ chơi vào buổi trưa từ 11:00 đến 14:00.", "false", 10, "", "Giờ chơi miễn phí"));
        list.add(new KhuyenMaiSua(5, "Tháng Của Game Thủ", "7/1/2023", "31/12/2023", "Giảm 30% cho giờ chơi vào buổi trưa từ 11:00 đến 14:00.", "true", 20, "Halloween đang đến gần! Đến với trang phục hóa trang của bạn và nhận ngay giảm giá 25% cho mỗi giờ chơi vào ngày lễ Halloween.", "Giảm giá giờ chơi"));
        list.add(new KhuyenMaiSua(6, "Ngày Lễ Hóa Trang", "8/1/2023", "31/12/2023", "Giảm 30% cho giờ chơi vào buổi trưa từ 11:00 đến 14:00.", "false", 30, "", "Giờ chơi miễn phí"));
        list.add(new KhuyenMaiSua(7, "Tháng Sinh Nhật Của Chúng Tôi", "9/1/2023", "31/12/2023", "Miễn phí 1 giờ chơi trong ngày sinh nhật của bạn", "true", 40, "Đặc biệt trong tháng này, vào các ngày Thứ Ba và Thứ Năm, tất cả game thủ sẽ được giảm giá 50% cho mỗi giờ chơi.", "Giảm giá giờ chơi"));
        list.add(new KhuyenMaiSua(8, "Giờ Vàng Buổi Trưa", "15/1/2023", "31/12/2023", "Giảm 30% cho giờ chơi vào buổi trưa từ 11:00 đến 14:00.", "false", 50, "", "Giảm giá giờ chơi"));
        list.add(new KhuyenMaiSua(9, "Cuộc Thi Esports", "25/1/2023", "20/11/2023", "Giảm 30% cho giờ chơi vào buổi trưa từ 11:00 đến 14:00.", "true", 60, "Tham gia cuộc thi Esports của chúng tôi và nhận ngay giảm giá 10% cho mỗi giờ chơi trong thời gian diễn ra cuộc thi.", "Giờ chơi miễn phí"));
        list.add(new KhuyenMaiSua(10, "Thử Nghiệm Game Mới", "15/1/2023", "31/12/2023", "Giảm 30% cho giờ chơi vào buổi trưa từ 11:00 đến 14:00.", "true", 60, "Dành cho những ai thích chơi game vào buổi trưa. Giờ chơi từ 11:00 đến 14:00 sẽ được giảm giá 30%.", "Giờ chơi miễn phí"));
        loadComboBox();
        loadTable();
        txtMoTa.setLineWrap(true); // Cho phép xuống dòng tự động
        txtMoTa.setWrapStyleWord(true); // Đảm bảo từ nguyên bị ngắt dòng
        show(0);
    }

    public void loadComboBox() {
        DefaultComboBoxModel dcb = (DefaultComboBoxModel) cbbSoLuong.getModel();
        dcb.removeAllElements();
        for (int i = 1; i < 101; i++) {
            dcb.addElement(i);
        }
    }

    public void loadTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblKhuyenMai.getModel();
        dtm.setRowCount(0);
        for (KhuyenMaiSua khuyenMai : list) {
            String dieuKien = khuyenMai.getDieuKien();
            if (dieuKien.equalsIgnoreCase("true")) {
                dieuKien = "Thành viên";
            } else {
                dieuKien = "Khách hàng";
            }
            Object[] rowData = {
                khuyenMai.getMa(),
                khuyenMai.getTen(),
                khuyenMai.getThoiGianBatDau(),
                khuyenMai.getThoiGianKetThuc(),
                khuyenMai.getGiaTri(),
                dieuKien,
                khuyenMai.getSoLuong(),
                khuyenMai.getMoTa(),
                khuyenMai.getLoaiKhuyenMai()
            };
            dtm.addRow(rowData);
        }
    }

    public void show(int index) {
        KhuyenMaiSua km = list.get(index);
        txtMa.setText(String.valueOf(km.getMa()));
        txtTen.setText(km.getTen());
        txtTimeBatDau.setText(km.getThoiGianBatDau());
        txtTimeKetThuc.setText(km.getThoiGianKetThuc());
        txtGiaTri.setText(km.getGiaTri());
        String cbo = km.getDieuKien();
        if (cbo.equalsIgnoreCase("true")) {
            cboDieuKien.setSelected(true);
        } else {
            cboDieuKien.setSelected(false);
        }
        cbbSoLuong.setSelectedItem(km.getSoLuong());
        txtMoTa.setText(km.getMoTa());
        cbbLoaiKhuyenMai.setSelectedItem(km.getLoaiKhuyenMai());
    }

    public KhuyenMaiSua getForm() {
        int ma = Integer.valueOf(txtMa.getText().trim());
        String ten = txtTen.getText().trim();
        String timeBatDau = txtTimeBatDau.getText().trim();
        String timeKetThuc = txtTimeKetThuc.getText().trim();
        String giaTri = txtGiaTri.getText().trim();
        Boolean dieuKienBoolean = cboDieuKien.isSelected();
        String dkien = String.valueOf(dieuKienBoolean);
        int soLuong = Integer.valueOf(cbbSoLuong.getSelectedItem().toString());
        String moTa = txtMoTa.getText();
        String loaiKhuyenMai = cbbLoaiKhuyenMai.getSelectedItem().toString();

        KhuyenMaiSua khuyenMai = new KhuyenMaiSua(ma, ten, timeBatDau, timeKetThuc, giaTri, dkien, soLuong, moTa, loaiKhuyenMai);
        return khuyenMai;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhuyenMai = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtGiaTri = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cbbLoaiKhuyenMai = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnTrangChu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        txtTimeBatDau = new javax.swing.JTextField();
        txtTimeKetThuc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cboDieuKien = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        cbbSoLuong = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("sua-khuyen-mai");

        tblKhuyenMai.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblKhuyenMai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã ", "Tên", "Thời gian bắt đầu", "Thời gian kết thúc", "Giá trị ", "Điều kiện ", "Số lượng ", "Mô tả ", "Loại khuyến mãi "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhuyenMaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhuyenMai);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("sua-khuyen-mai");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Sửa thông tin khuyến mãi ");

        jLabel3.setText("Mã:");

        jLabel4.setText("Tên :");

        txtMa.setText(" ");

        txtTen.setText(" ");

        jLabel5.setText("Mô tả:");

        jLabel6.setText("Thời gian bắt đầu:");

        jLabel10.setText("Thời gian kết thúc:");

        jLabel14.setText("Giá trị:");

        txtGiaTri.setText(" ");

        jLabel15.setText("Điều kiện áp dụng:");

        jLabel16.setText("Số lượng áp dụng:");

        jLabel17.setText("Loại khuyến mãi");

        cbbLoaiKhuyenMai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giảm giá giờ chơi", "Giờ chơi miễn phí", " " }));

        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThem.setText("Xác nhận");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnTrangChu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTrangChu.setText("Trang chủ");
        btnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuActionPerformed(evt);
            }
        });

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane2.setViewportView(txtMoTa);

        txtTimeBatDau.setText(" ");

        txtTimeKetThuc.setText(" ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 0));
        jLabel9.setText("*");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 0));
        jLabel11.setText("*");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 0));
        jLabel12.setText("*");

        cboDieuKien.setText("Thành viên");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 0));
        jLabel13.setText("*");

        cbbSoLuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel15)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(60, 60, 60))
                                .addComponent(jLabel16)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbbSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboDieuKien, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(214, 214, 214)
                                        .addComponent(btnTrangChu))
                                    .addComponent(cbbLoaiKhuyenMai, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)
                            .addComponent(jLabel14))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTen, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTimeBatDau)
                            .addComponent(txtTimeKetThuc)
                            .addComponent(txtGiaTri, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTimeBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTimeKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtGiaTri, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cboDieuKien))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cbbSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbbLoaiKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem)
                    .addComponent(btnTrangChu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhuyenMaiMouseClicked
        int row = tblKhuyenMai.getSelectedRow();
        show(row);
    }//GEN-LAST:event_tblKhuyenMaiMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        int row = tblKhuyenMai.getSelectedRow();
        KhuyenMaiSua km = getForm();
        list.set(row, km);
        loadTable();
        JOptionPane.showMessageDialog(this, "Bạn đã sửa thành công");
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuActionPerformed
        int tb = JOptionPane.showConfirmDialog(this, "Bạn đang quay về trang chủ", "Thông báo xác nhận", JOptionPane.YES_OPTION);
        if (tb == JOptionPane.YES_OPTION) {
            setVisible(false);
            ViewHome vh = new ViewHome();
            vh.setVisible(true);
        }
    }//GEN-LAST:event_btnTrangChuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateKhuyenMai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JComboBox<String> cbbLoaiKhuyenMai;
    private javax.swing.JComboBox<String> cbbSoLuong;
    private javax.swing.JCheckBox cboDieuKien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblKhuyenMai;
    private javax.swing.JTextField txtGiaTri;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTimeBatDau;
    private javax.swing.JTextField txtTimeKetThuc;
    // End of variables declaration//GEN-END:variables
}
