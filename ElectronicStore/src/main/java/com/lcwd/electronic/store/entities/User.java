package com.lcwd.electronic.store.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity //It represents table inside the database
@Table(name = "users")//for changing the name of the table which is "User" here and will be changed to "users"
public class User {
		
		// Now we will create the column inside the table.
		@Id  //It will create Primary key
		//@GeneratedValue(strategy = GenerationType.IDENTITY)//It will auto increment the values
		private String userId;
		@Column(name ="user_name") //change the name of the column
		private String name;
		@Column(name ="user_email",unique = true) //change the name of the column and make it unique also
		private String email;
		@Column(name ="user_password", length=10)
		private String password;
		private String gender;
		@Column(length=1000)
		private String about;
		@Column(name="user_image_name")
		private String imageName;
	
		
}
