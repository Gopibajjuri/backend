package com.kodem.Linkedin.service;

import com.kodem.Linkedin.model.Education;
import com.kodem.Linkedin.model.Experience;
import com.kodem.Linkedin.model.users;
import com.kodem.Linkedin.repository.EducationRepository;
import com.kodem.Linkedin.repository.ExperienceRepository;
import com.kodem.Linkedin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExperienceService {
    @Autowired
    ExperienceRepository experienceRepository;
    @Autowired
    UserRepository userRepository;

    public Experience[] findExperiences(String username){
        users user=userRepository.findByUsername(username);
        return experienceRepository.findAllByUser(user);
    }
    public Experience saveExperience(Experience experience){
        return experienceRepository.save(experience);
    }
    public void deleteExperience(Experience experience){
        experienceRepository.delete(experience);
    }
    public Experience updateExperience(Experience experience) {
        return experienceRepository.save(experience);
    }
}