package com.store.user.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	private String userId;
	@Column(name = "user_name",length = 20)
	private String name;
	@Column(name = "user_email",unique = true)
	private String email;
	@Column(name = "user_password",length = 10)
	private String password;
	@Column(name = "user_gender")
	private String gender;
	@Column(name = "user_about",length = 100)
	private String about;
	@Column(name = "user_image")
	private String imageName;

}
