package dharws.example.dharws.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.UUID)
	
private String id;
private String name;
private String email;
private String password;
public User() {
	super();
}
public User(String id, String name, String email, String password) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.password = password;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
