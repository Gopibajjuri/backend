package com.kodem.Linkedin.Controller;

import com.kodem.Linkedin.model.Education;
import com.kodem.Linkedin.model.UserProfile;
import com.kodem.Linkedin.model.users;
import com.kodem.Linkedin.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.Set;

@RestController
public class EducationController {
    @Autowired
    EducationService educationService;

    @PostMapping("/education/fetch")
    public Education[] findEducations(@RequestBody users user){
        return educationService.findEducations(user.getUsername());
    }

    @PostMapping("education/send")
    public Education saveEducation(@RequestBody Education education){
        return educationService.saveEducation(education);
    }

    @PostMapping("education/delete")
    public void deleteEducation(@RequestBody Education education){
        educationService.deleteEducation(education);
    }

}
