package com.example.demo.repositories;

import com.example.demo.entity.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface SinhVienRepository extends JpaRepository<SinhVien, Integer> {
    List<SinhVien> findAllByHovatenContains(String ten);

    @Modifying
    @Query("update SinhVien s set s.hovaten = :hovaten where s.id = :id ")
    int setHovatenTa(@Param("id") int id,
                     @Param("hovaten") String hovaten);
}
