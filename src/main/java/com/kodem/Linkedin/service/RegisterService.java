package com.kodem.Linkedin.service;

import com.kodem.Linkedin.model.Profile;
import com.kodem.Linkedin.model.UserProfile;
import com.kodem.Linkedin.model.users;
import com.kodem.Linkedin.repository.ProfileRepository;
import com.kodem.Linkedin.repository.UserRepository;
import org.jboss.logging.BasicLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class RegisterService {
    @Autowired
    ProfileRepository pr;

    public Profile addUserDetails(Profile p){
        Profile profile = pr.save(p);
        return profile;
    }

}
