package dharws.example.dharws.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dharws.example.dharws.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,String>{
Optional<User> findByEmail(String Email);
}
