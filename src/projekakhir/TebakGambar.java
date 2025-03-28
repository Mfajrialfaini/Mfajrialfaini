/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projekakhir;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muhammad Fajri
 */
public class TebakGambar extends javax.swing.JFrame {
    
    private String username;
    
    private String jawabanBenar = "";
    private int currentSoal = 0;
    private int totalSoal = 5; 
    private int skor = 0; 
    private int kesempatan = 3; 

    /**
     * Creates new form TebakGambar
     */
    public TebakGambar(String nama) {
        initComponents();
        
        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new String[]{"NO", "Nama", "Score"});
        Tabel_TebakGambar.setModel(model);
        
        this.username = nama;
        updateSoal();
        loadHighScores();
        
        
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Score = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Jawaban = new javax.swing.JTextField();
        btn_Kembali = new javax.swing.JButton();
        btn_tebak = new javax.swing.JButton();
        Gambar1 = new javax.swing.JLabel();
        btn_ulang = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_TebakGambar = new javax.swing.JTable();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Super Positive", 0, 24)); // NOI18N
        jLabel2.setText("Score");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        Score.setFont(new java.awt.Font("Square721 Cn BT", 1, 18)); // NOI18N
        Score.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 410, 40));

        jLabel3.setFont(new java.awt.Font("Super Positive", 0, 24)); // NOI18N
        jLabel3.setText("Jawaban");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        Jawaban.setFont(new java.awt.Font("Square721 Cn BT", 1, 18)); // NOI18N
        Jawaban.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(Jawaban, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 410, 40));

        btn_Kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/Kembali.png"))); // NOI18N
        btn_Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KembaliActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 150, 50));

        btn_tebak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/Tebak.png"))); // NOI18N
        btn_tebak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tebakActionPerformed(evt);
            }
        });
        jPanel1.add(btn_tebak, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 150, 50));

        Gambar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/level1.png"))); // NOI18N
        Gambar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(Gambar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 360, 180));

        btn_ulang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/Ulang.png"))); // NOI18N
        btn_ulang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ulangActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ulang, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 150, 50));

        jLabel4.setFont(new java.awt.Font("Super Positive", 0, 24)); // NOI18N
        jLabel4.setText("HIGHSCORE DI GAME INI");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, -1, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        Tabel_TebakGambar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No", "Nama", "Score"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabel_TebakGambar.setEnabled(false);
        jScrollPane1.setViewportView(Tabel_TebakGambar);

        jPanel2.add(jScrollPane1);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 320, 340));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/Tebak Gambar.png"))); // NOI18N
        Background.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 960, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KembaliActionPerformed
        // TODO add your handling code here:
            this.dispose();
            MenuUtama menuUtama = new MenuUtama();
            menuUtama.setVisible(true);
    }//GEN-LAST:event_btn_KembaliActionPerformed

    private void btn_tebakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tebakActionPerformed
        try {
            String jawabanUser = Jawaban.getText().trim().toLowerCase();

            if (jawabanUser.equals(jawabanBenar.toLowerCase())) { 
                JOptionPane.showMessageDialog(this, "Benar!");
                skor++;
                currentSoal++;
                if (currentSoal < totalSoal) {
                    updateSoal();
                } else {
                    tampilkanSkorAkhir();
                }
            } else {
                kesempatan--;
                if (kesempatan > 0) {
                    JOptionPane.showMessageDialog(this, "Salah! Kesempatan tersisa: " + kesempatan);
                } else {
                    JOptionPane.showMessageDialog(this, "Kesempatan habis! Jawaban yang benar: " + jawabanBenar);
                    currentSoal++;
                    if (currentSoal < totalSoal) {
                        updateSoal();
                    } else {
                        tampilkanSkorAkhir();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace(); 
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_tebakActionPerformed

    private void btn_ulangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ulangActionPerformed
        // TODO add your handling code here:
        currentSoal = 0; 
        skor = 0; 
        kesempatan = 3; 

        Jawaban.setText("");
        Score.setText("");
        btn_tebak.setEnabled(true);

        // Perbarui soal
        updateSoal();

        JOptionPane.showMessageDialog(this, "Permainan diulang! Selamat bermain kembali.");
    }//GEN-LAST:event_btn_ulangActionPerformed

private void tampilkanSkorAkhir() {
    double hasilAkhir = (double) skor / totalSoal * 100;
    JOptionPane.showMessageDialog(this, "Game selesai! Skor Anda: " + hasilAkhir + "%");
    Score.setText("Score: " + hasilAkhir + "%");
    btn_tebak.setEnabled(false); 

    saveScoreToDatabase(username, hasilAkhir);

    addRowToTable(username, hasilAkhir);

    loadHighScores();
}



private void updateSoal() {
        switch (currentSoal) {
            case 0 -> {
                jawabanBenar = "gajah mada";
                Gambar1.setIcon(new ImageIcon("src/projekakhir/level1.png"));
            }
            case 1 -> {
                jawabanBenar = "gagak hitam";
                Gambar1.setIcon(new ImageIcon("src/projekakhir/level2.png"));
            }
            case 2 -> {
                jawabanBenar = "mari belajar";
                Gambar1.setIcon(new ImageIcon("src/projekakhir/level3.png"));
            }
            case 3 -> {
                jawabanBenar = "kursi kosong";
                Gambar1.setIcon(new ImageIcon("src/projekakhir/level4.png"));
            }
            case 4 -> {
                jawabanBenar = "makan tenaga";
                Gambar1.setIcon(new ImageIcon("src/projekakhir/level5.png"));
            }
        }
        Jawaban.setText("");
        kesempatan = 3;
    }


private void saveScoreToDatabase(String username, double score) {
        try (Connection conn = Koneksi.getConnection()) {
            String checkUserSql = "SELECT score FROM history WHERE pemain = ? AND namagame = ?";
            try (PreparedStatement checkStmt = conn.prepareStatement(checkUserSql)) {
                checkStmt.setString(1, username);
                checkStmt.setString(2, "Tebak Gambar");
                try (ResultSet rs = checkStmt.executeQuery()) {
                    if (rs.next()) {
                        String updateSql = "UPDATE history  SET score = GREATEST(score, ?) WHERE pemain = ? AND namagame = ?";
                        try (PreparedStatement updateStmt = conn.prepareStatement(updateSql)) {
                            updateStmt.setDouble(1, score);
                            updateStmt.setString(2, username);
                            updateStmt.setString(3, "Tebak Gambar");
                            updateStmt.executeUpdate();
                        }
                    } else {
                        String insertSql = "INSERT INTO history (pemain, score, namagame) VALUES (?, ?, ?)";
                        try (PreparedStatement insertStmt = conn.prepareStatement(insertSql)) {
                            insertStmt.setString(1, username);
                            insertStmt.setDouble(2, score);
                            insertStmt.setString(3, "Tebak Gambar");
                            insertStmt.executeUpdate();
                        }
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error menyimpan skor: " + e.getMessage());
        }
    }

    private void loadHighScores() {
    DefaultTableModel model = (DefaultTableModel) Tabel_TebakGambar.getModel();
    model.setRowCount(0); // Bersihkan tabel sebelum memuat data baru

    try (Connection conn = Koneksi.getConnection()) {
        String sql = "SELECT * FROM history WHERE namagame = 'Tebak Gambar' ORDER BY score DESC";
        try (PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {
            int rank = 1;
            while (rs.next()) {
                String nama = rs.getString("pemain");
                double score = rs.getDouble("score");
                String namagame = rs.getString("namagame");
                
                model.addRow(new Object[]{rank++, nama, score, namagame});
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error memuat skor: " + e.getMessage());
    }
}

private void addRowToTable(String pemain, double skor) {
    DefaultTableModel model = (DefaultTableModel) Tabel_TebakGambar.getModel();
    int rank = model.getRowCount() + 1; // Menambahkan baris berikutnya
    model.addRow(new Object[]{rank, pemain, skor});
}
    
    


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
            java.util.logging.Logger.getLogger(TebakGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TebakGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TebakGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TebakGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TebakGambar("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Gambar1;
    private javax.swing.JTextField Jawaban;
    private javax.swing.JTextField Score;
    private javax.swing.JTable Tabel_TebakGambar;
    private javax.swing.JButton btn_Kembali;
    private javax.swing.JButton btn_tebak;
    private javax.swing.JButton btn_ulang;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
