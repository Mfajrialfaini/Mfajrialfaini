package projekakhir;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Daftar extends javax.swing.JFrame {

    public static int user_id;
    public static String username;
    
    public Daftar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Daftar_sandi = new javax.swing.JTextField();
        Daftar_email = new javax.swing.JTextField();
        Daftar_nama = new javax.swing.JTextField();
        Daftar_Daftar = new javax.swing.JButton();
        Daftar_Kembali = new javax.swing.JButton();
        Daftar_Reset = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(940, 650));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(750, 520));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Daftar_sandi.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        Daftar_sandi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(Daftar_sandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 420, 40));

        Daftar_email.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        Daftar_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(Daftar_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 420, 40));

        Daftar_nama.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        Daftar_nama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(Daftar_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 420, 40));

        Daftar_Daftar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/Daftar.png"))); // NOI18N
        Daftar_Daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Daftar_DaftarActionPerformed(evt);
            }
        });
        jPanel1.add(Daftar_Daftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 150, 50));

        Daftar_Kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/Kembali.png"))); // NOI18N
        Daftar_Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Daftar_KembaliActionPerformed(evt);
            }
        });
        jPanel1.add(Daftar_Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 150, 50));

        Daftar_Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/reset.png"))); // NOI18N
        Daftar_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Daftar_ResetActionPerformed(evt);
            }
        });
        jPanel1.add(Daftar_Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 150, 50));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/4.png"))); // NOI18N
        Background.setInheritsPopupMenu(false);
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public static String getUsername() {
    return username;
}
    private void Daftar_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Daftar_ResetActionPerformed
        Daftar_nama.setText("");
        Daftar_email.setText("");
        Daftar_sandi.setText("");
    }//GEN-LAST:event_Daftar_ResetActionPerformed

    private void Daftar_KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Daftar_KembaliActionPerformed
       this.dispose();

        Welcome Welcome = new Welcome();
        Welcome.setVisible(true);
    }//GEN-LAST:event_Daftar_KembaliActionPerformed

    private void Daftar_DaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Daftar_DaftarActionPerformed
        try (Connection conn = Koneksi.getConnection()) {
    if (Daftar_nama.getText().isEmpty() || Daftar_email.getText().isEmpty() || Daftar_sandi.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Pastikan semua data telah diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String checkNameSql = "SELECT COUNT(*) FROM user WHERE nama = ?";
    try (PreparedStatement checkStmt = conn.prepareStatement(checkNameSql)) {
        checkStmt.setString(1, Daftar_nama.getText());

        ResultSet rsCheck = checkStmt.executeQuery();
        if (rsCheck.next() && rsCheck.getInt(1) > 0) {
            JOptionPane.showMessageDialog(null, "Nama sudah digunakan! Coba dengan nama yang lain.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }

    String checkEmailSql = "SELECT COUNT(*) FROM user WHERE email = ?";
    try (PreparedStatement checkEmailStmt = conn.prepareStatement(checkEmailSql)) {
        checkEmailStmt.setString(1, Daftar_email.getText());

        ResultSet rsCheckEmail = checkEmailStmt.executeQuery();
        if (rsCheckEmail.next() && rsCheckEmail.getInt(1) > 0) {
            JOptionPane.showMessageDialog(null, "Email sudah digunakan! Coba dengan email yang lain.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }

    // Menyimpan data pengguna baru ke database
    String sql = "INSERT INTO user (nama, email, sandi) VALUES (?, ?, ?)";
    try (PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
        ps.setString(1, Daftar_nama.getText());
        ps.setString(2, Daftar_email.getText());
        ps.setString(3, Daftar_sandi.getText());

        int rowsAffected = ps.executeUpdate(); 
        if (rowsAffected > 0) {
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    int userId = rs.getInt(1);
                    System.out.println("Pengguna baru dengan ID: " + userId);
                }
            }

            JOptionPane.showMessageDialog(null, "Pendaftaran berhasil!", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();

            Welcome Welcome = new Welcome();
            Welcome.setVisible(true);
        }
    } catch (SQLException e) {
        System.out.println("Error saat menyimpan data: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menyimpan data: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
    }

} catch (SQLException e) {
    System.out.println("Error saat koneksi database: " + e.getMessage());
    JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat koneksi ke database: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_Daftar_DaftarActionPerformed

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
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Daftar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Daftar_Daftar;
    private javax.swing.JButton Daftar_Kembali;
    private javax.swing.JButton Daftar_Reset;
    private javax.swing.JTextField Daftar_email;
    private javax.swing.JTextField Daftar_nama;
    private javax.swing.JTextField Daftar_sandi;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
