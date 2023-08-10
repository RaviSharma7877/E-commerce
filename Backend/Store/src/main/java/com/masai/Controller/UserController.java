package com.masai.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Services.UserService;
import com.masai.models.User;

@RestController
@RequestMapping("/users")
public class UserController {
	private UserService userservice;

	public UserController(UserService userservice) {
		this.userservice = new UserService();
	}
	@GetMapping
    public List<User> getAllEmployees() {
        return userservice.getAllUsers();
    }
	
}
