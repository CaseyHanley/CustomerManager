package com.example.hanley.CustomerManager;


import java.util.List;

public interface UserFactory {

    List<UserEntity> getUsers();
    UserEntity getUserById(int id);
    UserEntity addUser(UserEntity user);

    UserEntity updateUser(UserEntity user);
    String DeleteUserById(int id);
}
