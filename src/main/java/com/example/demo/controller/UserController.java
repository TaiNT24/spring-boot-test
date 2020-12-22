package com.example.demo.controller;

import com.example.demo.entity.SinhVien;
import com.example.demo.services.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sinhvien")
public class UserController {
    @Autowired
    SinhVienService service;

    @GetMapping("/getInfo")
    public String getUserInfo(){
        return "NguyenTuTai";
    }

    @PostMapping("/insertDefaultSinhVien")
    public int insertDefaultValue(){
        return service.insertDefaultSinhVien();
    }

    @PostMapping("/insertSinhVien")
    public int insertDefaultValue(@RequestBody SinhVien sv){
        return service.insertNewSinhVien(sv);
    }

    @GetMapping("/findSinhVien")
    public List<SinhVien> findSinhVien(@RequestParam String name){
        return service.findSinhVien(name);
    }

    @PutMapping("/updateHovatenSinhVien")
    public int updateHovatenSinhVien(@RequestParam String id, @RequestParam String name){
        return service.updateHovatenSinhVien(Integer.parseInt(id), name);
    }

}
