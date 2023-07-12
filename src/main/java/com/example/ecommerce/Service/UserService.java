package com.example.ecommerce.Service;

import com.example.ecommerce.Exceptions.UserNotFoundException;
import com.example.ecommerce.JPArepo.UserRepo;
import com.example.ecommerce.Model.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    private final UserRepo userRepo;
    @Autowired
    public UserService(UserRepo userRepo){
        this.userRepo=userRepo;
    }

    public User addUser(User user){
        return userRepo.save(user);
    }

    public List<User> findAllUsers(){
        return userRepo.findAll();
    }

    public User findUserById(long id){
        return userRepo.findUserById(id).orElseThrow(()-> new UserNotFoundException("User by id "+ id + " was not found." ));
    }

    public User updateUser(User user){
        return userRepo.save(user);
    }

    public void deleteUserById(long id){
        userRepo.deleteUserById(id);
    }

}
