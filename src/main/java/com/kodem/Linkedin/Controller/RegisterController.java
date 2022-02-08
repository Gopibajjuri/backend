package com.kodem.Linkedin.Controller;

import com.kodem.Linkedin.model.Profile;
import com.kodem.Linkedin.model.UserProfile;
import com.kodem.Linkedin.model.users;
import com.kodem.Linkedin.service.LoginService;
import com.kodem.Linkedin.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    @Autowired
    RegisterService registerService;

    @PostMapping("/register")
    public Profile addUser(@RequestBody Profile p) {

        return registerService.addUserDetails(p);
    }


}
