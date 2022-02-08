package com.kodem.Linkedin.Controller;

import com.kodem.Linkedin.model.users;
import com.kodem.Linkedin.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired
    LoginService loginService;

    @PostMapping("/create")
    public users create(@RequestBody users user){
        return loginService.createUser(user);
    }



    @PostMapping("/welcome")
  
    public users checkDetails(@RequestBody users user){
        users u=loginService.checkCredentials(user.getUsername(), user.getPassword());
        return u;
    }

}
