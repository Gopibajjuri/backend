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
    ProfileService profileService;

    @PostMapping("/profile/find")
    public users findProfile(@RequestBody UserProfile u) {
        int i=u.user_id;
        Optional<users> user=profileService.findProfile(i);
        return user.get();
    }
    @PostMapping("/profile/send")
    public users saveUser(@RequestBody users user){
        return profileService.saveUser(user);
    }

    @PostMapping("/profile/delete")
    public void deleteUser(@RequestBody users user){
        profileService.deleteUser(user);
    }

    @PostMapping("/profile/update")
    public users updateUser(@RequestBody users user){
        System.out.println(user);
        return profileService.updateUser(user);
    }


}
