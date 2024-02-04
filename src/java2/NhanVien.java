/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2;

import java.io.File;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author kimho
 */
public class NhanVien implements Serializable {

    private String maNV;

    private String tenNV;

    private int gioiTinh;

    private Integer thamNien;

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Integer getThamNien() {
        return thamNien;
    }

    public void setThamNien(Integer thamNien) {
        this.thamNien = thamNien;
    }

    public NhanVien(String maNV, String tenNV, int gioiTinh, Integer thamNien) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.thamNien = thamNien;
    }

    public NhanVien() {
    }

    public Integer getThuong() {
        if (thamNien > 12) {
            return 500000;
        }
        return 200000;
    }

    public Object[] toRowTable() {
        return new Object[]{maNV, tenNV, gioiTinh == 0 ? "Nam" : "Nữ", thamNien, getThuong()};
    }

    Object getTuoi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
