package com.example.demo.controller;

import com.example.demo.model.UserDetails;
import com.example.demo.service.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userdetails")
public class UserDetailsController {

    UserDetailsService uds;

    public UserDetailsController(UserDetailsService uds) {
        this.uds = uds;
    }

    // read specific user
    @GetMapping("{userId}")
    public UserDetails getUserDetails(@PathVariable("userId") String userId){
        return uds.getUser(userId);
    }

    //read all users
    @GetMapping()
    public List<UserDetails> getAllUserDetails(){
        return uds.getAllUsers();
    }
    @PostMapping
    public String createUserDetails(@RequestBody UserDetails ud){
        uds.createUser(ud);
        return "User created";

    }
    @PutMapping
    public String updateUserDetails(@RequestBody UserDetails ud){
        uds.updateUser(ud);
        return "User Details updated";
    }
    @DeleteMapping("{userId}")
    public String deleteUserDetails(@PathVariable("userId") String userId){
        uds.deleteUser(userId);
        return "user deleted";
    }

    @DeleteMapping()
    public String deleteAllUsers(){
        uds.deleteAll();
        return "all user deleted";
    }
}
