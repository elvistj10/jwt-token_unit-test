package com.unittest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.*;

@Entity(name = "data_siswa")
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Siswa {
	
	@Id
	@Column(name = "id_siswa")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)	
	private Long id;
	
	@Column(name = "nama_siswa")
	private String nama;
	
	@Column(name = "alamat_siswa")
	private String alamat;

}
