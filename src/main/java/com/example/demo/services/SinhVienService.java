package com.example.demo.services;

import com.example.demo.entity.SinhVien;

import java.util.List;

public interface SinhVienService {
    public int insertDefaultSinhVien();
    public int insertNewSinhVien(SinhVien sv);
    public List<SinhVien> findSinhVien(String name);
    public int updateHovatenSinhVien(int id, String name);

}
