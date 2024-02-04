/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2;

import java.io.File;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kimho
 */
public class DocGhuFile implements Serializable {

    public String ghiFile(String path, List<NhanVien> lists) {
        File file = new File(path);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                return "Tạo file thất bại";
            }
        }

        try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (NhanVien nhanVien : lists) {
                oos.writeObject(nhanVien);
            }
        } catch (IOException ex) {
            return "Ghi file thất bại";
        }
        return "Ghi file thành công";
    }

    public List<NhanVien> docFile(String path, DefaultTableModel tableModel) {
        List<NhanVien> lists = new ArrayList<>();
        File file = new File(path);

        if (!file.exists()) {
            System.out.println("File không tồn tại");
            return null;
        }

        
        tableModel.setRowCount(0);

        try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (fis.available() > 0) {
                NhanVien nhanVien = (NhanVien) ois.readObject();
                lists.add(nhanVien);

               
                tableModel.addRow(new Object[]{nhanVien.getMaNV(), nhanVien.getTenNV(), nhanVien.getThamNien(), nhanVien.getGioiTinh()});
            }
        } catch (Exception e) {
            System.out.println("Đọc file thất bại");
            return null;
        }

        return lists;
    }
}
