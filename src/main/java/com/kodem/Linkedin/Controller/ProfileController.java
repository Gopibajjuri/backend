package com.kodem.Linkedin.Controller;

import com.kodem.Linkedin.model.UserProfile;
import com.kodem.Linkedin.model.users;
import com.kodem.Linkedin.service.ProfileService;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProfileController {
    @Autowired
    ProfileService ps;

    @PostMapping("/profileDetails")
    public users find(@RequestBody UserProfile u) {
        int i=u.user_id;
        Optional<users> user=ps.findProfile(i);
        return user.get();



    }


}
