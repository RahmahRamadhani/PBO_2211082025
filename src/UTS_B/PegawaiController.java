/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_B;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LABP1KOMP
 */
public class PegawaiController {
    private FormPegawai formPegawai;
    private PegawaiDao PegawaiDao;
    private Pegawai pegawai;
    private Object Pegawai;
    
    public PegawaiController(FormPegawai formPegawai){
        this.formPegawai = formPegawai;
        PegawaiDao = new PegawaiDaoImpl();
    }

    public PegawaiController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void bersihForm(){
        formPegawai.getTxtNip().setText("");
        formPegawai.getTxtNama().setText("");
        formPegawai.getTxtAlamat().setText("");
    }
    
    public void savePegawai(){
        pegawai = new Pegawai();
        pegawai.setNip(formPegawai.getTxtNip().getText());
        pegawai.setNama(formPegawai.getTxtNama().getText());
        pegawai.setAlamat(formPegawai.getTxtAlamat().getText());
        PegawaiDao.save(pegawai);
        javax.swing.JOptionPane.showMessageDialog(formPegawai,
                "Entri Ok");
    }
    
    public void getPegawai(){
        int index = formPegawai.getTblPegawai().getSelectedRow();
        pegawai = PegawaiDao.getPegawai(index);
        if(Pegawai != null){
            formPegawai.getTxtNip().setText(pegawai.getNip());
            formPegawai.getTxtNama().setText(pegawai.getNama());
            formPegawai.getTxtAlamat().setText(pegawai.getAlamat());
        }
    }
    
    public void updatePegawai(){
        int index = formPegawai.getTblPegawai().getSelectedRow();
        pegawai.setNip(formPegawai.getTxtNip().getText());
        pegawai.setNama(formPegawai.getTxtNama().getText());
        pegawai.setAlamat(formPegawai.getTxtAlamat().getText());
        PegawaiDao.update(index, pegawai);
        javax.swing.JOptionPane.showMessageDialog(formPegawai,
                "Update Ok");
    }
    
    public void deletePegawai(){
        int index = formPegawai.getTblPegawai().getSelectedRow();
        PegawaiDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formPegawai, "Delete");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) formPegawai.getTblPegawai().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Pegawai> list = PegawaiDao.getAll();
        for(Pegawai pegawai : list){
            Object[] data = {
                pegawai.getNip(),
                pegawai.getNama(),
                pegawai.getAlamat()
        };
        tabelModel.addRow(data);
        }
    }
}
