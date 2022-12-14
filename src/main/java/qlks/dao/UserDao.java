/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.dao;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import qlks.modal.User;

/**
 *
 * @author Le Manh
 */
public class UserDao implements daoInterface<User>{
    public static UserDao getInstance () {
        return new UserDao();
    }
    
    public int addUser(User t){
        int result = 0;
        try {
            //Buoc 1 Connect
        Connection conn = ConnectDB.getConnection();
        // Buoc 2 Tao ra Statement
        Statement st = conn.createStatement();
        //Buoc 3 Thuc thi cau lenh SQL
        String sql = "Insert into User"
                + " values ('"+t.getName()+"' , '"+t.getAddress()+"' , "+t.getPhone()+"' ,'"+t.getRoom()+"' ,'"+t.getGioiTinh()+"')";
        
            System.out.println(sql);
              result = st.executeUpdate(sql); // tra ve so luong dong bi thay doi (dung trong update, insert,add..)
//           Buoc 4 Thuc thi
             System.out.println("Ban da thuc thi : " + sql);
             System.out.println("So dong thay doi" + result);
//        Buoc 5 Dong 
//    ConnectDB.closeConnection(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateUser(User t) {
                    int result = 0;

        try {
            //Buoc 1 Connect
        Connection conn = ConnectDB.getConnection();
        // Buoc 2 Tao ra Statement
        Statement st = conn.createStatement();
        //Buoc 3 Thuc thi cau lenh SQL
        String sql = "update  User(Id,Name,Address,Phone,GioiTinh) "
                + " set (Id = + '"+t.getId()+"' , '"+t.getName()+"' , '"+t.getAddress()+"' , "+t.getPhone()+"' , '"+t.getGioiTinh()+"')";
        
            
              result = st.executeUpdate(sql); // tra ve so luong dong bi thay doi (dung trong update, insert,add..)
//           Buoc 4 Thuc thi
             System.out.println("Ban da thuc thi : " + sql);
             System.out.println("So dong thay doi" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
                     return result;
    }
    

    @Override
    public int deleteUser(User t) {
                      int result = 0;
        try {
            //Buoc 1 Connect
        Connection conn = ConnectDB.getConnection();
        // Buoc 2 Tao ra Statement
        Statement st = conn.createStatement();
        //Buoc 3 Thuc thi cau lenh SQL
        String sql = "update  User(Id,Name,Address,Phone,GioiTinh) "
                + " set (Id = + '"+t.getId()+"' , '"+t.getName()+"' , '"+t.getAddress()+"' , "+t.getPhone()+"' , '"+t.getGioiTinh()+"')";
        
            
              result = st.executeUpdate(sql); // tra ve so luong dong bi thay doi (dung trong update, insert,add..)
//           Buoc 4 Thuc thi
             System.out.println("Ban da thuc thi : " + sql);
             System.out.println("So dong thay doi" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
                     return result;
    }

    @Override
    public ArrayList<User> selectAllUsers() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public User selectUserById(User t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
