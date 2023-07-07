/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rahmah.controller;
import java.sql.Connection;
import java.util.List;
import Rahmah.dao.*;
import Rahmah.model.*;
import Rahmah.db.DbHelper;
import Rahmah.view.FormPengembalian;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author LAB-JARINGAN01
 */
public class PengembalianController {
   FormPengembalian form;
   AnggotaDao agtDao;
   BukuDao bkDao;
   PengembalianDao pengembalianDao;
   Pengembalian kembali;
   Connection connection;
   
   public PengembalianController (FormPengembalian view) throws Exception {
        this.form = form;
        connection = DbHelper.getConnection();
        agtDao = new AnggotaDaoImpl(connection);
        bkDao = new BukuDaoImpl(connection);
        pengembalianDao = new PengembalianDaoImpl(connection);
        kembali = new Pengembalian();
    }
   
   public void clearForm() {
        
       try {
           form.getBtnKembalikan().setEnabled(false);
           List<Anggota> alist = agtDao.getAll();
           form.getCboKodeAnggota().removeAllItems();
           for(Anggota anggota : alist){
               form.getCboKodeAnggota().addItem(anggota.getKodeanggota());
           }
           form.getCboKodeAnggota().setSelectedIndex(0);
           
           List<Buku> blist = bkDao.getAll();
           form.getCboKodeBuku().removeAllItems();
           for(Buku buku  : blist){
               form.getCboKodeBuku().addItem(buku.getKodebuku());
           }
           form.getCboKodeAnggota().setSelectedIndex(0);

           form.getTxtTglpinjam().setText("");
           form.getTxtTglkembali().setText("");
           form.getTxtCari().setText("");
           form.getTxtTerlambat().setText("");
           form.getTxtDenda().setText("");
       } catch (Exception ex) {
           Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
   
   public void insert() {
        try {
            kembali.setKodeAnggota(form.getCboKodeAnggota().getSelectedItem().toString());
            kembali.setKodebuku(form.getCboKodeBuku().getSelectedItem().toString());
            kembali.setTglpinjam(form.getTxtTglpinjam().getText());
            kembali.setTglkembali(form.getTxtTglkembali().getText());
            kembali.setTerlambat(Integer.parseInt(form.getTxtTerlambat().getText()));
            kembali.setDenda(Double.parseDouble(form.getTxtDenda().getText()));
            pengembalianDao.insert(kembali);
            JOptionPane.showMessageDialog(form, "Berhasil Kembalikan Buku.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, "Tidak bisa melakukan pengembalian!", null, 0);
        }
    }
    
    public void update() {  
        try {
            kembali.setKodeAnggota(form.getCboKodeAnggota().getSelectedItem().toString());
            kembali.setKodebuku(form.getCboKodeBuku().getSelectedItem().toString());
            kembali.setTglpinjam(form.getTxtTglpinjam().getText());
            kembali.setTglkembali(form.getTxtTglkembali().getText());
            kembali.setTerlambat(Integer.parseInt(form.getTxtTerlambat().getText()));
            kembali.setDenda(Double.parseDouble(form.getTxtDenda().getText()));
            pengembalianDao.update(kembali);
            JOptionPane.showMessageDialog(form, "Berhasil update Buku.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, "Tidak bisa melakukan pengembalian!", null, 0);
        }
    }
     public void delete() {
        try {
            kembali.setKodeAnggota(form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 0)
                    .toString());
            kembali.setKodebuku(form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 2)
                    .toString());
            kembali.setTglpinjam(form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 4)
                    .toString());
            pengembalianDao.delete(kembali);
            JOptionPane.showMessageDialog(form, "Data pengembalian dihapus!", null, 2);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
     public void get() {
        try {
            form.getBtnKembalikan().setEnabled(true);
            String tglPinjam = form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 4)
                    .toString();
            String tglkembali = form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 5)
                    .toString();
            form.getCboKodeAnggota()
                    .setSelectedItem(form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 0)
                            .toString());
            form.getCboKodeBuku()
                    .setSelectedItem(form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 2)
                            .toString());
            form.getTxtTglpinjam()
                    .setText(tglPinjam);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String tglDikembalikan = format.format(new java.util.Date());
            form.getTxtTglkembali().setText(tglDikembalikan);
            int terlambat = pengembalianDao.selisihtgl(tglDikembalikan, tglkembali);
            kembali.setTerlambat(terlambat);
            form.getTxtTerlambat().setText("" + terlambat);
            form.getTxtDenda().setText((String.valueOf(kembali.getDenda())));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, e, null, 0);
        }
    }
    
     public void tampil() {
        try {
            DefaultTableModel tableModel = (DefaultTableModel) form.getTblPengembalian().getModel();
            tableModel.setRowCount(0);
            List<Pengembalian> List = pengembalianDao.getAll();
            for (Pengembalian kembali : List) {
                Object[] data = {
                        kembali.getKodeAnggota(),
                        kembali.getNamaAnggota(),
                        kembali.getKodebuku(),
                        kembali.getJudulBuku(),
                        kembali.getTglpinjam(),
                        kembali.getTglkembali(),
                        kembali.getDikembalikan(),
                        kembali.getTerlambat(),
                        kembali.getDenda()
                };
                tableModel.addRow(data);
            }
        } catch (Exception e) {
            // DO: handle exception
            JOptionPane.showMessageDialog(form, e);
        }
    }

    public void Cari() {
        try {
            String kode = form.getCbopilih().getSelectedItem().toString();
            String cari = form.getTxtCari().getText();
            DefaultTableModel tableModel = (DefaultTableModel) form.getTblPengembalian().getModel();
            tableModel.setRowCount(0);
            if(kode == "KodeAnggota" ){
                kode = "anggota.kodeAnggota";
            }else if (kode == "Kodebuku"){
                kode = "buku.Kodebuku";
            }else{
                kode = "anggota.namaAnggota";
            }
            List<Pengembalian> List = pengembalianDao.cari(kode, cari);
            if (List.isEmpty()) {
                if(kode == "anggota.kodeAnnggota"){
                JOptionPane.showMessageDialog(form, "Kode Anggota '" + cari + "' Tidak dapat ditemukan"); 
                }else if (kode == "buku.Kodebuku"){
                JOptionPane.showMessageDialog(form, "Kode Buku '" + cari + "' Tidak dapat ditemukan");   
                }else{
                JOptionPane.showMessageDialog(form, "Nama '" + cari + "' Tidak dapat ditemukan");   
                    
                }
            } else {
                for (Pengembalian kembali : List) {
                    Object[] data = {
                        kembali.getKodeAnggota(),
                        kembali.getNamaAnggota(),
                        kembali.getKodebuku(),
                        kembali.getJudulBuku(),
                        kembali.getTglpinjam(),
                        kembali.getTglkembali(),
                        kembali.getDikembalikan(),
                        kembali.getTerlambat(),
                        kembali.getDenda()
                    };
                    tableModel.addRow(data);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, e, null, 0);
        }
    }

    public int tanggalDikembalikan() throws Exception {
        String tglDikembalikan = form.getTxtTglkembali().getText();
        String Tglkembali = form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 5)
                .toString();
        int terlambat = pengembalianDao.selisihtgl(tglDikembalikan, Tglkembali);
        if(terlambat <= 0){
            terlambat = 0;
        }
        form.getTxtTerlambat().setText("" + terlambat);
        form.getTxtTglkembali().setText(tglDikembalikan);
        form.getTxtDenda().setText((String.valueOf(terlambat * 2000)));
        return terlambat;
    }
}
