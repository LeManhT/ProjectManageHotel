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
public interface daoInterface <T> {
    // User
       public int addUser(T t);
    public int updateUser(T t);
    public int deleteUser(T t);
    public ArrayList<T> selectAllUsers();
    public T selectUserById(T t);


}
