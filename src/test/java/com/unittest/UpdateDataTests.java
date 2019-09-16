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
public class UpdateDataTests {
	
	@Autowired
	public Controllers controllers;
	
	public ObjectMapper mapper = new ObjectMapper();
	
	@Test
	public void update() throws JsonProcessingException {
		Siswa sis = new Siswa();
		List<Siswa> siswa = new ArrayList<Siswa>();
		
		sis.setNama("Riska");
		sis.setAlamat("Aceh");		
		siswa.add(sis);		
		controllers.save(siswa);
		
		sis.setNama("Zaskia");
		sis.setAlamat("Bogor");
		controllers.update(sis, Long.parseLong("1"));
		
		assertEquals(mapper.writeValueAsString(controllers.update(sis, Long.parseLong("1"))), mapper.writeValueAsString(sis));
	}

}
