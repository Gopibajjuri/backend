package com.kodem.Linkedin.service;

import com.kodem.Linkedin.model.Skill;
import com.kodem.Linkedin.model.users;
import com.kodem.Linkedin.repository.SkillRepository;
import com.kodem.Linkedin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    SkillRepository skillRepository;

    public Skill[] findSkills(String username){
        users user=userRepository.findByUsername(username);
        System.out.println(user);
        return skillRepository.findAllByUser(user);
    }
    public Skill saveSkills(Skill skills){
        return skillRepository.save(skills);
    }
    public void deleteSkills(Skill skill){
        skillRepository.delete(skill);
    }
}
