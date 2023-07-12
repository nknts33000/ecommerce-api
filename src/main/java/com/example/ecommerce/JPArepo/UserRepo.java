package com.example.ecommerce.JPArepo;

import com.example.ecommerce.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Long> {
    void deleteUserById(Long id);

    Optional<User> findUserById(Long id); //optional to prevent NullPointerException
}
