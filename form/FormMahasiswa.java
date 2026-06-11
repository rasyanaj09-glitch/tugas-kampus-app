/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class FormMahasiswa extends javax.swing.JDialog {

    private Connection conDB;
    private PreparedStatement ps;
    private ResultSet rs;
    private Object e;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private DefaultTableModel tabelModel;

   

    public FormMahasiswa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        conDB = KelasKoneksi.konDB(); // KONEKSI DB
    }

    // ================= MODEL TABLE =================
    public DefaultTableModel getModelMahasiswa() {
        String[] judul = {
        "nim", "nama_mhs", "tmpLahir",
        "gender", "tglLahir", "noHP", "alamat"
    };

    DefaultTableModel model = new DefaultTableModel(null, judul);

    try {
        String sql = "SELECT * FROM mahasiswa ORDER BY nim";
        ps = conDB.prepareStatement(sql);
        rs = ps.executeQuery();

        while (rs.next()) {
            Object[] data = new Object[7];
            data[0] = rs.getString("nim");
            data[1] = rs.getString("nama_mhs");
            data[2] = rs.getString("tmpLahir");
            data[3] = rs.getString("gender");
            data[4] = rs.getDate("tglLahir");
            data[5] = rs.getString("noHP");
            data[6] = rs.getString("alamat");

            model.addRow(data);
        }
    } catch (SQLException e) {
        System.out.println("Model Mahasiswa Error: " + e.getMessage());
    }
    return model;
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnim = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablemhs = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txttempatlahir = new javax.swing.JTextField();
        ADD = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        cbgender = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtalamat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtno = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(110, 137, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Caladea", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORM MAHASISWA");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("NIM");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Nama");

        txtnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnimActionPerformed(evt);
            }
        });

        tablemhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        tablemhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablemhsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablemhs);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Tempat Lahir");

        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("GetCode");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        cbgender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "laki ", "perempuan", " " }));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Kelamin");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Alamat");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Tanggal lahir");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Nomor Hp");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtnim, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton5))
                                    .addComponent(txtalamat))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbgender, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txttempatlahir, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtno)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 53, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ADD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(36, 36, 36))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtnim)
                                .addComponent(jButton5)
                                .addComponent(cbgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(txttempatlahir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ADD)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(25, 25, 25)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     tablemhs.setModel(getModelMahasiswa());
     txtnim.setEditable(false);
    }//GEN-LAST:event_formWindowOpened

    private void tablemhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablemhsMouseClicked
int row = tablemhs.getSelectedRow(); // WAJIB ADA

    if(row != -1){

        txtnim.setText(
            tablemhs.getValueAt(row, 0).toString()
        );

        tampilData();
    }

tampilData();

    }//GEN-LAST:event_tablemhsMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
getcode();   
// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnimActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
if(txtnim.getText().trim().equals("")) {
JOptionPane.showMessageDialog(null, "NIm wajib di isi");
 
}else {
        addData(); // panggil method insert
    }// TODO add your handling code here:
    }//GEN-LAST:event_ADDActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
deleteData();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
updateData();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
clearData();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
public void clearData(){
    txtnim.setText("");
    txtnama.setText("");
    txttempatlahir.setText("");

    // Combo gender reset ke index pertama
    cbgender.setSelectedIndex(0);

    // Date chooser dikosongkan
    date.setDate(null);

    txtno.setText("");
    txtalamat.setText("");
}

public void getcode() {
   
    try {
        String sql = "SELECT MAX(nim) FROM mahasiswa";
        ps = conDB.prepareStatement(sql);
        rs = ps.executeQuery();

        int kode = 1;

        if (rs.next()) {
            String lastnim = rs.getString(1);
            if (lastnim != null) {
                kode = Integer.parseInt(lastnim.substring(2)) + 1;
            }
        }

        String newKode = String.format("M%02d", kode);
        txtnim.setText(newKode);

    } catch (SQLException e) {
        System.out.println("get code SQL error: " + e.getMessage());
    } catch (NumberFormatException e) {
        System.out.println("Format NIM salah");
    }
}


    public void tampilData() {
    try {
        String query = "SELECT * FROM mahasiswa WHERE nim = ?";
        ps = conDB.prepareStatement(query);
        ps.setString(1, txtnim.getText().trim());
        rs = ps.executeQuery();

        while (rs.next()) {
            txtnama.setText(rs.getString("nama_mhs"));
            txttempatlahir.setText(rs.getString("tmpLahir"));
            if(rs.getString("gender").equals("L")) {
                cbgender.setSelectedItem("L");
            }else{
                cbgender.setSelectedItem("P");
            }
            date.setDate(rs.getDate("tglLahir"));
                        txtno.setText(rs.getString("noHP"));
             txtalamat.setText(rs.getString("alamat"));
        }
            
         
            
        

    } catch (SQLException e) {
        System.out.println("tampil Data error: " + e.getMessage());
    }
}


public void addData() {
    try {
        // Gunakan nama kolom agar lebih aman
        String query = "INSERT INTO mahasiswa (nim, nama_mhs, gender, tmpLahir, tglLahir, noHP, alamat) VALUES (?,?,?,?,?,?,?)";
        ps = conDB.prepareStatement(query);

        ps.setString(1, txtnim.getText()); // nim
        ps.setString(2, txtnama.getText()); // nama_mhs
        
        // GENDER (Urutan ke-3 sesuai database)
        String gender = cbgender.getSelectedItem().toString().equals("L") ? "L" : "P";
        ps.setString(3, gender);
        
        // TEMPAT LAHIR (Urutan ke-4 sesuai database)
        ps.setString(4, txttempatlahir.getText());

        // TANGGAL LAHIR (Urutan ke-5)
        String tanggal = sdf.format(date.getDate());
        ps.setString(5, tanggal);

        // NO HP (Urutan ke-6)
        ps.setString(6, txtno.getText());

        // ALAMAT (Urutan ke-7)
        ps.setString(7, txtalamat.getText());

        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Add data sukses");
        tablemhs.setModel(getModelMahasiswa());

    } catch (SQLException e) {
        System.out.println("Error add data: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Add data gagal: " + e.getMessage());
    } catch (NullPointerException e) {
        JOptionPane.showMessageDialog(null, "Tanggal lahir belum diisi!");
    }
}


    public void deleteData() {
    try {
        String query =
            "DELETE FROM mahasiswa WHERE nim = ?";

        ps = conDB.prepareStatement(query);
        ps.setString(1, txtnim.getText());

        int hasil = ps.executeUpdate();

        if (hasil > 0) {
            JOptionPane.showMessageDialog(null, "Delete data sukses");
            tablemhs.setModel(getModelMahasiswa()); // refresh tabel
            clearData();
        } else {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
        }

    } catch (SQLException e) {
        System.out.println("Error delete data: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Delete data gagal");
    }
}



public void updateData() {
    try {
        // Pastikan nama kolom sesuai: nama_mhs, gender, tmpLahir, tglLahir, noHP, alamat
        String query = "UPDATE mahasiswa SET nama_mhs=?, gender=?, tmpLahir=?, tglLahir=?, noHP=?, alamat=? WHERE nim=?";

        ps = conDB.prepareStatement(query);

        ps.setString(1, txtnama.getText());
        
        // Penanganan Combo Box Gender untuk ENUM L/P
        String selectedGender = cbgender.getSelectedItem().toString();
        String gender = selectedGender.startsWith("L") ? "L" : "P"; 
        ps.setString(2, gender);
        
        ps.setString(3, txttempatlahir.getText());
        
        // Validasi Tanggal
        if (date.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Pilih tanggal lahir!");
            return;
        }
        ps.setString(4, sdf.format(date.getDate()));
        
        ps.setString(5, txtno.getText());
        ps.setString(6, txtalamat.getText());
        ps.setString(7, txtnim.getText()); // Kunci pencarian data

        int hasil = ps.executeUpdate();
        if (hasil > 0) {
            JOptionPane.showMessageDialog(null, "Update Berhasil!");
            tablemhs.setModel(getModelMahasiswa());
            clearData();
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Gagal Update: " + e.getMessage());
    }
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
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormMahasiswa dialog = new FormMahasiswa(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox cbgender;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablemhs;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnim;
    private javax.swing.JTextField txtno;
    private javax.swing.JTextField txttempatlahir;
    // End of variables declaration//GEN-END:variables

    private Object at(int selectedRow, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void updatedata() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
