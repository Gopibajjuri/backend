package com.kodem.Linkedin.Controller;
import com.kodem.Linkedin.model.UserProfile;
import com.kodem.Linkedin.model.users;
import com.kodem.Linkedin.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProfileController {
    @Autowired
    ProfileService profileService;

    @GetMapping("/profile/find")
    public users findProfile(@RequestBody UserProfile userProfile) {
        Optional<users> user=profileService.findProfile(userProfile.user_id);
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
        return profileService.updateUser(user);
    }


}
