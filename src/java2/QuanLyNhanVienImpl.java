/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kimho
 */
public class QuanLyNhanVienImpl implements QuanLyNhanVien {

    private List<NhanVien> listNV = new ArrayList<>();
    

    @Override
    public List<NhanVien> fakeData() {
        listNV.add(new NhanVien("NV000", "Nguyễn Văn A", 0, 12));
        listNV.add(new NhanVien("NV001", "Vũ Thị B", 1, 7));
        listNV.add(new NhanVien("NV002", "Lê Tiến Quân", 0, 20));
        listNV.add(new NhanVien("NV003", "Đinh thị Trâm", 1, 19));
        listNV.add(new NhanVien("NV004", "Hoàng Ngọc Dương", 0, 2));
        return listNV;
    }

    @Override
    public String themNhanVien(NhanVien nv) {
        if (nv != null) {
            listNV.add(nv);
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String xoaNhanVien(int index) {
        if (index != -1) {
            listNV.remove(index);
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }

    @Override
    public String suaNhanVien(int index, NhanVien newNhanVien) {
        if (index != -1) {
            listNV.set(index, newNhanVien);
            return "Sửa thành công";
        }
        return "Sửa thất bại";
    }

    @Override
    public List<NhanVien> timKiem(String searchText) {
        List<NhanVien> nhanViens = new ArrayList<>();
        //for (NhanVien nhanVien : listNV) {
//            String ten = nhanVien.getTenNV().toLowerCase();
//            if (ten.equalsIgnoreCase(searchText.toLowerCase())) {
//                nhanViens.add(nhanVien);
//            }
//        }
        for (int i = 0; i < listNV.size()-1 ; i++) {
            String ten = listNV.get(i).getTenNV().toLowerCase();
            if (ten.equalsIgnoreCase(searchText.toLowerCase())) {
                nhanViens.add(listNV.get(i));
            }
        }
        return nhanViens;
    }
}
