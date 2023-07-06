/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rahmah.controller;
import java.sql.Connection;
import java.util.List;
import Rahmah.dao.*;
import Rahmah.model.*;
import Rahmah.db.dbHelper;
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
        connection = dbHelper.getConnection();
        agtDao = new AnggotaDaoImpl(connection);
        bkDao = new BukuDaoImpl(connection);
        pengembalianDao = new PengembalianDaoImpl(connection);
        kembali = new Pengembalian();
    }
   
   public void bersih() {
        
       try {
           form.getBtnkembalikan().setEnabled(false);
           List<Anggota> alist = agtDao.getAll();
           form.getCbokodeanggota().removeAllItems();
           for(Anggota anggota : alist){
               form.getCbokodeanggota().addItem(anggota.getKodeanggota());
           }
           form.getCbokodeanggota().setSelectedIndex(0);
           
           List<Buku> blist = bkDao.getAll();
           form.getCbokodebuku().removeAllItems();
           for(Buku buku  : blist){
               form.getCbokodebuku().addItem(buku.getKodebuku());
           }
           form.getCbokodeanggota().setSelectedIndex(0);

           form.getTxttglpinjam().setText("");
           form.getTxttgldikembalikan().setText("");
           form.getTxtcari().setText("");
           form.getTxtterlambat().setText("");
           form.getTxtdenda().setText("");
       } catch (Exception ex) {
           Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
   
   public void insert() {
        try {
            kembali.setKodeAnggota(form.getCbokodeanggota().getSelectedItem().toString());
            kembali.setKodebuku(form.getCbokodebuku().getSelectedItem().toString());
            kembali.setTglpinjam(form.getTxttglpinjam().getText());
            kembali.setTglkembali(form.getTxttgldikembalikan().getText());
            kembali.setTerlambat(Integer.parseInt(form.getTxtterlambat().getText()));
            kembali.setDenda(Double.parseDouble(form.getTxtdenda().getText()));
            pengembalianDao.insert(kembali);
            JOptionPane.showMessageDialog(form, "Berhasil Kembalikan Buku.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, "Tidak bisa melakukan pengembalian!", null, 0);
        }
    }
    
    public void update() {  
        try {
            kembali.setKodeAnggota(form.getCbokodeanggota().getSelectedItem().toString());
            kembali.setKodebuku(form.getCbokodebuku().getSelectedItem().toString());
            kembali.setTglpinjam(form.getTxttglpinjam().getText());
            kembali.setTglkembali(form.getTxttgldikembalikan().getText());
            kembali.setTerlambat(Integer.parseInt(form.getTxtterlambat().getText()));
            kembali.setDenda(Double.parseDouble(form.getTxtdenda().getText()));
            pengembalianDao.update(kembali);
            JOptionPane.showMessageDialog(form, "Berhasil update Buku.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, "Tidak bisa melakukan pengembalian!", null, 0);
        }
    }
     public void delete() {
        try {
            kembali.setKodeAnggota(form.getTblpengembalian().getValueAt(form.getTblpengembalian().getSelectedRow(), 0)
                    .toString());
            kembali.setKodebuku(form.getTblpengembalian().getValueAt(form.getTblpengembalian().getSelectedRow(), 2)
                    .toString());
            kembali.setTglpinjam(form.getTblpengembalian().getValueAt(form.getTblpengembalian().getSelectedRow(), 4)
                    .toString());
            pengembalianDao.delete(kembali);
            JOptionPane.showMessageDialog(form, "Data pengembalian dihapus!", null, 2);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
     public void get() {
        try {
            form.getBtnkembalikan().setEnabled(true);
            String tglPinjam = form.getTblpengembalian().getValueAt(form.getTblpengembalian().getSelectedRow(), 4)
                    .toString();
            String tglkembali = form.getTblpengembalian().getValueAt(form.getTblpengembalian().getSelectedRow(), 5)
                    .toString();
            form.getCbokodeanggota()
                    .setSelectedItem(form.getTblpengembalian().getValueAt(form.getTblpengembalian().getSelectedRow(), 0)
                            .toString());
            form.getCbokodebuku()
                    .setSelectedItem(form.getTblpengembalian().getValueAt(form.getTblpengembalian().getSelectedRow(), 2)
                            .toString());
            form.getTxttglpinjam()
                    .setText(tglPinjam);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String tglDikembalikan = format.format(new java.util.Date());
            form.getTxttgldikembalikan().setText(tglDikembalikan);
            int terlambat = pengembalianDao.selisihtgl(tglDikembalikan, tglkembali);
            kembali.setTerlambat(terlambat);
            form.getTxtterlambat().setText("" + terlambat);
            form.getTxtdenda().setText((String.valueOf(kembali.getDenda())));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, e, null, 0);
        }
    }
    
     public void tampil() {
        try {
            DefaultTableModel tableModel = (DefaultTableModel) form.getTblpengembalian().getModel();
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
            String cari = form.getTxtcari().getText();
            DefaultTableModel tableModel = (DefaultTableModel) form.getTblpengembalian().getModel();
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
        String tglDikembalikan = form.getTxttgldikembalikan().getText();
        String Tglkembali = form.getTblpengembalian().getValueAt(form.getTblpengembalian().getSelectedRow(), 5)
                .toString();
        int terlambat = pengembalianDao.selisihtgl(tglDikembalikan, Tglkembali);
        if(terlambat <= 0){
            terlambat = 0;
        }
        form.getTxtterlambat().setText("" + terlambat);
        form.getTxttgldikembalikan().setText(tglDikembalikan);
        form.getTxtdenda().setText((String.valueOf(terlambat * 2000)));
        return terlambat;
    }
}
