package com.example.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class UserService {

	@Autowired
	 private UserRepository repo;
	 

	 public void save(User user) 
	 {
	 repo.save(user);
	 }

	 
	 public void delete(Integer id) 
	 {
	repo.deleteById(id);
	 }
}
