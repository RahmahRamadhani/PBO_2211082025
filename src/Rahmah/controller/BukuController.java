/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rahmah.controller;

import Rahmah.model.*;
import Rahmah.dao.*;
import Rahmah.db.DbHelper;
import Rahmah.view.*;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author LABP1KOMP
 */
public class BukuController {
    FormBuku view;
    Buku buku;
    BukuDao dao;
    Connection connection;
    
    public BukuController(FormBuku view){
        try {
            this.view = view;
            connection = DbHelper.getConnection();
            dao = (BukuDao) new BukuDaoImpl(connection);
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void clearForm(){
        view.getTxtKodeBuku().setText("");
        view.getTxtJudulBuku().setText("");
        view.getTxtPengarang().setText("");
        view.gextPetTnerbit().setText("");
    }
    
    public void tampil(){
        try {
            DefaultTableModel tabelModel = (DefaultTableModel)
                    view.getTabelBuku().getModel();
            tabelModel.setRowCount(0);
            List<Buku> list = dao.getAll();
            for (Buku a : list){
                Object[] row = {
                    a.getJudulbuku(),
                    a.getKodebuku(),
                    a.getPenerbit(),
                    a.getPengarang()
                };
                tabelModel.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insert(){
        try {
            buku = new Buku();
            buku.setKodeBuku(view.getTxtKodeBuku().getText());
            buku.setJudulBuku(view.getTxtJudulBuku().getText());
            buku.setPengarang(view.getTxtPengarang().getText());
            buku.setPenerbit(view.getTxtPenerbit().getText());
            dao.insert(buku);
            JOptionPane.showMessageDialog(view, "Entri Data Ok");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tabelKlik(){
        try {
            String kodeBuku = view.getTabelBuku()
                    .getValueAt(view.getTabelBuku().getSelectedRow(), 0).toString();
            buku = dao.getBuku(kodeBuku);
            view.getTxtKodebuku().setText(buku.getKodebuku());
            view.getTxtJudulbuku().setText(buku.getJudulbuku());
            view.getTxtPengarang().setText(buku.getPengarang());
            view.getTxtPenerbit().setText(buku.getPenerbit());
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(){
        try {
            
            buku.setKodeanggota(view.getTxtKodeBuku().getText());
            buku.setNamaanggota(view.getTxtJudulBuku().getText());
            buku.setAlamat(view.getTxtPengarang().getText());
            buku.setAlamat(view.getTxtPenerbit().getText());
            dao.update(buku);
            JOptionPane.showMessageDialog(view, "Update Data Ok");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete() {
        try {
            dao.delete(buku);
            JOptionPane.showMessageDialog(view, "Delete Data OK");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
