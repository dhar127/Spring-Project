package dharws.example.dharws.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import dharws.example.dharws.model.department;

@Repository
public interface departmentrepository extends JpaRepository<department,String>{
	Optional<department> findByName(String Name);
	
}
