/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawan;

import com.mysql.jdbc.Driver;
import java.sql.*;

/**
 *
 * @author Lenovo
 */
public class koneksi {
     private static Connection koneksi;
public static Connection GetConnection() throws SQLException{
if (koneksi == null){
new Driver();
koneksi = 
DriverManager.getConnection("jdbc:mysql://localhost:3306/kantor","root","");
 }
return koneksi;
}
}
