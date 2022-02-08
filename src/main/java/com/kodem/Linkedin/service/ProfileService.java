package com.kodem.Linkedin.service;

import com.kodem.Linkedin.model.Profile;
import com.kodem.Linkedin.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileService {
    @Autowired
    ProfileRepository pr;

    public Profile findprofile(int user_id) {
        return pr.findById(user_id);
    }

}
