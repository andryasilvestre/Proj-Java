package com.PI04.PI04.repository;

import com.PI04.PI04.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
