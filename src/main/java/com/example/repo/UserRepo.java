package com.example.repo;

import com.example.domain.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@EnableAutoConfiguration
@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
