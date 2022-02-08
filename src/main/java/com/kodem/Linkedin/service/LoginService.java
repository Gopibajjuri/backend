package com.kodem.Linkedin.service;

import com.kodem.Linkedin.model.users;
import com.kodem.Linkedin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class LoginService {
    @Autowired
    private UserRepository ur;

    public users createUser(users user){
        return ur.save(user);
    }


    public users checkCredentials(String username, String password) {
        return ur.findByUsernameAndPassword(username,password);

    }
}
