package com.example.springboot.restapi.controller;

import com.example.springboot.restapi.dto.UserDataTransferObject;
import com.example.springboot.restapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;
import java.util.List;

@RestController
@RequestMapping(value = "req/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/getUsers")
    public List<UserDataTransferObject> getUser(){
        return userService.getAllUsers();
    }
    @PostMapping(value = "/addUser")
    public UserDataTransferObject insertUser(@RequestBody UserDataTransferObject userDataTransferObject){
       return userService.SaveUser(userDataTransferObject);
    }

    @PutMapping(value = "/updateUser")
    public String updateUser(){
        return  "User Updated Successfully";
    }

    @DeleteMapping(value = "/deleteUser")
    public String deleteUser(){
        return "User Deleted Successfully";
    }

}
