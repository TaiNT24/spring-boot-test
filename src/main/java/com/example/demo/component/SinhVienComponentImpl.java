package com.example.demo.component;

import com.example.demo.entity.SinhVien;
import com.example.demo.repositories.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SinhVienComponentImpl implements SinhVienComponent{

    @Autowired
    SinhVienRepository repo;

    @Override
    public int insertDefaultSinhVien() {
        try {
            SinhVien sv = repo.save(new SinhVien("NguyenTuTai", 1999));
        }catch (Exception e) {
            return 0;
        }
        return 1;
    }

    @Override
    public int insertNewSinhVien(SinhVien sv) {
        try {
            SinhVien sv_return = repo.save(new SinhVien(sv.getHovaten(), sv.getNamsinh()));
        }catch (Exception e) {
            return 0;
        }
        return 1;
    }

    @Override
    public List<SinhVien> findSinhVien(String name) {
        List<SinhVien> sv_return = new ArrayList<>();
        try {
            sv_return = repo.findAllByHovatenContains(name);
        }catch (Exception e) {
            return null;
        }
        return sv_return;
    }

    @Override
    public int updateHovatenSinhVien(int id, String name) {
        int updateSuccess;
        try {
            updateSuccess = repo.setHovatenTa(id, name);
        }catch (Exception e) {
            return 0;
        }
        return updateSuccess;
    }
}
