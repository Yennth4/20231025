package yen.view;

import home.ViewHome;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import yen.model.KhuyenMaiXoa;

public class XoaKhuyenMai extends javax.swing.JFrame {

    List<KhuyenMaiXoa> listSP = new ArrayList<>();

    public XoaKhuyenMai() {
        initComponents();

        listSP.add(new KhuyenMaiXoa(1, "Mùa hè thả ga", "30/08/2023", "Giảm 20% cho tất cả các giờ chơi trong buổi tối", "Hãy tận hưởng mùa hè cùng chúng tôi! Trong suốt tháng 8, bạn sẽ được giảm giá 20% cho mỗi giờ chơi vào buổi tối từ 18:00 đến 22:00. Điều này áp dụng cho cả các game hot nhất."));
        listSP.add(new KhuyenMaiXoa(2, "Ngày Thứ Sáu Sốc", "15/10/2023", "Giảm giá 50% cho tất cả khách hàng vào ngày Thứ Sáu", "Hãy bắt đầu cuối tuần của bạn với mức giá sốc vào ngày Thứ Sáu! Tất cả khách hàng đến vào Thứ Sáu sẽ được giảm giá 50% cho mỗi giờ chơi."));
        listSP.add(new KhuyenMaiXoa(3, "Combo Học Tập", "31/12/2023", "Giảm 30% cho giờ chơi vào buổi trưa từ 11:00 đến 14:00.", " Dành cho những ai thích chơi game vào buổi trưa. Giờ chơi từ 11:00 đến 14:00 sẽ được giảm giá 30%."));
        listSP.add(new KhuyenMaiXoa(4, "Tháng Của Game Thủ", "28/02/2024", "Giảm 15% cho tất cả game thủ trên 50 giờ chơi trong tháng.", "Tháng này là tháng của game thủ! Nếu bạn chơi hơn 50 giờ trong tháng, bạn sẽ nhận được giảm giá 15% cho toàn bộ tháng tiếp theo."));
        listSP.add(new KhuyenMaiXoa(5, "Ngày Lễ Hóa Trang", "31/10/2023", "25% cho tất cả khách hàng đến hóa trang vào Halloween.", "Halloween đang đến gần! Đến với trang phục hóa trang của bạn và nhận ngay giảm giá 25% cho mỗi giờ chơi vào ngày lễ Halloween."));
        listSP.add(new KhuyenMaiXoa(6, "Tháng Sinh Nhật Của Chúng Tôi", "15/11/2023", "Miễn phí 1 giờ chơi trong ngày sinh nhật của bạn.", "Chúc mừng sinh nhật của bạn! Hãy đến chơi tại quán vào ngày sinh nhật của bạn và bạn sẽ nhận ngay 1 giờ chơi miễn phí."));
        listSP.add(new KhuyenMaiXoa(7, "Tháng Giảm Giá Đặc Biệt", "30/09/2023", "Giảm 50% cho tất cả game thủ vào các ngày Thứ Ba và Thứ Năm.", "Đặc biệt trong tháng này, vào các ngày Thứ Ba và Thứ Năm, tất cả game thủ sẽ được giảm giá 50% cho mỗi giờ chơi."));
        listSP.add(new KhuyenMaiXoa(8, "Thử Nghiệm Game Mới", "10/12/2023", "Miễn phí 1 giờ chơi cho mỗi giờ trải nghiệm game mới.", "Chúng tôi có các game mới hấp dẫn cho bạn thử nghiệm. Mỗi giờ trải nghiệm game mới đều được tặng 1 giờ chơi miễn phí."));
        listSP.add(new KhuyenMaiXoa(9, "Cuộc Thi Esports", "20/11/2023", "Giảm 10% cho tất cả game thủ tham gia cuộc thi Esports.", "Tham gia cuộc thi Esports của chúng tôi và nhận ngay giảm giá 10% cho mỗi giờ chơi trong thời gian diễn ra cuộc thi."));
        listSP.add(new KhuyenMaiXoa(10, "Giờ Vàng Buổi Trưa", "31/12/2023", "Giảm 30% cho giờ chơi vào buổi trưa từ 11:00 đến 14:00.", "Dành cho những ai thích chơi game vào buổi trưa. Giờ chơi từ 11:00 đến 14:00 sẽ được giảm giá 30%."));

        loadTable();
        KhuyenMaiXoa km = listSP.get(0);
        show(0);
        txtMoTa.setLineWrap(true); // Cho phép xuống dòng tự động
        txtMoTa.setWrapStyleWord(true); // Đảm bảo từ nguyên bị ngắt dòng

    }

    public void loadTable() {
        DefaultTableModel dtm = (DefaultTableModel) tbl.getModel();
        dtm.setRowCount(0);
        for (KhuyenMaiXoa khuyenMai : listSP) {
            Object[] rowData = {
                khuyenMai.getSTT(),
                khuyenMai.getTen(),
                khuyenMai.getThoiGian(),
                khuyenMai.getGiaTri(),
                khuyenMai.getMoTa()
            };
            dtm.addRow(rowData);
        }
    }

    public void show(int index) {
        KhuyenMaiXoa km = listSP.get(index);
        txtTen.setText(km.getTen());
        txtHSD.setText(km.getThoiGian());
        txtGiaTri.setText(km.getGiaTri());
        txtMoTa.setText(km.getMoTa());
    }

    public void clear() {
        txtTen.setText("");
        txtHSD.setText("");
        txtGiaTri.setText("");
        txtMoTa.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtHSD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtGiaTri = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        btnXoa = new javax.swing.JButton();
        btnTrangChu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("xoa-khuyen-mai");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Danh sách khuyến mãi ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Xóa khuyến mãi");

        tbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên", "Hạn sử dụng", "Giá trị giảm giá", "Mô tả chi tiết"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel3.setText("Tên :");

        jLabel4.setText("Thời hạn sử dụng :");

        jLabel5.setText("Giá trị sử dụng :");

        jLabel6.setText("Mô tả :");

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane1.setViewportView(txtMoTa);

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setText("Xác nhận");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnTrangChu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTrangChu.setText("Trang chủ");
        btnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnXoa)
                                .addGap(149, 149, 149)
                                .addComponent(btnTrangChu))
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTen, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(txtHSD)
                            .addComponent(txtGiaTri))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtGiaTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoa)
                    .addComponent(btnTrangChu))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        int row = tbl.getSelectedRow();
        show(row);
    }//GEN-LAST:event_tblMouseClicked

    private void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuActionPerformed
        int tb = JOptionPane.showConfirmDialog(this, "Bạn đang quay về trang chủ", "Thông báo xác nhận", JOptionPane.YES_OPTION);
        if (tb == JOptionPane.YES_OPTION) {
            setVisible(false);
            ViewHome vh = new ViewHome();
            vh.setVisible(true);
        }
    }//GEN-LAST:event_btnTrangChuActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int row = tbl.getSelectedRow();
        listSP.remove(row);
        loadTable();
        clear();
        show(0);
        JOptionPane.showMessageDialog(this, "Bạn đã xóa thành công");
    }//GEN-LAST:event_btnXoaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(XoaKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XoaKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XoaKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XoaKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XoaKhuyenMai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtGiaTri;
    private javax.swing.JTextField txtHSD;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
