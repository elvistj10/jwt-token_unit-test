package com.unittest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unittest.controllers.Controllers;
import com.unittest.model.Siswa;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SaveDataTests {
	
	@Autowired
	public Controllers controllers;
	
	public ObjectMapper mapper = new ObjectMapper();
	
	@Test
	public void save() throws JsonProcessingException {
		Siswa sis = new Siswa();
		Siswa sis2 = new Siswa();
		Siswa sis3 = new Siswa();
		List<Siswa> siswa = new ArrayList<Siswa>();
		
		sis.setNama("Ama");
		sis.setAlamat("Sabu");
		
		sis2.setNama("Riana");
		sis2.setAlamat("Padang");
		
		sis3.setNama("Bernard");
		sis3.setAlamat("Manado");
		
		siswa.add(sis);
		siswa.add(sis2);
		siswa.add(sis3);
				
		controllers.save(siswa);
		assertEquals(mapper.writeValueAsString(controllers.save(siswa)), mapper.writeValueAsString(siswa));
	}

}
