package com.kodem.Linkedin.repository;

import com.kodem.Linkedin.model.Experience;
import com.kodem.Linkedin.model.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Integer> {
    Experience[] findAllByUser(users user);
}
