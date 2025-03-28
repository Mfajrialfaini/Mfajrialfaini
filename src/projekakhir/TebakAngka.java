package projekakhir;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class TebakAngka extends javax.swing.JFrame {
 
    private String username;
    
    public TebakAngka(String nama) {
        initComponents();
        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new String[]{"NO", "Nama", "Score", "Nama Game"});
        HighScore_TebakAngka.setModel(model);

        this.username = nama;

        loadHighScoresawal();
        loadHighScores("");
        loadHighScoresawal();
        updateSoalAndClue();

    }
    
    private int currentSoal = 0;
    private int jawabanBenar = 46;
    private int clueIndex = 0;
    private int kesempatan = 3;
    private int poin = 0;
//    private int skorAkhir = 0;
    private int totalSkor = 0; // Untuk menyimpan total skor dari semua soal
    private final int jumlahSoal = 3;
    
    String[] clueImages; 
    private String[] soalImages1 = { 
    "src/projekakhir/gambar 1.png", 
    "src/projekakhir/gambar 2.png", 
    "src/projekakhir/gambar3.png" 
};
    private String[] soalImages2 = { 
        "src/projekakhir/gambar4.png", 
        "src/projekakhir/gambar5.png", 
        "src/projekakhir/gambar6.png" 
    };
    private String[] soalImages3 = { 
        "src/projekakhir/gambar7.png", 
        "src/projekakhir/gambar8.png", 
        "src/projekakhir/gambar9.png" 
    };
    private String[] clueImages1 = { 
        "src/projekakhir/pertama1.png", 
        "src/projekakhir/pertama2.png", 
        "src/projekakhir/pertama3.png", 
        "src/projekakhir/pertama4.png" 
    };
    private String[] clueImages2 = { 
        "src/projekakhir/pertama5.png", 
        "src/projekakhir/pertama6.png", 
        "src/projekakhir/pertama7.png", 
        "src/projekakhir/pertama8.png" 
    };
    private String[] clueImages3 = { 
        "src/projekakhir/pertama9.png", 
        "src/projekakhir/pertama10.png", 
        "src/projekakhir/pertama11.png", 
        "src/projekakhir/pertama12.png" 
    };
 


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Gambar3 = new javax.swing.JButton();
        btn_Gambar1 = new javax.swing.JButton();
        btn_Gambar2 = new javax.swing.JButton();
        txt_jawaban = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HighScore_TebakAngka = new javax.swing.JTable();
        btn_Kembali = new javax.swing.JButton();
        btn_Clue = new javax.swing.JButton();
        btn_Tebak = new javax.swing.JButton();
        btn_ulang = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_Clue = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Gambar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/Gambar3.png"))); // NOI18N
        btn_Gambar3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(btn_Gambar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 140, 80));

        btn_Gambar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/Gambar 1.png"))); // NOI18N
        btn_Gambar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(btn_Gambar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 140, 80));

        btn_Gambar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/Gambar 2.png"))); // NOI18N
        btn_Gambar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(btn_Gambar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 140, 80));

        txt_jawaban.setFont(new java.awt.Font("Square721 Cn BT", 1, 18)); // NOI18N
        txt_jawaban.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txt_jawaban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jawabanActionPerformed(evt);
            }
        });
        jPanel1.add(txt_jawaban, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 180, 40));

        jLabel3.setFont(new java.awt.Font("Super Positive", 0, 24)); // NOI18N
        jLabel3.setText("HIGHSCORE DI GAME INI");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, -1, 30));

        jLabel1.setFont(new java.awt.Font("Super Positive", 0, 24)); // NOI18N
        jLabel1.setText("Jawaban");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        HighScore_TebakAngka.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        HighScore_TebakAngka.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NO", "Nama", "Score"
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
        HighScore_TebakAngka.setAutoscrolls(false);
        HighScore_TebakAngka.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        HighScore_TebakAngka.setEnabled(false);
        jScrollPane1.setViewportView(HighScore_TebakAngka);

        jPanel2.add(jScrollPane1);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 380, 250));

        btn_Kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/Kembali.png"))); // NOI18N
        btn_Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KembaliActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 150, 50));

        btn_Clue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/Clue.png"))); // NOI18N
        btn_Clue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClueActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Clue, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 150, 50));

        btn_Tebak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/Tebak.png"))); // NOI18N
        btn_Tebak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TebakActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Tebak, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 150, 50));

        btn_ulang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/Ulang.png"))); // NOI18N
        btn_ulang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ulangActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ulang, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 150, 50));

        jLabel4.setFont(new java.awt.Font("Super Positive", 0, 24)); // NOI18N
        jLabel4.setText("CLUE JAWABAN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 180, -1));

        txt_Clue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/pertama4.png"))); // NOI18N
        txt_Clue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel1.add(txt_Clue, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 410, 150));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/Tanya.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 50, 80));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/Tambah.png"))); // NOI18N
        jLabel6.setText("jLabel5");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 50, 70));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/Tambah.png"))); // NOI18N
        jLabel7.setText("jLabel5");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 50, 70));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/Samadengan.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 50, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhir/Tebak Angka.png"))); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

private void updateSoalAndClue() {
    if (currentSoal == 0) {
        jawabanBenar = 46; 
        clueImages = clueImages1;

        // Set gambar soal di tiga label
        btn_Gambar1.setIcon(new ImageIcon("src/projekakhir/gambar 1.png")); 
        btn_Gambar2.setIcon(new ImageIcon("src/projekakhir/gambar 2.png")); 
        btn_Gambar3.setIcon(new ImageIcon("src/projekakhir/gambar3.png")); 
    } else if (currentSoal == 1) {
        jawabanBenar = 224; // Jawaban untuk soal 2
        clueImages = clueImages2;

        // Set gambar soal di tiga label
        btn_Gambar1.setIcon(new ImageIcon("src/projekakhir/gambar4.png")); 
        btn_Gambar2.setIcon(new ImageIcon("src/projekakhir/gambar5.png")); 
        btn_Gambar3.setIcon(new ImageIcon("src/projekakhir/gambar6.png")); 
    } else if (currentSoal == 2) {
        jawabanBenar = 2085; // Jawaban untuk soal 3
        clueImages = clueImages3;

        // Set gambar soal di tiga label
        btn_Gambar1.setIcon(new ImageIcon("src/projekakhir/gambar7.png")); 
        btn_Gambar2.setIcon(new ImageIcon("src/projekakhir/gambar8.png")); 
        btn_Gambar3.setIcon(new ImageIcon("src/projekakhir/gambar9.png")); 
    }

    // Reset clue display
    clueIndex = 0;
    txt_Clue.setIcon(null); // Menghapus clue sebelumnya
    kesempatan = 3; 
            
}

private void saveScoreToDatabase(String username, double scoreAkhir) {
    try (Connection conn = Koneksi.getConnection()) {
        if (username == null || username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama pengguna kosong! Pastikan Anda login terlebih dahulu.");
            return;
        }

        // Pertama, cek apakah pemain sudah ada di tabel 'riwayat', jika belum insert, jika ada update skor tertinggi
        String checkUserSql = "SELECT score FROM riwayat WHERE pemain = ?";
        try (PreparedStatement pstCheck = conn.prepareStatement(checkUserSql)) {
            pstCheck.setString(1, username); // Nama pemain

            try (ResultSet rs = pstCheck.executeQuery()) {
                if (rs.next()) {
                    // Jika nama sudah ada, update dengan skor tertinggi
                    String updateSql = "UPDATE riwayat SET score = GREATEST(score, ?) WHERE pemain = ?";
                    try (PreparedStatement pstUpdate = conn.prepareStatement(updateSql)) {
                        pstUpdate.setDouble(1, scoreAkhir);
                        pstUpdate.setString(2, username);
                        pstUpdate.executeUpdate();
                    }
                } else {
                    // Jika nama belum ada, insert data pemain dan skor
                    String insertSql = "INSERT INTO riwayat (pemain, score, namagame) VALUES (?, ?, ?)";
                    try (PreparedStatement pstInsert = conn.prepareStatement(insertSql)) {
                        pstInsert.setString(1, username);   // Nama pemain
                        pstInsert.setDouble(2, scoreAkhir); // Skor akhir
                        pstInsert.setString(3, "Tebak Angka"); // Nama game
                        pstInsert.executeUpdate();
                    }
                }
            }
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error menyimpan skor: " + e.getMessage());
    }
}

private void loadHighScores(String username) {
    DefaultTableModel model = (DefaultTableModel) HighScore_TebakAngka.getModel();
    model.setRowCount(0); 
    
    try (Connection conn = Koneksi.getConnection()) {
        String sql = "SELECT * FROM riwayat WHERE namagame = 'Tebak Angka' ORDER BY score DESC";
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            try (ResultSet rs = pst.executeQuery()) {
                int rank = 1; // Nomor urut mulai dari 1
                while (rs.next()) {
                    String nama = rs.getString("pemain"); // Nama pemain diambil dari tabel riwayat
                    double score = rs.getDouble("score");
                    String namagame = rs.getString("namagame");

                    // Tambahkan data ke tabel dengan nomor urut
                    model.addRow(new Object[]{rank++, nama, score, namagame});
                }
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error memuat skor: " + e.getMessage());
    }
}

private void loadHighScoresawal() {
    DefaultTableModel model = (DefaultTableModel) HighScore_TebakAngka.getModel();
    model.setRowCount(0); // Reset tabel untuk menghindari duplikasi data

    try (Connection conn = Koneksi.getConnection()) {
        String sql = "SELECT * FROM riwayat ORDER BY score DESC"; // Ambil semua data dari tabel riwayat
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            try (ResultSet rs = pst.executeQuery()) {
                int rank = 1; // Nomor urut mulai dari 1
                while (rs.next()) {
                    String nama = rs.getString("pemain"); // Nama pemain
                    double score = rs.getDouble("score"); // Skor pemain
                    String namagame = rs.getString("namagame"); // Nama game

                    // Tambahkan data ke tabel dengan nomor urut
                    model.addRow(new Object[]{rank++, nama, score, namagame});
                }
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error memuat skor: " + e.getMessage());
    }
}


private void loadHighScoresOnStartup() {
    DefaultTableModel model = (DefaultTableModel) HighScore_TebakAngka.getModel();
    model.setRowCount(0); // Reset tabel sebelum mengisi ulang

    try (Connection conn = Koneksi.getConnection()) {
        String sql = "SELECT * FROM riwayat WHERE namagame = 'Tebak Angka' ORDER BY score DESC";
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            try (ResultSet rs = pst.executeQuery()) {
                int rank = 1; // Nomor urut mulai dari 1
                while (rs.next()) {
                    String nama = rs.getString("pemain");
                    double score = rs.getDouble("score");
                    String namagame = rs.getString("namagame");

                    // Tambahkan data ke tabel dengan nomor urut
                    model.addRow(new Object[]{rank++, nama, score, namagame});
                }
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error memuat skor: " + e.getMessage());
    }
}


    private void btn_ClueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClueActionPerformed
        // TODO add your handling code here:
        if (clueImages.length > 0) {
        String imagePath = clueImages[clueIndex];
        ImageIcon clueIcon = new ImageIcon(imagePath);
        txt_Clue.setIcon(clueIcon); // Menampilkan gambar clue

        // Update clueIndex ke gambar berikutnya
        clueIndex = (clueIndex + 1) % clueImages.length;
    }
    }//GEN-LAST:event_btn_ClueActionPerformed

private double calculateScore(int correctAnswers, int totalQuestions, int remainingChances) {
    double totalScore = 0.0;

    totalScore = correctAnswers * 100; 

    totalScore += remainingChances * 50; 

    return totalScore;
}


    
    private void btn_TebakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TebakActionPerformed
          try {
        int tebakan = Integer.parseInt(txt_jawaban.getText()); // Mengambil inputan tebakan

        if (tebakan == jawabanBenar) {
            JOptionPane.showMessageDialog(this, "Jawaban Benar!");
            totalSkor++; 
            currentSoal++;
            txt_jawaban.setText(null);

            if (currentSoal >= jumlahSoal) {
                // Jika semua soal telah dijawab, hitung skor akhir
                double skorAkhir = calculateScore(totalSkor, jumlahSoal, kesempatan);

                // Tampilkan skor akhir
                JOptionPane.showMessageDialog(this, "Skor Akhir Anda: " + skorAkhir);
                txt_jawaban.setText(null);

                // Simpan skor akhir ke database
                saveScoreToDatabase(username, skorAkhir); // Menyimpan scoreAkhir ke database
                loadHighScores(username); // Memuat daftar skor tertinggi
                btn_Tebak.setEnabled(false); // Menonaktifkan tombol
            } else {
                updateSoalAndClue(); // Pindah ke soal berikutnya
            }
        } else {
            kesempatan--;
            if (kesempatan == 0) {
                JOptionPane.showMessageDialog(this, "Kesempatan habis! Jawaban yang benar: " + jawabanBenar);
                currentSoal++; // Pindah ke soal berikutnya
                txt_jawaban.setText(null);

                if (currentSoal >= jumlahSoal) {
                    double skorAkhir = calculateScore(totalSkor, jumlahSoal, kesempatan);
                    JOptionPane.showMessageDialog(this, "Skor Akhir Anda: " + skorAkhir);

                    saveScoreToDatabase(username, skorAkhir); 
                    loadHighScores(username);
                    txt_jawaban.setText(null);
                } else {
                    updateSoalAndClue(); 
                }
            } else {
                JOptionPane.showMessageDialog(this, "Jawaban salah! Kesempatan tersisa: " + kesempatan);
                txt_jawaban.setText(null);
            }
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!");
        txt_jawaban.setText(null);
    }
    }//GEN-LAST:event_btn_TebakActionPerformed

    private void txt_jawabanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jawabanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jawabanActionPerformed

    private void btn_ulangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ulangActionPerformed
       currentSoal = 0;
        totalSkor = 0;
        kesempatan = 3;
        clueIndex = 0; 
        txt_jawaban.setText("");
        txt_Clue.setIcon(null);
        btn_Tebak.setEnabled(true);
        updateSoalAndClue();
        loadHighScores(username);
        JOptionPane.showMessageDialog(this, "Permainan diulang! Selamat bermain kembali.");
    }//GEN-LAST:event_btn_ulangActionPerformed


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
            java.util.logging.Logger.getLogger(TebakAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TebakAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TebakAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TebakAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TebakAngka("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTable HighScore_TebakAngka;
    private javax.swing.JButton btn_Clue;
    private javax.swing.JButton btn_Gambar1;
    private javax.swing.JButton btn_Gambar2;
    private javax.swing.JButton btn_Gambar3;
    private javax.swing.JButton btn_Kembali;
    private javax.swing.JButton btn_Tebak;
    private javax.swing.JButton btn_ulang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txt_Clue;
    private javax.swing.JTextField txt_jawaban;
    // End of variables declaration//GEN-END:variables
}
