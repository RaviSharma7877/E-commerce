package com.masai.Services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.masai.models.User;

public class UserService {
	private List<User> userList;
	
	public void init() {
		System.out.println("SYSTEM STERTED ");
		LocalDate ld = LocalDate.now();
		userList = new ArrayList<>();
		userList.add(new User("RaviSharma","sraa7877@gmail.com","Ravi@123",ld));
		userList.add(new User("PinkySharma","pinks@gmail.com","Pink@123",ld));
		userList.add(new User("PankloSharma","panklo77@gmail.com","Panklo@123",ld));
		userList.add(new User("PanSharma","pan7@gmail.com","Pan@123",ld));
		System.out.println("User added successfully");
	}
	
	public List<User> getAllUsers() {
        return userList;
    }
}
