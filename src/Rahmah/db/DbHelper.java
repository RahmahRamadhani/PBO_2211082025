/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rahmah.db;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB-MM
 */
public class DbHelper {
    private static Connection connection;
    
    public static Connection getConnection () throws SQLException{
        if(connection==null){
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost/pbo_2211082025");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }
        return connection;
    }
    
    public static void main(String[] args){
        try{
            DbHelper.getConnection();
            JOptionPane.showMessageDialog(null, "Koneksi Ok");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
