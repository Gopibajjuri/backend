package com.kodem.Linkedin.repository;

import com.kodem.Linkedin.model.Profile;
import com.kodem.Linkedin.model.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ProfileRepository extends JpaRepository<Profile,Integer> {
    Profile findById(int user_id);
}
