/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.dao;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import qlks.modal.Employee;

/**
 *
 * @author Le Manh
 */
public class EmployeeDao implements EmployeeInterface<Employee>{

    @Override
    public int addEmployee(Employee em) {
        int result = 0;
        try {
             //Buoc 1 Connect
        Connection conn = ConnectDB.getConnection();
        // Buoc 2 Tao ra Statement
        Statement st = conn.createStatement();
        //Buoc 3 Thuc thi cau lenh SQL
        String sql = "Insert into User(Id,Name,Address,Phone,GioiTinh) "
                + " values ('"+em.getId()+"' , '"+em.getName()+"' , '"+em.getAge()+"'"
                + " , "+em.getGender()+"' , '"+em.getJob()+"', "+em.getPhone()+"' , '"+em.getLuong()+"', '"+em.getDiaChi()+"')";
        
            
              result = st.executeUpdate(sql); // tra ve so luong dong bi thay doi (dung trong update, insert,add..)
//           Buoc 4 Thuc thi
             System.out.println("Ban da thuc thi : " + sql);
             System.out.println("So dong thay doi" + result);
//        Buoc 5 Dong 
//    ConnectDB.closeConnection(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int updateEnployee(Employee em){
        
        return 0;
        
    }

    @Override
    public int deleteEmployee(Employee em) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Employee> selectAllEmployees(Employee em) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
