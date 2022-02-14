package com.kodem.Linkedin.service;

import com.kodem.Linkedin.model.users;
import com.kodem.Linkedin.repository.UserRepository;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileService {
    @Autowired
    private UserRepository ur;

    public Optional<users> findProfile(int id) {
        return ur.findById(id);
    }
    public users saveUser(users user){
        return ur.save(user);
    }
    public users checkCredentials(String username, String password) {
        return ur.findByUsernameAndPassword(username,password);
    }
    public void deleteUser(users user){
        ur.delete(user);
    }
    public users updateUser(users user){
        return ur.save(user);
    }
}
