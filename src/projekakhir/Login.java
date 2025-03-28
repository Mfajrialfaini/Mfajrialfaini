package projekakhir;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Login extends javax.swing.JFrame {
    
    public static int user_id;
    public static String username;
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Login_sandi = new javax.swing.JTextField();
        Login_nama = new javax.swing.JTextField();
        Login_email = new javax.swing.JTextField();
        Login_Kembali = new javax.swing.JButton();
        Login_Reset = new javax.swing.JButton();
        Login_Login = new javax.swing.JButton();
        Bg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(750, 520));

        jPanel1.setPreferredSize(new java.awt.Dimension(750, 520));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login_sandi.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        Login_sandi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(Login_sandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 420, 40));

        Login_nama.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        Login_nama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(Login_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 420, 40));

        Login_email.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        Login_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Login_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_emailActionPerformed(evt);
            }
        });
        jPanel1.add(Login_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 420, 40));

        Login_Kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/Kembali.png"))); // NOI18N
        Login_Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_KembaliActionPerformed(evt);
            }
        });
        jPanel1.add(Login_Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 150, 50));

        Login_Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/reset.png"))); // NOI18N
        Login_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ResetActionPerformed(evt);
            }
        });
        jPanel1.add(Login_Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 150, 50));

        Login_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/login.png"))); // NOI18N
        Login_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_LoginActionPerformed(evt);
            }
        });
        jPanel1.add(Login_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 150, 50));

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/MenuLogin.png"))); // NOI18N
        Bg.setPreferredSize(new java.awt.Dimension(940, 640));
        jPanel1.add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 690));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 520, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Login_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Login_emailActionPerformed

    private void Login_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ResetActionPerformed
        // TODO add your handling code here:
        Login_nama.setText("");
        Login_email.setText("");
        Login_sandi.setText("");
    }//GEN-LAST:event_Login_ResetActionPerformed
public static String getUsername() {
    return username;
}

    private void Login_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_LoginActionPerformed
       if (Login_nama.getText().isEmpty() || Login_email.getText().isEmpty() || Login_sandi.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Pastikan semua data telah diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
    return;
}

// Menghubungkan ke database
try (Connection conn = Koneksi.getConnection()) {
    String sql = "SELECT id, nama, sandi FROM user WHERE nama = ? AND email = ?";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, Login_nama.getText());
        ps.setString(2, Login_email.getText());

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            String storedPassword = rs.getString("sandi");  // Ambil sandi yang tersimpan

            // Periksa apakah sandi yang dimasukkan sesuai dengan yang ada di database
            if (storedPassword.equals(Login_sandi.getText())) {
                // Jika berhasil login
                user_id = rs.getInt("id");
                username = rs.getString("nama");

                JOptionPane.showMessageDialog(null, "Login berhasil! Selamat datang, " + username, "INFORMASI", JOptionPane.INFORMATION_MESSAGE);

                // Pindah ke menu utama
                this.dispose();
                MenuUtama menuUtama = new MenuUtama();
                menuUtama.setVisible(true);
            } else {
                // Jika sandi tidak sesuai
                JOptionPane.showMessageDialog(null, "Sandi tidak sesuai!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Jika nama atau email tidak ditemukan
            JOptionPane.showMessageDialog(null, "Nama atau Email tidak ditemukan!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        System.out.println("Error saat login: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat login: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
    }
} catch (SQLException e) {
    System.out.println("Error saat koneksi database: " + e.getMessage());
    JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat koneksi ke database: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_Login_LoginActionPerformed

    private void Login_KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_KembaliActionPerformed
        // TODO add your handling code here:
         this.dispose();

        Welcome Welcome = new Welcome();
        Welcome.setVisible(true);
    }//GEN-LAST:event_Login_KembaliActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

 /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bg;
    private javax.swing.JButton Login_Kembali;
    private javax.swing.JButton Login_Login;
    private javax.swing.JButton Login_Reset;
    private javax.swing.JTextField Login_email;
    private javax.swing.JTextField Login_nama;
    private javax.swing.JTextField Login_sandi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
