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

public class formuser extends javax.swing.JDialog {

    private Connection conDB;
    private PreparedStatement ps;
    private ResultSet rs;
    private Object e;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private DefaultTableModel tabelModel;

   

    public formuser(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        conDB = KelasKoneksi.konDB(); // KONEKSI DB
    }

    // ================= MODEL TABLE =================
    public DefaultTableModel getModelUser() {
        String[] judul = {
        "username", "password","level"
    };

    DefaultTableModel model = new DefaultTableModel(null, judul);

    try {
        String sql = "SELECT * FROM user ORDER BY username, password";
        ps = conDB.prepareStatement(sql);
        rs = ps.executeQuery();

        while (rs.next()) {
            Object[] data = new Object[3];
            data[0] = rs.getString("username");
            data[1] = rs.getString("password");
     data[2] = rs.getString("level");

            model.addRow(data);
        }
    } catch (SQLException e) {
        System.out.println("Model bobot Error: " + e.getMessage());
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
        txtnama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablemhs = new javax.swing.JTable();
        ADD = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtnim1 = new javax.swing.JTextField();
        cb1 = new javax.swing.JComboBox();

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
        jLabel1.setText("FORM USER");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Pw");

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

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Level");

        txtnim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnim1ActionPerformed(evt);
            }
        });

        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "admin", "dosen", "mahasiswa" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                .addGap(36, 36, 36))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnim1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel1)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtnim1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addComponent(ADD)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(25, 25, 25)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(138, 138, 138))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(71, Short.MAX_VALUE))))
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
     tablemhs.setModel(getModelUser());
     cb1.setEditable(false);
    }//GEN-LAST:event_formWindowOpened

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        deleteData();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  clearData();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        updateData();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
addData();       
    }//GEN-LAST:event_ADDActionPerformed

    private void tablemhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablemhsMouseClicked
       int baris = tablemhs.getSelectedRow();
    
    if (baris != -1) {
        // 2. Ambil data dari tabel sesuai kolom
        String user = tablemhs.getValueAt(baris, 0).toString();
        String pass = tablemhs.getValueAt(baris, 1).toString();
        String level = tablemhs.getValueAt(baris, 2).toString();
        
        // 3. Masukkan ke komponen input
        txtnim1.setText(user);   // Username masuk ke txtnim1
        txtnama.setText(pass);   // Password masuk ke txtnama
        
        // 4. Set JComboBox sesuai data level di tabel
        cb1.setSelectedItem(level);
    }
    }//GEN-LAST:event_tablemhsMouseClicked

    private void txtnim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnim1ActionPerformed
      
    }//GEN-LAST:event_txtnim1ActionPerformed
public void clearData(){
    txtnim1.setText("");
    txtnama.setText("");
     cb1.setSelectedIndex(0);

    
}

public void getcode() {
   
    try {
        String sql = "SELECT MAX(kode_matkul) FROM bobot";
        ps = conDB.prepareStatement(sql);
        rs = ps.executeQuery();

        int kode = 1;

        if (rs.next()) {
            String lastkode_matkul = rs.getString(1);
            if (lastkode_matkul != null) {
                kode = Integer.parseInt(lastkode_matkul.substring(2)) + 1;
            }
        }

        String newKode = String.format("MK%02d", kode);
      

    } catch (SQLException e) {
        System.out.println("get code SQL error: " + e.getMessage());
    } catch (NumberFormatException e) {
        System.out.println("Format NIM salah");
    }
}


    public void tampilData() {
    try {
        String query = "SELECT * FROM user WHERE username = ? AND password = ?";
        ps = conDB.prepareStatement(query);

        ps.setString(1, txtnim1.getText().trim());
        ps.setString(2, txtnama.getText().trim());

        rs = ps.executeQuery();

        if (rs.next()) {
            String level = rs.getString("level");

            if (level.equals("mahasiswa")) {
                cb1.setSelectedItem("mahasiswa");
            } else if (level.equals("dosen")) {
                cb1.setSelectedItem("dosen");
            } else if (level.equals("admin")) {
                cb1.setSelectedItem("admin");
            }
        }

    } catch (SQLException e) {
        System.out.println("tampil Data error: " + e.getMessage());
    }
}


public void addData() {
    try {
        String query = "INSERT INTO user VALUES (?,?,?)";
        ps = conDB.prepareStatement(query);

        ps.setString(1, txtnim1.getText());
        ps.setString(2, txtnama.getText());
     String level;
        if (cb1.getSelectedItem().equals("mahasiswa")) {
            level = "mahasiswa";
        } else if (cb1.getSelectedItem().equals("dosen")) {
            level = "dosen";
        } else {
            level = "admin";
        }

        ps.setString(3, level);
        

        ps.executeUpdate();

        JOptionPane.showMessageDialog(null, "Add data sukses");

        tablemhs.setModel(getModelUser()); // refresh tabel

    } catch (SQLException e) {
        System.out.println("Error add data: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Add data gagal");
    }
}

   public void deleteData() {
    try {
        String query = "DELETE FROM user WHERE username = ? AND password = ?";
        ps = conDB.prepareStatement(query);

        ps.setString(1, txtnim1.getText().trim()); // username
        ps.setString(2, txtnama.getText().trim()); // password

        int hasil = ps.executeUpdate();

        if (hasil > 0) {
            JOptionPane.showMessageDialog(null, "Delete data sukses");
            tablemhs.setModel(getModelUser()); // refresh tabel
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
        String query = 
            "UPDATE user SET level = ? WHERE username = ? AND password = ?";

        ps = conDB.prepareStatement(query);

        String level = cb1.getSelectedItem().toString();

        ps.setString(1, level);                          // level baru
        ps.setString(2, txtnim1.getText().trim());       // username
        ps.setString(3, txtnama.getText().trim());       // password

        int hasil = ps.executeUpdate();

        if (hasil > 0) {
            JOptionPane.showMessageDialog(null, "Update data sukses");
            tablemhs.setModel(getModelUser());
            clearData();
        } else {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
        }

    } catch (SQLException e) {
        System.out.println("Error update data: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Update data gagal");
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
            java.util.logging.Logger.getLogger(formuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                formuser dialog = new formuser(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox cb1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablemhs;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnim1;
    // End of variables declaration//GEN-END:variables

    private Object at(int selectedRow, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void updatedata() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
