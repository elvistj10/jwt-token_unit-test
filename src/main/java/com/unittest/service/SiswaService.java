package com.unittest.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.unittest.model.Siswa;

@Service
public interface SiswaService {
	
	public List<Siswa> saveService(List<Siswa> siswa);
	
	public List<Siswa> findAll();
	
	public Optional<Siswa> findById(Siswa siswa, Long id);
	
	public Object findByIdToUpdate(Siswa siswa, Long id);
	
	public String findByIdToDelete(Long id);

}