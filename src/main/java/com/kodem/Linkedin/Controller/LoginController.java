package com.kodem.Linkedin.Controller;

import com.kodem.Linkedin.model.users;
import com.kodem.Linkedin.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired
    ProfileService ps;

    @PostMapping("/check")
    public users checkDetails(@RequestBody users user){
        users u=ps.checkCredentials(user.getUsername(), user.getPassword());
        return u;
    }

}
