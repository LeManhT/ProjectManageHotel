/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package qlks.dao;

import java.util.ArrayList;

/**
 *
 * @author Le Manh
 */
public interface EmployeeInterface <Em> {
    //       Employee 
    public int addEmployee(Em em);
    public int updateEnployee(Em em);
    public int deleteEmployee (Em em);
    public ArrayList<Em> selectAllEmployees(Em em);
}
