package dharws.example.dharws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import dharws.example.dharws.model.department;
import dharws.example.dharws.service.departmentService;
@RestController
@RequestMapping("/api/v1/_departments")
public class departmentController {
@Autowired
departmentService deptService;
@GetMapping("/hello")
public String sayHello() {
return deptService.sayHello();
}
@GetMapping("/get")
public List<department> getAlldepartments(){
	return deptService.getAlldepartments();
}
@PostMapping("/save")
public String savedepartment(@RequestBody department dept) {
	return deptService.savedepartment(dept);
}
}