package com.Innovationship.LoginSignUpHRCloud.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Innovationship.LoginSignUpHRCloud.Model.UserDetail;
import com.Innovationship.LoginSignUpHRCloud.Repository.UserDetailRepo;

@Service
public class UserServices {
     
    @Autowired UserDetailRepo _userRepo;
    public String login(String username, String pwd){
        var userFound = _userRepo.findByEmailAndPassword(username, pwd);
        if(userFound==null) return "login failed";
        if(userFound.getEmail().equalsIgnoreCase(username) && userFound.getPassword().equals(pwd)){
            return "Login Success";
        }
        return "Login Faild";
    }
    public UserDetail save(UserDetail user){
        return _userRepo.save(user);
    }
    public List<UserDetail> getAllUser(){
        return _userRepo.findAll();
    }

}
