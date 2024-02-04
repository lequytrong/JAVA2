/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kimho
 */
public interface QuanLyNhanVien {

    List<NhanVien> fakeData();

    public String themNhanVien(NhanVien nv);

    public String xoaNhanVien(int index);

    public String suaNhanVien(int index, NhanVien newNhanVien);

    public List<NhanVien> timKiem(String searchText);

}
