package com.knoldus.repository;

import java.util.List;
import java.util.Optional;
import com.knoldus.entity.User;

public interface UserRepository {
	Optional<User> findById(Long id);

	User save(User user);

	void deleteById(Long id);

	List<User> findAll();

	void update(Long id, User user);
}