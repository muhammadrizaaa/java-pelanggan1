/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pelanggan1apk;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI
 */
public class JFramePelanggan1 extends javax.swing.JFrame {

    /**
     * Creates new form JFramePelanggan1
     */
    private DefaultTableModel model = new DefaultTableModel();
    private DBPelanggan koneksi = new DBPelanggan();
    public JFramePelanggan1() {
        initComponents();
        model.addColumn("Id");
        model.addColumn("Nama");
        model.addColumn("Jenis");
        model.addColumn("The Year Where It's Born");
        tabelMember.setModel(model);
        populateTable();
        this.setLocationRelativeTo(null);
    }
    
    private void populateTable() {
        model.setRowCount(0);
        try {
            ArrayList<Pelanggan> daftar = koneksi.getPelanggan();
            for (Pelanggan p : daftar) {
                Object[] isiData = {p.getId(), p.getNama(),
                p.getTahunLahir(), p.getJenis()};
                model.addRow(isiData);
            }
        }
        catch (SQLException ex) {
            System.out.println("Eksepsi: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Exception: " +
            ex.getMessage());
        }
    } 
    
        private void populateTable(String q) {
        model.setRowCount(0);
        try {
            ArrayList<Pelanggan> daftar = koneksi.cariPelanggan(q);
            for (Pelanggan p : daftar) {
                Object[] isiData = {p.getId(), p.getNama(),
                p.getTahunLahir(), p.getJenis()};
                model.addRow(isiData);
            }
        }
        catch (SQLException ex) {
            System.out.println("Eksepsi: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Exception: " +
            ex.getMessage());
        }
    }
    private void kosongkan() {
        TFId.setText("");
        TFNama.setText("");
        CBJenis.setSelectedIndex(0);
        CBTahunLahir.setSelectedIndex(0);
        TFId.setEditable(true);
        BSave.setText("Save");
    }
        
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TFId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMember = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CBJenis = new javax.swing.JComboBox<>();
        CBTahunLahir = new javax.swing.JComboBox<>();
        BSave = new javax.swing.JButton();
        TFQ = new javax.swing.JTextField();
        BQ = new javax.swing.JButton();
        BHapus = new javax.swing.JButton();
        BReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TFId.setText("Id");
        TFId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFIdActionPerformed(evt);
            }
        });

        tabelMember.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tabelMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabelMember);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Daftar Pelanggan CIAAA");
        jLabel1.setToolTipText("");
        jLabel1.setMaximumSize(new java.awt.Dimension(125, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(125, 20));
        jLabel1.setName(""); // NOI18N

        jLabel2.setText("ID");

        TFNama.setText("Nama");
        TFNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNamaActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama");

        jLabel4.setText("Jenis");

        jLabel5.setText("Tahun Lahir");

        CBJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBJenis.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBJenisItemStateChanged(evt);
            }
        });
        CBJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBJenisActionPerformed(evt);
            }
        });

        CBTahunLahir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBTahunLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBTahunLahirActionPerformed(evt);
            }
        });

        BSave.setText("Save");
        BSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSaveActionPerformed(evt);
            }
        });

        TFQ.setText("Search");
        TFQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFQActionPerformed(evt);
            }
        });

        BQ.setText("Search");
        BQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BQActionPerformed(evt);
            }
        });

        BHapus.setText("Delete");
        BHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHapusActionPerformed(evt);
            }
        });

        BReset.setText("Reset");
        BReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CBJenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBTahunLahir, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(TFId, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(TFNama, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)))
                            .addComponent(BSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(98, 98, 98))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TFQ, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BQ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BHapus))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BQ)
                    .addComponent(BHapus)
                    .addComponent(BReset))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBTahunLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BSave))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFIdActionPerformed

    private void TFNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNamaActionPerformed

    private void CBJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBJenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBJenisActionPerformed

    private void CBTahunLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBTahunLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBTahunLahirActionPerformed

    private void BSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSaveActionPerformed
        String nomor = TFId.getText();
        String nama = TFNama.getText();
        String jenis = CBJenis.getSelectedItem().toString();
        String tahunLahir = CBTahunLahir.getSelectedItem().toString();
        Pelanggan p = new Pelanggan(nomor, nama, jenis,
        Integer.parseInt(tahunLahir));
            if (BSave.getText().equals("Simpan")) {
                try {
                    if (koneksi.insertPelanggan(p)) {
                        JOptionPane.showMessageDialog(this,
                        "Berhasil Insert");
                        populateTable();
                    } else {
                        JOptionPane.showMessageDialog(this, "Gagal Insert");
                    }
                } catch (SQLException ex) {
                    System.out.println("Eksepsi: " + ex.getMessage());
                    JOptionPane.showMessageDialog(null, "Exception: " +
                    ex.getMessage());
                }
        } else {
            try {
                int jawaban = JOptionPane.showConfirmDialog(this,
                "Ubah Data " + p.getId() + "?", "Ubah",
                JOptionPane.YES_NO_OPTION);
                if (jawaban == JOptionPane.YES_OPTION) {
                    if (koneksi.updatePelanggan(p)) {
                        JOptionPane.showMessageDialog(this,
                        "Berhasil Update");
                        populateTable();
                    } else {
                        JOptionPane.showMessageDialog(this,
                        "Gagal Update");
                    }
                }
            } catch (SQLException ex) {
                System.out.println("Eksepsi: " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "Exception: " +
                ex.getMessage());
            }
        }
        kosongkan();
    }//GEN-LAST:event_BSaveActionPerformed

    private void TFQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFQActionPerformed

    private void BQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BQActionPerformed
        String q = BQ.getText();
        populateTable(q);
    }//GEN-LAST:event_BQActionPerformed

    private void BHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHapusActionPerformed
        int selectedRow = tabelMember.getSelectedRow();
        String id = model.getValueAt(selectedRow, 0).toString();
        int jawaban = JOptionPane.showConfirmDialog(this, "Hapus Data " +
        id + "?", "Hapus", JOptionPane.YES_NO_OPTION);
        if (jawaban == JOptionPane.YES_OPTION) {
            //hapus
            try {
                if (koneksi.deletePelanggan(id)) {
                    JOptionPane.showMessageDialog(this,
                    "Berhasil Delete");
                    populateTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal Delete");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Eksepsi: " +
                e.getMessage());
            }
        } 
    }//GEN-LAST:event_BHapusActionPerformed

    private void CBJenisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBJenisItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CBJenisItemStateChanged

    private void BResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BResetActionPerformed
        kosongkan();
    }//GEN-LAST:event_BResetActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePelanggan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePelanggan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePelanggan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePelanggan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePelanggan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BHapus;
    private javax.swing.JButton BQ;
    private javax.swing.JButton BReset;
    private javax.swing.JButton BSave;
    private javax.swing.JComboBox<String> CBJenis;
    private javax.swing.JComboBox<String> CBTahunLahir;
    private javax.swing.JTextField TFId;
    private javax.swing.JTextField TFNama;
    private javax.swing.JTextField TFQ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelMember;
    // End of variables declaration//GEN-END:variables
}
