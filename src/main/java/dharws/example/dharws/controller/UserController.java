package dharws.example.dharws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dharws.example.dharws.model.User;
import dharws.example.dharws.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	@Autowired
	UserService userService;
	@GetMapping("/hello")
public String sayHello() {
	return userService.sayHello();
}
	@GetMapping("/get")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	@PostMapping("/save")
	public String saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
}
