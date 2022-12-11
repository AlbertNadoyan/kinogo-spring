package com.itspace.kinogospringcommon.repository;

import com.itspace.kinogospringcommon.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {


    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndVerifyToken(String email, String token);

}