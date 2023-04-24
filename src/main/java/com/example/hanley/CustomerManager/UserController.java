package com.example.hanley.CustomerManager;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class UserController implements UserFactory{


    @Autowired
    @Resource(name = "userService")
    private UserService userService;

   @RequestMapping("/")
   public RedirectView redirect(){
        String newUrl = "http://localhost:4200/home";
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(newUrl);
        return redirectView;
    }

    @GetMapping("/customers")
    @Override
    public List<UserEntity> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/customers/{id}")
    @Override
    public UserEntity getUserById(int id) {
        return userService.getUserById(id);
    }

    @PostMapping("/customers")
    @Override
    public UserEntity addUser(UserEntity user) {
        return userService.addUser(user);
    }

    @PutMapping("/customers/{user}")
    @Override
    public UserEntity updateUser(UserEntity user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/customers/{id}")
    @Override
    public String DeleteUserById(int id) {
        return userService.DeleteUserById(id);
    }
}
