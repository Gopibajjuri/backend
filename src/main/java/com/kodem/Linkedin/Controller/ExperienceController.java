package com.kodem.Linkedin.Controller;

import com.kodem.Linkedin.model.Experience;
import com.kodem.Linkedin.model.users;
import com.kodem.Linkedin.service.EducationService;
import com.kodem.Linkedin.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienceController {
    @Autowired
    ExperienceService experienceService;

    @PostMapping("/experience/fetch")
    public Experience[] findExperience(@RequestBody users user){
        return experienceService.findExperience(user.getUsername());
    }

    @PostMapping("experience/send")
    public Experience saveExperience(@RequestBody Experience experience){
        return experienceService.saveEducation(experience);
    }

    @PostMapping("experience/delete")
    public void deleteExperience(@RequestBody Experience education){
        experienceService.deleteEducation(education);
    }

}

