package com.lcwd.electronic.store.dtos;


//import org.hibernate.validator.constraints.Email;
//import org.hibernate.validator.constraints.NotBlank;

import jakarta.validation.constraints.Size;

import com.lcwd.electronic.store.validate.ImageNameValid;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
	
	private String userId;
	
	@Size(min =3, max=15)
	private String name;
	
	//@Email(message= "Invalid email")
	@Pattern(regexp ="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid user EMail")
	private String email;
	
	@NotBlank(message= "password required")
	private String password;
	
	@Size(min =4, max=6, message="invalid gender")
	private String gender;
	
	@NotBlank(message="invalid")
	private String about;
	
	@ImageNameValid
	private String imageName;
}
