/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.DanhMuc;

/**
 *
 * @author SAD
 */
public interface DanhMucDao {
    public ArrayList<DanhMuc> getListDanhMucCha();
    public ArrayList<DanhMuc> getListDanhMucCon(String maDanhMuc);
}
