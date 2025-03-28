package projekakhir;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MenuUtama extends javax.swing.JFrame {


    public MenuUtama() {
        initComponents();
        loadProfileData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPaneCustom1 = new raven.tabbed.TabbedPaneCustom();
        jPanel1 = new javax.swing.JPanel();
        TebakAngka = new javax.swing.JButton();
        Tictactoe = new javax.swing.JButton();
        TebakGambar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Profil_Nama = new javax.swing.JTextField();
        Profil_Email = new javax.swing.JTextField();
        Profil_Sandi = new javax.swing.JTextField();
        Kembali = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 0));
        setPreferredSize(new java.awt.Dimension(945, 657));
        setResizable(false);

        tabbedPaneCustom1.setBackground(new java.awt.Color(255, 102, 0));
        tabbedPaneCustom1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        tabbedPaneCustom1.setPreferredSize(new java.awt.Dimension(945, 657));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TebakAngka.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/btn Tebak Angka.png"))); // NOI18N
        TebakAngka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TebakAngkaActionPerformed(evt);
            }
        });
        jPanel1.add(TebakAngka, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 180, 80));

        Tictactoe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/silang.png"))); // NOI18N
        Tictactoe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TictactoeActionPerformed(evt);
            }
        });
        jPanel1.add(Tictactoe, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 180, 80));

        TebakGambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/btn Tebak Gambar.png"))); // NOI18N
        TebakGambar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TebakGambarActionPerformed(evt);
            }
        });
        jPanel1.add(TebakGambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 180, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/Menu Utama.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 620));

        tabbedPaneCustom1.addTab("MENU", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Profil_Nama.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        Profil_Nama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Profil_Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Profil_NamaActionPerformed(evt);
            }
        });
        jPanel2.add(Profil_Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 420, 40));

        Profil_Email.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        Profil_Email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.add(Profil_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 420, 40));

        Profil_Sandi.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        Profil_Sandi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.add(Profil_Sandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 420, 40));

        Kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/Kembali.png"))); // NOI18N
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });
        jPanel2.add(Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 150, 50));

        Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/Update.png"))); // NOI18N
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel2.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 150, 50));

        hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/Hapus.png"))); // NOI18N
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        jPanel2.add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 150, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/6.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        tabbedPaneCustom1.addTab("Profil", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabbedPaneCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneCustom1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TebakAngkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TebakAngkaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        String nama = Profil_Nama.getText();

        TebakAngka TebakAngka = new TebakAngka(nama);
        TebakAngka.setVisible(true);
    }//GEN-LAST:event_TebakAngkaActionPerformed

private void loadProfileData() {
    // Pastikan user_id valid
    if (Login.user_id <= 0) {
        JOptionPane.showMessageDialog(null, "ID pengguna tidak valid. Harap login terlebih dahulu.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try (Connection conn = Koneksi.getConnection()) {
        // Query untuk mendapatkan data pengguna
        String sql = "SELECT nama, email, sandi FROM user WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, Login.user_id);  // Pastikan user_id yang benar digunakan

        // Eksekusi query
        java.sql.ResultSet rs = ps.executeQuery();

        // Jika data ditemukan
        if (rs.next()) {
            // Setel data ke TextField
            Profil_Nama.setText(rs.getString("nama"));
            Profil_Email.setText(rs.getString("email"));
            Profil_Sandi.setText(rs.getString("sandi"));
        } else {
            // Jika tidak ada data untuk user_id tersebut
            JOptionPane.showMessageDialog(null, "Data pengguna tidak ditemukan. Pastikan Anda sudah login dengan benar.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        // Jika terjadi kesalahan saat eksekusi query
        System.out.println("Error saat memuat data profil: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat memuat data profil: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
    }
}

    
    
    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
if (Profil_Nama.getText().isEmpty() || Profil_Email.getText().isEmpty() || Profil_Sandi.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Pastikan semua data telah diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(
            null,
            "Apakah Anda yakin ingin memperbarui data ini?",
            "Konfirmasi Pembaruan",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
    );

    if (confirm == JOptionPane.YES_OPTION) {
        try (Connection conn = Koneksi.getConnection()) {
            conn.setAutoCommit(false); // Mulai transaksi

            // Query untuk memperbarui data pengguna
            String sql = "UPDATE user SET nama = ?, email = ?, sandi = ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);

            // Ambil data dari TextField
            ps.setString(1, Profil_Nama.getText());
            ps.setString(2, Profil_Email.getText());
            ps.setString(3, Profil_Sandi.getText());
            ps.setInt(4, Login.user_id);

            // Eksekusi query
            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated > 0) {
                // Update nama di tabel riwayat
                String updateRiwayat = "UPDATE riwayat SET pemain = ? WHERE pemain = ?";
                PreparedStatement psRiwayat = conn.prepareStatement(updateRiwayat);
                psRiwayat.setString(1, Profil_Nama.getText()); // Nama baru
                psRiwayat.setString(2, Login.username); // Nama lama
                psRiwayat.executeUpdate();

                // Update nama di tabel history
                String updateHistory = "UPDATE history SET pemain = ? WHERE pemain = ?";
                PreparedStatement psHistory = conn.prepareStatement(updateHistory);
                psHistory.setString(1, Profil_Nama.getText()); // Nama baru
                psHistory.setString(2, Login.username); // Nama lama
                psHistory.executeUpdate();


                conn.commit(); // Commit transaksi
                JOptionPane.showMessageDialog(null, "Profil berhasil diperbarui dan data riwayat diperbarui!", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
            } else {
                conn.rollback(); // Batalkan jika gagal
                JOptionPane.showMessageDialog(null, "Profil gagal diperbarui! Pastikan data valid.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            System.out.println("Error saat memperbarui data: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat memperbarui data: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Pembaruan dibatalkan.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_UpdateActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        // TODO add your handling code here:
         this.dispose();

        Welcome Welcome = new Welcome();
        Welcome.setVisible(true);
    }//GEN-LAST:event_KembaliActionPerformed

    private void Profil_NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Profil_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Profil_NamaActionPerformed

    private void TictactoeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TictactoeActionPerformed
        // TODO add your handling code here:
        this.dispose();

        TicTacToe TicTacToe = new TicTacToe();
        TicTacToe.setVisible(true);
    }//GEN-LAST:event_TictactoeActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
         int confirm = JOptionPane.showConfirmDialog(
        null,
        "Apakah Anda yakin ingin menghapus akun Anda? Semua data terkait juga akan dihapus dan tidak dapat dikembalikan.",
        "Konfirmasi Penghapusan",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.WARNING_MESSAGE
    );

    if (confirm == JOptionPane.YES_OPTION) {
        try (Connection conn = Koneksi.getConnection()) {
            conn.setAutoCommit(false); // Mulai transaksi

            // Query untuk menghapus data di tabel riwayat
            String deleteRiwayat = "DELETE FROM riwayat WHERE pemain = ?";
            PreparedStatement psRiwayat = conn.prepareStatement(deleteRiwayat);
            psRiwayat.setString(1, Login.username);
            psRiwayat.executeUpdate();

            // Query untuk menghapus data di tabel history
            String deleteHistory = "DELETE FROM history WHERE pemain = ?";
            PreparedStatement psHistory = conn.prepareStatement(deleteHistory);
            psHistory.setString(1, Login.username);
            psHistory.executeUpdate();


            // Query untuk menghapus akun pengguna dari tabel user
            String deleteUser = "DELETE FROM user WHERE id = ?";
            PreparedStatement psUser = conn.prepareStatement(deleteUser);
            psUser.setInt(1, Login.user_id);
            int rowsDeleted = psUser.executeUpdate();

            if (rowsDeleted > 0) {
                conn.commit(); // Komit transaksi
                JOptionPane.showMessageDialog(null, "Akun dan data terkait berhasil dihapus. Aplikasi akan keluar.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();

                // Redirect ke halaman awal aplikasi
                Welcome welcome = new Welcome();
                welcome.setVisible(true);
            } else {
                conn.rollback(); // Rollback jika penghapusan akun gagal
                JOptionPane.showMessageDialog(null, "Gagal menghapus akun. Pastikan data valid.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            System.out.println("Error saat menghapus akun: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menghapus akun: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Penghapusan akun dibatalkan.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_hapusActionPerformed

    private void TebakGambarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TebakGambarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        String nama = Profil_Nama.getText();

        TebakGambar TebakGambar = new TebakGambar(nama);
        TebakGambar.setVisible(true);
    }//GEN-LAST:event_TebakGambarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kembali;
    private javax.swing.JTextField Profil_Email;
    private javax.swing.JTextField Profil_Nama;
    private javax.swing.JTextField Profil_Sandi;
    private javax.swing.JButton TebakAngka;
    private javax.swing.JButton TebakGambar;
    private javax.swing.JButton Tictactoe;
    private javax.swing.JButton Update;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private raven.tabbed.TabbedPaneCustom tabbedPaneCustom1;
    // End of variables declaration//GEN-END:variables
}
