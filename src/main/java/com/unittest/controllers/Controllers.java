package com.unittest.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.unittest.model.Siswa;
import com.unittest.service.SiswaService;

@RestController
@RequestMapping("/siswa")
public class Controllers {
	
	@Autowired private SiswaService service;
	
	@PostMapping("/add")
	public List<Siswa> save(@RequestBody List<Siswa> siswa) {
		return service.saveService(siswa);
	}
	
	@GetMapping("/list")
	public List<Siswa> findAll() {
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Siswa> findOne(@PathVariable Long id, Siswa siswa) {
		return service.findById(siswa, id);
	}
	
	@PutMapping("/update/{id}")
	public Object update(@RequestBody Siswa siswa, @PathVariable Long id) {		
		return service.findByIdToUpdate(siswa, id);	
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		return service.findByIdToDelete(id);
	}
	
}