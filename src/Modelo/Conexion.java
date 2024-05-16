/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.*;import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.filechooser.FileSystemView;

public class Conexion {
  Connection con;  
  
  public Connection getConnection(){
      try{
          String myBD = "jdbc:mysql://localhost:3306/sistemaventa?servertimesone=UTC";
          con = DriverManager.getConnection(myBD, "root", "");
          return con;
      }catch (SQLException e){
          System.out.println(e.toString());
      }
      return null;
  }
}