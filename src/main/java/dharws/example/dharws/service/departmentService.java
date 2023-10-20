package dharws.example.dharws.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import dharws.example.dharws.model.department;
import dharws.example.dharws.repository.departmentrepository;

@Service
public class departmentService {
	@Autowired
	departmentrepository deptrepo;
	public String sayHello() {
		return "Hello Dharani!!";
	}
	public String savedepartment(department dept) {
		Optional<department> isdept=deptrepo.findByName(dept.getName());
		if(!isdept.isPresent()) {
			deptrepo.save(dept);
			return "Department Saved Successfully";
		}
		else {
	        return "Department already exists by Id:"+ dept.getName();		
		}
	}
	public List<department> getAlldepartments(){
		return deptrepo.findAll();
	}
	}

