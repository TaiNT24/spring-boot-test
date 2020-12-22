package com.example.demo.services;

import com.example.demo.component.SinhVienComponent;
import com.example.demo.entity.SinhVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinhVienServiceImpl implements SinhVienService{

    @Autowired
    SinhVienComponent component;

    @Override
    public int insertDefaultSinhVien() {
        return component.insertDefaultSinhVien();
    }

    @Override
    public int insertNewSinhVien(SinhVien sv) {
        return component.insertNewSinhVien(sv);
    }

    @Override
    public List<SinhVien> findSinhVien(String name) {
        return component.findSinhVien(name);
    }

    @Override
    public int updateHovatenSinhVien(int id, String name) {
        return component.updateHovatenSinhVien(id, name);
    }
}
