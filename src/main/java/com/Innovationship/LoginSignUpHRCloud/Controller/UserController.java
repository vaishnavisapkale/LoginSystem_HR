package com.Innovationship.LoginSignUpHRCloud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Innovationship.LoginSignUpHRCloud.Model.UserDetail;
import com.Innovationship.LoginSignUpHRCloud.Services.UserServices;

@RestController("/")
@CrossOrigin("*")
public class UserController {
    
    @Autowired UserServices _userService;

    @PostMapping("/login")
    public String login(@RequestBody UserDetail user){
        return _userService.login(user.getEmail(), user.getPassword());
    }

    @GetMapping("")
    public String check(){
        return "Welcome to auth system";
    }
    @GetMapping("/allusers")
    public List<UserDetail> getAllUser(){
        return _userService.getAllUser();
    }
    @PostMapping("/save")
    public UserDetail signUp(@RequestBody UserDetail user){
        return _userService.save(user);
    }
}
