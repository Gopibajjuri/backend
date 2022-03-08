package com.kodem.Linkedin.repository;
import com.kodem.Linkedin.model.Education;
import com.kodem.Linkedin.model.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EducationRepository extends JpaRepository<Education, Integer> {
    Education[] findAllByUser(users user);
}
