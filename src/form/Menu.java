/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import form.KelasKoneksi;


public class Menu extends javax.swing.JDialog {

    private Connection conDB;
    private PreparedStatement ps;
    private ResultSet rs;
    private Object e;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private DefaultTableModel tabelModel;

  
public Menu(java.awt.Frame parent, boolean modal, String level) {
    super(parent, modal);
    initComponents();
    conDB = KelasKoneksi.konDB(); 
    
    
    ambatusauda(false); 
    
    
    if (level != null && !level.isEmpty()) {
       ngawikers(level);    
        ADD7.setText("Logout"); 
    } else {
        ADD7.setText("Login");  
    }
    
    this.setLocationRelativeTo(null);
}





private void ambatusauda(boolean status) {
    ADD.setVisible(status);  ADD1.setVisible(status); 
    ADD2.setVisible(status); ADD3.setVisible(status);
    ADD4.setVisible(status); ADD5.setVisible(status); 
    ADD6.setVisible(status); ADD8.setVisible(status); 
    
   
    ADD7.setVisible(true); 
    btnExit.setVisible(true); 
}



   
private void ngawikers(String level) {
    ambatusauda(false); 
    
    if (level.equalsIgnoreCase("admin")) {
     ADD.setVisible(true);  ADD1.setVisible(true); 
    ADD2.setVisible(true); ADD3.setVisible(true);
    ADD4.setVisible(true); ADD5.setVisible(true); 
  
} 
    else if (level.equalsIgnoreCase("dosen")) {
        ADD6.setVisible(true);
        btnExit.setVisible(true);
    }else if (level.equalsIgnoreCase("mahasiswa")) {
        ADD8.setVisible(true); 
       
        btnExit.setVisible(true);
    }
}


   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ADD = new javax.swing.JButton();
        ADD1 = new javax.swing.JButton();
        ADD2 = new javax.swing.JButton();
        ADD3 = new javax.swing.JButton();
        ADD4 = new javax.swing.JButton();
        ADD5 = new javax.swing.JButton();
        ADD6 = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        ADD7 = new javax.swing.JButton();
        ADD8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(110, 137, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Caladea", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORM MENU");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 23, -1, -1));

        ADD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ADD.setText("Dosen Mengajar");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel1.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 133, 63));

        ADD1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ADD1.setText("Dosen");
        ADD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD1ActionPerformed(evt);
            }
        });
        jPanel1.add(ADD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 133, 63));

        ADD2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ADD2.setText("Bobot");
        ADD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD2ActionPerformed(evt);
            }
        });
        jPanel1.add(ADD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 133, 63));

        ADD3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ADD3.setText("Mahasiswa");
        ADD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD3ActionPerformed(evt);
            }
        });
        jPanel1.add(ADD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 133, 63));

        ADD4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ADD4.setText("User");
        ADD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD4ActionPerformed(evt);
            }
        });
        jPanel1.add(ADD4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 133, 63));

        ADD5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ADD5.setText("Matkul");
        ADD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD5ActionPerformed(evt);
            }
        });
        jPanel1.add(ADD5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 133, 63));

        ADD6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ADD6.setText("Nillai");
        ADD6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD6ActionPerformed(evt);
            }
        });
        jPanel1.add(ADD6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 133, 63));

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExit.setText("exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 133, 63));

        ADD7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ADD7.setText("Login");
        ADD7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD7ActionPerformed(evt);
            }
        });
        jPanel1.add(ADD7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 133, 63));

        ADD8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ADD8.setText("Lapor");
        ADD8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD8ActionPerformed(evt);
            }
        });
        jPanel1.add(ADD8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 133, 63));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
formdosen_mengajar mengajar = new formdosen_mengajar (new javax.swing.JFrame(), true); 
mengajar.setVisible(true);
     
    }//GEN-LAST:event_ADDActionPerformed

    private void ADD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD1ActionPerformed
   formDosen dosen = new formDosen (new javax.swing.JFrame(), true); 
dosen.setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_ADD1ActionPerformed

    private void ADD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD2ActionPerformed

FormBobot Bobot = new FormBobot(new javax.swing.JFrame(), true); 
Bobot.setVisible(true);


    }//GEN-LAST:event_ADD2ActionPerformed

    private void ADD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD3ActionPerformed
FormMahasiswa mahasiswa= new FormMahasiswa (new javax.swing.JFrame(), true); 
mahasiswa.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_ADD3ActionPerformed

    private void ADD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD4ActionPerformed
formuser user = new formuser (new javax.swing.JFrame(), true); 
user.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_ADD4ActionPerformed

    private void ADD5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD5ActionPerformed
FormMatkul matkul = new FormMatkul (new javax.swing.JFrame(), true); 
matkul.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_ADD5ActionPerformed

    private void ADD6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD6ActionPerformed
FormNilai nilai = new FormNilai (new javax.swing.JFrame(), true); 
nilai.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_ADD6ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
    
                                      
                                      
                                       

    int pilih = JOptionPane.showConfirmDialog(null, "Yakin ingin keluar aplikasi?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION);
    
    if (pilih == JOptionPane.YES_OPTION) {
       
        System.exit(0); 
    }





    }//GEN-LAST:event_btnExitActionPerformed

    private void ADD7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD7ActionPerformed
                              
    String statusTombol = ADD7.getText().trim();
    

    if (statusTombol.equalsIgnoreCase("Logout")) {
        int pilih = JOptionPane.showConfirmDialog(null, "Yakin ingin Logout?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (pilih == JOptionPane.YES_OPTION) {
            ambatusauda(false);      
            ADD7.setText("Login");  
            
           
           
            
            JOptionPane.showMessageDialog(null, "Anda telah Logout!");
        }
    } 
    
    else {
        this.dispose();
        login halLogin = new login(new javax.swing.JFrame(), true); 
        halLogin.setVisible(true);
    }

    }//GEN-LAST:event_ADD7ActionPerformed

    private void ADD8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD8ActionPerformed
                                     
 try {
    // 1. Ambil koneksi database menggunakan fungsi konDB() dari KelasKoneksi Anda
    java.sql.Connection koneksi = form.KelasKoneksi.konDB(); 
    
    // Pastikan koneksi tidak null sebelum lanjut memproses laporan
    if (koneksi == null) {
        javax.swing.JOptionPane.showMessageDialog(this, "Koneksi database gagal terbuka!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // 2. Tentukan lokasi file report1.jasper Anda
    String path = "src/form/report1.jasper"; 
    java.io.File fileReport = new java.io.File(path);
    
    // 3. Menampilkan dialog input untuk meminta NIM dari pengguna
    String inputNim = javax.swing.JOptionPane.showInputDialog(this, "Masukkan NIM Mahasiswa yang ingin dicetak:", "Input NIM", javax.swing.JOptionPane.QUESTION_MESSAGE);
    
    // Batalkan proses jika pengguna menekan tombol Cancel atau mengosongkan teks
    if (inputNim == null || inputNim.trim().isEmpty()) {
        return; 
    }
    
    // Menyiapkan wadah parameter dan memasukkan NIM hasil inputan tadi ke parameter iReport
    java.util.HashMap<String, Object> parameter = new java.util.HashMap<>();
    parameter.put("nim", inputNim.trim()); 
    
    // 4. Proses membaca file laporan dan mengisinya dengan data dari database
    net.sf.jasperreports.engine.JasperReport jasperReport = (net.sf.jasperreports.engine.JasperReport) net.sf.jasperreports.engine.util.JRLoader.loadObject(fileReport);
    net.sf.jasperreports.engine.JasperPrint jasperPrint = net.sf.jasperreports.engine.JasperFillManager.fillReport(jasperReport, parameter, koneksi);
    
    // ========================================================
    // LOGIK MODIFIKASI: KONTROL SIKLUS HIDUP JENDELA REPORT
    // ========================================================
    
    // Membuat objek penampil laporan secara manual (tidak langsung ditampilkan)
    final net.sf.jasperreports.view.JasperViewer viewer = new net.sf.jasperreports.view.JasperViewer(jasperPrint, false);
    
    // Menyimpan referensi form Menu saat ini ke dalam variabel agar bisa dipanggil dari dalam fungsi Listener
    final java.awt.Window formMenuUtama = this;
    
    // Memasang pendengar (Listener) pada jendela laporan
    viewer.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
            // Ketika tombol 'X' pada laporan diklik, munculkan kembali form Menu utama
            formMenuUtama.setVisible(true);
        }
        
        @Override
        public void windowClosed(java.awt.event.WindowEvent e) {
            // Berjaga-jaga jika jendela ditutup lewat metode sistem lainnya
            formMenuUtama.setVisible(true);
        }
    });
    
    // Tampilkan jendela laporan ke layar pengguna
    viewer.setVisible(true);
    
    // Sembunyikan atau tutup sementara form Menu utama Anda
    // Menggunakan setVisible(false) lebih disarankan daripada dispose() agar status data di Form Menu tidak hilang
    this.setVisible(false); 
    
} catch (Exception e) {
    // Menampilkan pesan error jika ada file library yang kurang atau lokasi file salah
    javax.swing.JOptionPane.showMessageDialog(this, "Gagal membuka laporan: " + e.getMessage(), "Error Koneksi Laporan", javax.swing.JOptionPane.ERROR_MESSAGE);
    e.printStackTrace();
}


        // TODO add your handling code here:
    }//GEN-LAST:event_ADD8ActionPerformed

public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
           
          Menu dialog = new Menu(new javax.swing.JFrame(), true, ""); 

            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        }
    });
}

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton ADD1;
    private javax.swing.JButton ADD2;
    private javax.swing.JButton ADD3;
    private javax.swing.JButton ADD4;
    private javax.swing.JButton ADD5;
    private javax.swing.JButton ADD6;
    private javax.swing.JButton ADD7;
    private javax.swing.JButton ADD8;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private Object at(int selectedRow, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void updatedata() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
