package com.kodem.Linkedin.Controller;
import com.kodem.Linkedin.model.Skill;
import com.kodem.Linkedin.model.users;
import com.kodem.Linkedin.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillController {
    @Autowired
    SkillService skillService;

    @PostMapping("/skill/fetch")
    public Skill[] findSkills(@RequestBody users user){
        return skillService.findSkills(user.getUsername());
    }

    @PostMapping("skill/send")
    public Skill saveSkills(@RequestBody Skill skill){
        return skillService.saveSkills(skill);
    }

    @PostMapping("skill/delete")
    public void deleteExperience(@RequestBody Skill skill){
        skillService.deleteSkills(skill);
    }

}


