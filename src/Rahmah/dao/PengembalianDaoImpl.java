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
    
    public PengembalianDaoImpl(Connection connection){
        this.connection = connection;
    }
    
    public void insert (Pengembalian pengembalian)throws Exception{
        String sql = "INSERT INTO Pengembalian VALUES (?,?,?,?)";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setString(1, pengembalian.getKodeAnggota().getKodeanggota());
        ps.setString(2, pengembalian.getKodeBuku().getKodebuku());
        ps.setString(3, pengembalian.getTglpinjam());
        ps.setString(4, pengembalian.getTglkembali());
        ps.executeUpdate();
        ps.close();
    }
}
