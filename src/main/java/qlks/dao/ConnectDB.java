/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Le Manh
 */
public class ConnectDB {
    
  public static Connection getConnection(){
        Connection conn = null;
        
        try {
            String hostname = "localhost";
        String sqlInstanceName = "DELL\\SQLEXPRESS";
//        String sqlDatabase = "Test";
        String sqlDatabase = "BookStore";
        String sqlUser = "sa";
        String sqlPassword = "M@050902";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
               Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            //jdbc:sqlserver://localhost:1433;instance=COMPUTERBERRY;databaseName=Database;
            String connectURL = "jdbc:sqlserver://" + hostname + ":1433" 
                    + ";instance=" + sqlInstanceName + ";databaseName=" + sqlDatabase +";encrypt=true;trustServerCertificate=true;";

            conn = DriverManager.getConnection(connectURL, sqlUser, sqlPassword);
            System.out.println("Connect to database successful!!"); 
            
                                
    }
         catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        return conn;
    }
  
  public static void closeConnection(Connection conn){
        try {
            if(conn != null){
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void printInfor(Connection conn){
        try {
             if(conn != null){
            DatabaseMetaData mtdt = conn.getMetaData(); 
            System.out.print(mtdt.getDatabaseProductName());
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
