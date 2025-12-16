package com.example.tutor.repository;

import com.example.tutor.entity.User;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends R2dbcRepository<User, String> {
  Mono<User> findByEmail(String email);
}
