/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rahmah.dao;
import Rahmah.model.*;
import java.sql.*;
import java.util.*;
/**
 *
 * @author LAB-JARINGAN01
 */
public class PengembalianDaoImpl implements PengembalianDao {
    private Connection connection;
    private Pengembalian pengembalian;
    
    public PengembalianDaoImpl(Connection connection){
        this.connection = connection;
    }
    
    public void insert (Pengembalian pengembalian)throws Exception{
        String sql = "INSERT INTO Pengembalian VALUES (?,?,?,?)";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setString(1, pengembalian.getKodeAnggota());
        ps.setString(2, pengembalian.getKodebuku());
        ps.setString(3, pengembalian.getTglpinjam());
        ps.setString(4, pengembalian.getTglkembali());
        ps.setInt(5, pengembalian.getTerlambat());
        ps.setDouble(6, pengembalian.getDenda());
        ps.executeUpdate();
        ps.close();
    }
    
    public void update (Pengembalian pengembalian) throws Exception{
        String update =  "UPDATE `pengembalian` SET `Tglkembali` = ?, `Terlambat` = ?, `Denda` = ? WHERE `pengembalian`.`kodeAnggota` = ? AND `pengembalian`.`Kodebuku` = ? AND `pengembalian`.`TglPinjam` = ?";
        PreparedStatement ps = connection.prepareStatement(update);
        ps.setString(1, pengembalian.getTglkembali());
        ps.setInt(2, pengembalian.getTerlambat());
        ps.setDouble(3, pengembalian.getDenda());
        ps.setString(4, pengembalian.getKodeAnggota());
        ps.setString(5, pengembalian.getKodebuku());
        ps.setString(6, pengembalian.getTglpinjam());
        ps.executeUpdate();
    }
    
    public void delete(Pengembalian pengembalian)throws SQLException{
        String delete = "DELETE FROM pengembalian WHERE kodeAnggota = ? and Kodebuku = ? and Tglpinjam = ?";
        PreparedStatement ps = connection.prepareStatement(delete);
        ps.setString(1, pengembalian.getKodeAnggota());
        ps.setString(2, pengembalian.getKodebuku());
        ps.setString(3, pengembalian.getTglpinjam());
        ps.executeUpdate();
    }
    
    public int selisihtgl(String tgl1, String tgl2) throws Exception{
        int selisih = 0;
        String terlambat = "select datediff(?,?)as selisih";
        PreparedStatement ps = connection.prepareStatement(terlambat);
        ps.setString(1,tgl1);
        ps.setString(2,tgl2);
        ResultSet rs = ps.executeQuery();
           if(rs.next()){
            selisih = rs.getInt(1);
        }
        return selisih;
    }
    
     public Pengembalian getPengembalian (String kodeAnggota, String Kodebuku, String Tglkembali)throws SQLException, Exception {
        String sql = "select * from peminjaman where kodeAnggota= ? and Kodebuku= ? and Tglkembali= ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodeAnggota);
        ps.setString(2, Kodebuku);
        ps.setString(3, Tglkembali);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            pengembalian = new Pengembalian();
            pengembalian.setKodeAnggota(rs.getString(1));
            pengembalian.setKodebuku(rs.getString(2));
            pengembalian.setTglpinjam(rs.getString(3));
            pengembalian.setTglkembali(rs.getString(4));
        }
        return pengembalian;
    }
     
     public List<Pengembalian> getAll()throws SQLException{
        String sql =  "SELECT anggota.kodeAnggota, anggota.namaAnggota, buku.Kodebuku, buku.Judulbuku, peminjaman.TglPinjam, peminjaman.Tglkembali, pengembalian.Tglkembali, pengembalian.Terlambat, pengembalian.Denda "
                +"FROM peminjaman JOIN anggota ON peminjaman.kodeAnggota = anggota.kodeAnggota JOIN buku ON peminjaman.Kodebuku = buku.Kodebuku "
                +"LEFT JOIN pengembalian ON (peminjaman.kodeAnggota = pengembalian.KodeAnggota AND peminjaman.Kodebuku = pengembalian.Kodebuku AND CAST(peminjaman.TglPinjam AS DATE) = CAST(pengembalian.TglPinjam AS DATE))";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Pengembalian> list = new ArrayList<>();
        while(rs.next()){
            pengembalian = new Pengembalian();
            pengembalian.setKodeAnggota(rs.getString(1));
            pengembalian.setNamaAnggota(rs.getString(2));
            pengembalian.setKodebuku(rs.getString(3));
            pengembalian.setJudulBuku(rs.getString(4));
            pengembalian.setTglpinjam(rs.getString(5));
            pengembalian.setTglkembali(rs.getString(6));
            pengembalian.setDikembalikan(rs.getString(7));
            pengembalian.setTerlambat(rs.getInt(8));
            pengembalian.setDenda(rs.getDouble(9));
            list.add(pengembalian);
        }
        return list;
    }
     
      public List<Pengembalian> cari(String kode, String cari)throws Exception{
        String sql = "SELECT anggota.kodeAnggota, anggota.namaAnggota, buku.Kodebuku, buku.Judulbuku, peminjaman.Tglpinjam, peminjaman.Tglkembali, pengembalian.Tglkembali, pengembalian.Terlambat, pengembalian.Denda\n" +
                    "FROM peminjaman\n" +
                    "JOIN anggota ON peminjaman.kodeAnggota = anggota.kodeAnggota\n" +
                    "JOIN buku ON peminjaman.Kodebuku = buku.Kodebuku\n" +
                    "LEFT JOIN pengembalian ON (peminjaman.kodeAnggota = pengembalian.kodeAnggota AND peminjaman.Kodebuku = pengembalian.Kodebuku AND CAST(peminjaman.Tglpinjam AS DATE) = CAST(pengembalian.Tglpinjam AS DATE))\n" +
                    "WHERE "+kode+" like '%"+cari+"%'";
        PreparedStatement ps = connection.prepareStatement(sql);
//      ps.setString(1, kode);
        ResultSet rs = ps.executeQuery();
        List<Pengembalian> list = new ArrayList<>();
        while(rs.next()){
            pengembalian = new Pengembalian();
            pengembalian.setKodeAnggota(rs.getString(1));
            pengembalian.setNamaAnggota(rs.getString(2));
            pengembalian.setKodebuku(rs.getString(3));
            pengembalian.setJudulBuku(rs.getString(4));
            pengembalian.setTglpinjam(rs.getString(5));
            pengembalian.setTglkembali(rs.getString(6));
            pengembalian.setDikembalikan(rs.getString(7));
            pengembalian.setTerlambat(rs.getInt(8));
            pengembalian.setDenda(rs.getDouble(9));
            list.add(pengembalian);
        }
        return list;
    }
}
