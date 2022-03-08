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
    public Experience[] findExperiences(@RequestBody users user){
        return experienceService.findExperiences(user.getUsername());
    }
    @PostMapping("/experience/send")
    public Experience saveExperience(@RequestBody Experience experience){
        return experienceService.saveExperience(experience);
    }
    @PostMapping("/experience/delete")
    public void deleteExperience(@RequestBody Experience experience){
        experienceService.deleteExperience(experience);
    }

    @PostMapping("/experience/update")
    public Experience updateExperience(@RequestBody Experience experience){
        return experienceService.updateExperience(experience);
    }
}

