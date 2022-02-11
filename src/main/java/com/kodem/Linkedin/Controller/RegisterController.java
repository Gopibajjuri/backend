package com.kodem.Linkedin.Controller;

import com.kodem.Linkedin.model.users;
import com.kodem.Linkedin.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    @Autowired
    ProfileService ps;

    @PostMapping("/register")
    public users addUser(@RequestBody users u) {
        return ps.saveUser(u);
    }


}
