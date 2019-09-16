package com.unittest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.unittest.model.Siswa;

@Repository
public interface SiswaRepository extends JpaRepository<Siswa, Long>{}