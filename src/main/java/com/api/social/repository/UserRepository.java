package com.api.social.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.api.social.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByEmail(String email);
	

}
