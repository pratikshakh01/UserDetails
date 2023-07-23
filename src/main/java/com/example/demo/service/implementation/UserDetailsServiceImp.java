package com.example.demo.service.implementation;

import com.example.demo.model.UserDetails;
import com.example.demo.repository.UserDetailsRepository;
import com.example.demo.service.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsServiceImp implements UserDetailsService {

    UserDetailsRepository repo;
    public UserDetailsServiceImp(UserDetailsRepository repo) {
        this.repo = repo;
    }

    @Override
    public String createUser(UserDetails user) {
        repo.save(user);
        return "Successfully created";
    }

    @Override
    public String updateUser(UserDetails user) {
        repo.save(user);
        return "Successfully updated";
    }

    @Override
    public String deleteUser(String userId) {
        repo.deleteById(userId);
        return "data deleted";
    }

    @Override
    public String deleteAll() {
        repo.deleteAll();
        return "Deleted all the users";
    }

    @Override
    public UserDetails getUser(String userId) {
      return repo.findById(userId).get();
    }

    @Override
    public List<UserDetails> getAllUsers() {
        return repo.findAll();
    }
}
