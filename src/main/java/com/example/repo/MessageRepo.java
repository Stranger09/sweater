package com.example.repo;

import com.example.domain.Message;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepo extends JpaRepository<Message, Long> {
    List<Message> findByTag(String tag);
}
