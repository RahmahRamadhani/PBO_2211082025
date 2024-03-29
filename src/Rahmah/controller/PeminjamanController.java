/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rahmah.controller;
import Rahmah.dao.*;
import Rahmah.db.DbHelper;
import Rahmah.model.*;
import Rahmah.view.FormPeminjaman;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author LABP1KOMP
 */
public class PeminjamanController {
    FormPeminjaman form;
    Peminjaman pinjam;
    PeminjamanDao pinjamDao;
    AnggotaDao agtDao;
    BukuDao bkDao;
    
    public PeminjamanController(FormPeminjaman form){
        try {
            this.form = form;
            pinjamDao = new PeminjamanDaoImpl(DbHelper.getConnection());
            agtDao = new AnggotaDaoImpl(DbHelper.getConnection());
            bkDao = new BukuDaoImpl (DbHelper.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clearForm(){
        form.getTxtTglKembali().setText(" ");
        form.getTxtTglPinjam().setText(" ");
    }
    
    public void isiComboAnggota(){
        try {
            form.getCboKodeAnggota().removeAllItems();
            List<Anggota> list = agtDao.getAll();
            for(Anggota agt:list){
                form.getCboKodeAnggota().addItem(agt.getKodeanggota()+"-"+agt.getNamaanggota());
            }
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void isiComboBuku(){
        try {
            form.getCboKodeBuku().removeAllItems();
            List<Buku> list = bkDao.getAll();
            for(Buku bk: list){
                form.getCboKodeBuku().addItem(bk.getKodebuku()+"-"+bk.getJudulbuku());
            }
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insert(){
        try {
            pinjam = new Peminjaman();
            Anggota agt = agtDao.getAnggota(form.getCboKodeAnggota().getSelectedItem().toString().split("-")[0]);
            pinjam.setAnggota(agt);
            Buku bk = bkDao.getBuku(form.getCboKodeBuku().getSelectedItem().toString().split("-")[0]);
            pinjam.setBuku(bk);
            pinjam.setTglpinjam(form.getTxtTglPinjam().getText());
            pinjam.setTglkembali(form.getTxtTglKembali().getText());
            pinjamDao.insert(pinjam);
            JOptionPane.showMessageDialog(form, "Entri data OK");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(form, "Entri data OK");
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(){
        try {
            Anggota agt = agtDao.getAnggota(form.getCboKodeAnggota().getSelectedItem().toString().split("-")[0]);
            pinjam.setAnggota(agt);
            Buku bk = bkDao.getBuku(form.getCboKodeBuku().getSelectedItem().toString().split("-")[0]);
            pinjam.setBuku(bk);
            pinjam.setTglpinjam(form.getTxtTglPinjam().getText());
            pinjam.setTglkembali(form.getTxtTglKembali().getText());
            pinjamDao.insert(pinjam);
            JOptionPane.showMessageDialog(form, "Update data OK");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(form, "Update data OK");
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    public void delete(){
        try {
            pinjamDao.delete(pinjam);
            JOptionPane.showMessageDialog(form, "Delete OK");
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    
    public void getPeminjaman(){
        try {
            String kodeanggota = form.getTblPeminjaman()
                    .getValueAt(form.getTblPeminjaman().getSelectedRow(), 0).toString();
            String kodebuku = form.getTblPeminjaman()
                    .getValueAt(form.getTblPeminjaman().getSelectedRow(), 2).toString();
            String tglpinjam = form.getTblPeminjaman()
                    .getValueAt(form.getTblPeminjaman().getSelectedRow(), 4).toString();
            
            pinjam = pinjamDao.getPeminjaman(kodeanggota, kodebuku, tglpinjam);
            Anggota agt= agtDao.getAnggota(pinjam.getAnggota().getKodeanggota());
            form.getCboKodeAnggota().setSelectedItem(agt.getKodeanggota()+"-"+agt.getNamaanggota());
            Buku bk= bkDao.getBuku(pinjam.getBuku().getKodebuku());
            form.getCboKodeBuku().setSelectedItem(bk.getKodebuku()+"-"+bk.getJudulbuku());
            form.getTxtTglPinjam().setText(pinjam.getTglpinjam());
            form.getTxtTglKembali().setText(pinjam.getTglkembali());
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tampil(){
        try {
            DefaultTableModel tableModel =(DefaultTableModel) form.getTblPeminjaman().getModel();
            tableModel.setRowCount(0);
            List<Peminjaman> list = pinjamDao.getAll();
            for(Peminjaman pinjam: list){
                Anggota agt= agtDao.getAnggota(pinjam.getAnggota().getKodeanggota());
                Buku bk = bkDao.getBuku(pinjam.getBuku().getKodebuku());
                Object[] row = {
                    agt.getKodeanggota(),
                    agt.getNamaanggota(),
                    bk.getKodebuku(),
                    bk.getJudulbuku(),
                    pinjam.getTglpinjam(),
                    pinjam.getTglkembali()
                        
                        
                };
                tableModel.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
