/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Rahmah.view;
import javax.swing.JTable;
import javax.swing.JTextField;
import Rahmah.controller.PengembalianController;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
/**
 *
 * @author LAB-JARINGAN01
 */
public class FormPengembalian extends javax.swing.JFrame {
    PengembalianController controller;

    /**
     * Creates new form FormPengembalian
     */
    public FormPengembalian() {
        initComponents();
        controller = new PengembalianController(this);
        controller.clearForm();
        controller.tampil();
    }

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public JButton getBtnCari() {
        return btnCari;
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public JButton getBtnKembalikan() {
        return btnKembalikan;
    }

    public JButton getBtnUpdate() {
        return btnUpdate;
    }

    public JComboBox<String> getCboKodeAnggota() {
        return cboKodeAnggota;
    }

    public JComboBox<String> getCboKodeBuku() {
        return cboKodeBuku;
    }

    public JComboBox<String> getCbopilih() {
        return cbopilih;
    }

    public JTable getTblPengembalian() {
        return tblPengembalian;
    }

    public JTextField getTxtCari() {
        return txtCari;
    }

    public JTextField getTxtDenda() {
        return txtDenda;
    }

    public JTextField getTxtTerlambat() {
        return txtTerlambat;
    }

    public JTextField getTxtTglkembali() {
        return txtTglkembali;
    }

    public JTextField getTxtTglpinjam() {
        return txtTglpinjam;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboKodeAnggota = new javax.swing.JComboBox<>();
        cboKodeBuku = new javax.swing.JComboBox<>();
        txtTglpinjam = new javax.swing.JTextField();
        txtTglkembali = new javax.swing.JTextField();
        txtTerlambat = new javax.swing.JTextField();
        txtDenda = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPengembalian = new javax.swing.JTable();
        btnKembalikan = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        cbopilih = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kode Anggota");

        jLabel2.setText("Kode Buku");

        jLabel3.setText("Tgl Pinjam");

        jLabel4.setText("Tgl kembali");

        jLabel5.setText("Terlambat");

        jLabel6.setText("Denda");

        cboKodeAnggota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboKodeAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKodeAnggotaActionPerformed(evt);
            }
        });

        cboKodeBuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboKodeBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKodeBukuActionPerformed(evt);
            }
        });

        txtTglpinjam.setText("jTextField1");
        txtTglpinjam.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTglpinjamFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTglpinjamFocusLost(evt);
            }
        });
        txtTglpinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTglpinjamActionPerformed(evt);
            }
        });

        txtTglkembali.setText("jTextField2");
        txtTglkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTglkembaliActionPerformed(evt);
            }
        });
        txtTglkembali.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTglkembaliKeyReleased(evt);
            }
        });

        txtTerlambat.setText("jTextField3");
        txtTerlambat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTerlambatActionPerformed(evt);
            }
        });

        txtDenda.setText("jTextField4");
        txtDenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDendaActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblPengembalian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Anggota", "Nama Anggota", "Kode Buku", "Judul Buku", "Tgl pinjam", "Tgl kembali", "Dikembalikan", "Terlambat", "Denda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPengembalianMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPengembalian);

        btnKembalikan.setText("Kembalikan");
        btnKembalikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembalikanActionPerformed(evt);
            }
        });

        txtCari.setText("jTextField1");
        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnCariFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnCariFocusLost(evt);
            }
        });
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        cbopilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbopilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbopilihActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboKodeAnggota, 0, 304, Short.MAX_VALUE)
                            .addComponent(cboKodeBuku, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTglpinjam)
                            .addComponent(txtTglkembali)
                            .addComponent(txtTerlambat)
                            .addComponent(txtDenda)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnUpdate)
                        .addGap(58, 58, 58)
                        .addComponent(btnCancel)
                        .addGap(41, 41, 41)
                        .addComponent(btnDelete)))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnKembalikan)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbopilih, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCari)
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cboKodeAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCari)
                            .addComponent(cbopilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cboKodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTglpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTglkembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTerlambat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnCancel)
                    .addComponent(btnDelete)
                    .addComponent(btnKembalikan))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

    private void cboKodeAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKodeAnggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboKodeAnggotaActionPerformed

    private void cboKodeBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKodeBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboKodeBukuActionPerformed

    private void txtTglpinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTglpinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTglpinjamActionPerformed

    private void txtTglkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTglkembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTglkembaliActionPerformed

    private void txtTerlambatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTerlambatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTerlambatActionPerformed

    private void txtDendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDendaActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        controller.update();
        controller.clearForm();
        controller.tampil();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:;
        controller.clearForm();
        controller.tampil();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        controller.delete();
        controller.clearForm();
        controller.tampil();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cbopilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbopilihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbopilihActionPerformed

    private void btnKembalikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembalikanActionPerformed
        // TODO add your handling code here:
        controller.insert();
        controller.clearForm();
        controller.tampil();
    }//GEN-LAST:event_btnKembalikanActionPerformed

    private void tblPengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPengembalianMouseClicked
        // TODO add your handling code here:
        controller.get();
    }//GEN-LAST:event_tblPengembalianMouseClicked

    private void btnCariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnCariFocusGained
        // TODO add your handling code here:
        if(txtCari.getText().equals("Masukkkan Kode Anggota")){
            txtCari.setText("");
        }
    }//GEN-LAST:event_btnCariFocusGained

    private void btnCariFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnCariFocusLost
        // TODO add your handling code here:
        if(txtCari.getText().equals("")){
            txtCari.setText("Masukkkan Kode Anggota");
        }
    }//GEN-LAST:event_btnCariFocusLost

    private void txtTglkembaliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTglkembaliKeyReleased
        try {
            // TODO add your handling code here:
            controller.tanggalDikembalikan();
        } catch (Exception ex) {
            Logger.getLogger(FormPengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtTglkembaliKeyReleased

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        controller.Cari();
    }//GEN-LAST:event_btnCariActionPerformed

    private void txtTglpinjamFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTglpinjamFocusGained
        // TODO add your handling code here:
        if(txtTglpinjam.getText().equals("yyyy-mm-dd")){
            txtTglpinjam.setText("");
        }
    }//GEN-LAST:event_txtTglpinjamFocusGained

    private void txtTglpinjamFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTglpinjamFocusLost
        // TODO add your handling code here:
        if(txtTglpinjam.getText().equals("")){
            txtTglpinjam.setText("yyyy-mm-dd");
        }
    }//GEN-LAST:event_txtTglpinjamFocusLost

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
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnKembalikan;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboKodeAnggota;
    private javax.swing.JComboBox<String> cboKodeBuku;
    private javax.swing.JComboBox<String> cbopilih;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPengembalian;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtDenda;
    private javax.swing.JTextField txtTerlambat;
    private javax.swing.JTextField txtTglkembali;
    private javax.swing.JTextField txtTglpinjam;
    // End of variables declaration//GEN-END:variables
}
