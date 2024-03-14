package com.store.user.service;

import java.util.List;

import com.store.user.dto.UserDto;

public interface UserService {
	
	//create 
	
	UserDto createUser(UserDto userDto);
	
	
	//update
	UserDto updateUserDto(UserDto userDto,String userId);
	
	//delete
	void delete(String userId);
	
	//get all user
	
	List<UserDto> getAllUser();
	
	//get single user
	
	UserDto getSingleUser(String userId);
	
	
	//get email
	
	UserDto getEmail(String email);
	
	//search user
	
	List<UserDto> getKeyword(String keywords); 

}
