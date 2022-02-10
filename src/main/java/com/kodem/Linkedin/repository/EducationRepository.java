package com.kodem.Linkedin.repository;

import com.kodem.Linkedin.model.Education;
import com.kodem.Linkedin.model.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.Set;

@Repository
public interface EducationRepository extends JpaRepository<Education, Integer> {
    Education[] findAllByUser(users user);
}
