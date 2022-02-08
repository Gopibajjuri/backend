package com.kodem.Linkedin.Controller;

import com.kodem.Linkedin.model.Profile;
import com.kodem.Linkedin.model.UserProfile;
import com.kodem.Linkedin.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProfileController {
    @Autowired
    ProfileService ps;

    @PostMapping("/profileDetails")
    public Profile findProfile(@RequestBody UserProfile u) {
        int i=u.user_id;
        Profile p=ps.findprofile(i);
        return p;
    }


}
