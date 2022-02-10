package com.kodem.Linkedin.service;

import com.kodem.Linkedin.model.Education;
import com.kodem.Linkedin.model.users;
import com.kodem.Linkedin.repository.EducationRepository;
import com.kodem.Linkedin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class EducationService {
    @Autowired
    EducationRepository educationRepository;
    @Autowired
    UserRepository userRepository;
    
    public Education[] findEducations(String username){
        users user=userRepository.findByUsername(username);
        System.out.println(user);
        return educationRepository.findAllByUser(user);
    }
    public Education saveEducation(Education education){
        return educationRepository.save(education);
    }
    public void deleteEducation(Education education){
        educationRepository.delete(education);
    }
}
