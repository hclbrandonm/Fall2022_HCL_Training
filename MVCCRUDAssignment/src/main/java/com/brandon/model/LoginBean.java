package com.brandon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Model -> POJO +business logic
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginBean {
	private String name, password;

	public boolean validate() {
		if (name.equals("root") && password.equals("root")) {
			return true;
		} else {
			return false;
		}
	}

}