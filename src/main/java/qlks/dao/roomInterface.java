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
public interface roomInterface <R> {
    //   Room
    public int addRoom(R r);
    public int updateRoom(R r);
    public int deleteRoom(R r);
    public ArrayList<R> selectAllRooms(R r);
    public R selectRoomByUserID(R r);
}
