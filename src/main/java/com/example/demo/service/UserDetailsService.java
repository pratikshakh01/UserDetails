package com.example.demo.service;

import com.example.demo.model.UserDetails;

import java.util.List;

public interface UserDetailsService {
    public String createUser(UserDetails user);
    public String updateUser(UserDetails user);
    public String deleteUser(String userId);
    public String deleteAll();

    public UserDetails getUser(String userId);
    public List<UserDetails> getAllUsers();
}
