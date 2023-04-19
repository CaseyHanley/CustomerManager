package com.example.hanley.CustomerManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserFactory{

    @Autowired
    private UserDAO userDAO;
    @Override
    public List<UserEntity> getUsers() {
        return userDAO.findAll();
    }

    @Override
    public UserEntity getUserById(int id) {
        return userDAO.getReferenceById(id);
    }

    @Override
    public UserEntity addUser(UserEntity user) {
        return userDAO.save(user);
    }

    @Override
    public UserEntity updateUser(UserEntity user) {
        return userDAO.save(user);
    }

    @Override
    public String DeleteUserById(int id) {
        userDAO.deleteById(id);
        return "User with ID: " + id +" has been deleted";
    }
}
