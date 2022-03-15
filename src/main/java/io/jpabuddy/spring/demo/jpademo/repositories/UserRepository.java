package io.jpabuddy.spring.demo.jpademo.repositories;

import io.jpabuddy.spring.demo.jpademo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}