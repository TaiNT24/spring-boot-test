package com.example.demo.component;

import com.example.demo.entity.SinhVien;

import java.util.List;

public interface SinhVienComponent {
    public int insertDefaultSinhVien();
    public int insertNewSinhVien(SinhVien sv);
    public List<SinhVien> findSinhVien(String name);
    public int updateHovatenSinhVien(int id, String name);
}
