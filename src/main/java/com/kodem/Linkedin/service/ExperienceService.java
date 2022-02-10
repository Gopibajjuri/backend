package com.kodem.Linkedin.service;

import com.kodem.Linkedin.model.Education;
import com.kodem.Linkedin.model.Experience;
import com.kodem.Linkedin.model.users;
import com.kodem.Linkedin.repository.EducationRepository;
import com.kodem.Linkedin.repository.ExperienceRepository;
import com.kodem.Linkedin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService {
    @Autowired
    ExperienceRepository experienceRepository;
    @Autowired
    UserRepository userRepository;

    public Experience[] findExperience(String username){
        users user=userRepository.findByUsername(username);
        System.out.println(user);
        return experienceRepository.findAllByUser(user);
    }
    public Experience saveEducation(Experience experience){
        return experienceRepository.save(experience);
    }
    public void deleteEducation(Experience experience){
        experienceRepository.delete(experience);
    }
}