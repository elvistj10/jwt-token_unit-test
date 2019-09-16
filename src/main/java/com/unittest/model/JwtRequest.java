package com.unittest.model;

import java.io.Serializable;
import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class JwtRequest implements Serializable {
	
	private static final long serialVersionUID = 314351108380520374L;
	private String username;
	private String password;

}