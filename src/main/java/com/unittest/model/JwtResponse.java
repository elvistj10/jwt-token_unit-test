package com.unittest.model;

import lombok.*;
import java.io.Serializable;

@Getter
@ToString
@AllArgsConstructor
public class JwtResponse implements Serializable {
	
	private static final long serialVersionUID = -6898223584778367128L;
	private final String jwttoken;
	
}
