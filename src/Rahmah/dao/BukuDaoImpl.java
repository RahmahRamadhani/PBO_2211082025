/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rahmah.dao;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import Rahmah.model.Buku;


/**
 *
 * @author LABP1KOMP
 */
public class BukuDaoImpl {
    private Connection connection;
    
    public BukuDaoImpl(Connection connection){
        this.connection = connection;
    }

    public BukuDaoImpl(Connection connection) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void insert (Buku buku) throws Exception {
        String sql = "Insert into buku values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getJudulbuku());
        ps.setString(2, buku.getKodebuku());
        ps.setString(3, buku.getPenerbit());
        ps.setString(4, buku.getPengarang());
        ps.executeUpdate();
        ps.close();
    }
    public void update(Buku buku) throws Exception{
        String sql = "UPDATE anggota SET namaanggota = ? , alamat = ? , jeniskelamin = ? "
                +"WHERE kodeanggota = ? ";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getJudulbuku());
        ps.setString(2, buku.getKodebuku());
        ps.setString(3, buku.getPenerbit());
        ps.setString(4, buku.getPengarang());
        ps.executeUpdate();
        ps.close();
    }
    
    public void delete(Buku buku) throws Exception{
        String sql = "DELETE FROM anggota WHERE kodeanggota = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getKodebuku());
        ps.executeUpdate();
    }

    public Buku getJudulBuku(String kode) throws Exception {
        String sql = "SELECT * FROM buku WHERE kodeanggota = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kode);
        ResultSet rs = ps.executeQuery();
        Buku buku = null;
        if(rs.next()){
            buku = new Buku();
            buku.setJudulbuku(rs.getString(1));
            buku.setKodebuku(rs.getString(2));
            buku.setPenerbit(rs.getString(3));
            buku.setPengarang(rs.getString(4));
        }
        return buku;
    }

    public List<Buku> getAll() throws Exception {
        String sql = "Select * FROM buku";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Buku buku;
        List<Buku > list = new ArrayList<>();
        while(rs.next()){
            buku = new Buku();
            buku.setJudulbuku(rs.getString(1));
            buku.setKodebuku(rs.getString(2));
            buku.setPenerbit(rs.getString(3));
            buku.setPengarang(rs.getString(4));
            list.add(buku);
        }
        return list;
    }
}
