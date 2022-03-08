package com.kodem.Linkedin.service;
import com.kodem.Linkedin.model.users;
import com.kodem.Linkedin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileService {
    @Autowired
    private UserRepository userRepository;

    public Optional<users> findProfile(int id) {
        return userRepository.findById(id);
    }
    public users saveUser(users user){
        return userRepository.save(user);
    }
    public users checkCredentials(String username, String password) {
        return userRepository.findByUsernameAndPassword(username,password);
    }
    public void deleteUser(users user){
        userRepository.delete(user);
    }
    public users updateUser(users user){
        return userRepository.save(user);
    }
}
