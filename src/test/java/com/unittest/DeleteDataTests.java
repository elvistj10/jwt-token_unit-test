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
public class DeleteDataTests {
	
	@Autowired
	public Controllers controllers;
	
	public ObjectMapper mapper = new ObjectMapper();
	
	@Test
	public void delete() throws JsonProcessingException {
		Siswa sis = new Siswa();
		Siswa sis2 = new Siswa();
		List<Siswa> siswa = new ArrayList<Siswa>();
		
		sis.setNama("Jonathan");
		sis.setAlamat("Surabaya");
		
		sis2.setNama("Trisno");
		sis2.setAlamat("Brebes");
		
		siswa.add(sis);
		siswa.add(sis2);
		
		controllers.save(siswa);		
		assertEquals("Delete Sukses . . .", controllers.delete(Long.parseLong("1")));
	}

}
