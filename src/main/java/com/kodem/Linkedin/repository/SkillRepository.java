package com.kodem.Linkedin.repository;

import com.kodem.Linkedin.model.Skill;
import com.kodem.Linkedin.model.users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill,Integer> {

   Skill[] findAllByUser(users user);
}
