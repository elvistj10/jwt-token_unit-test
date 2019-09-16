package com.unittest.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.unittest.model.Siswa;
import com.unittest.repository.SiswaRepository;
import com.unittest.service.SiswaService;

@Service
public class SiswaServiceImpl implements SiswaService {

	@Autowired
	private SiswaRepository repos;

	@Override
	public List<Siswa> saveService(List<Siswa> siswa) { // POST TO SAVE
		try {
			repos.saveAll(siswa);
			return siswa;
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage() + ", Cause by : " + e.getCause());
			return null;
		}		
	}

	@Override
	public List<Siswa> findAll() { // GET ALL SISWA
		try {
			return repos.findAll();
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage() + ", Cause by : " + e.getCause());
			return null;
		}
	}

	@Override
	public Optional<Siswa> findById(Siswa siswa, Long id) { // FIND ONE SISWA
		try {
			return repos.findById(id);
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage() + ", Cause by : " + e.getCause());
			return null;
		}
	}

	@Override
	public Object findByIdToUpdate(Siswa siswa, Long id) { // FIND BY ID TO UPDATE
		try {
			Optional<Siswa> sis = repos.findById(id);
			sis.get().setNama(siswa.getNama());
			sis.get().setAlamat(siswa.getAlamat());
			repos.save(sis.get());
			return sis.get();
		} catch (Exception e) {
			return "Error : " + e.getMessage() + ", Cause by : " + e.getCause();
		}
	}

	@Override
	public String findByIdToDelete(Long id) { // FIND BY ID TO DELETE
		try {
			Optional<Siswa> sis = repos.findById(id);
			repos.delete(sis.get());
			return "Delete Sukses . . .";
		} catch (Exception e) {
			return "Error : " + e.getMessage() + ", Cause by : " + e.getCause();
		}
	}

}
