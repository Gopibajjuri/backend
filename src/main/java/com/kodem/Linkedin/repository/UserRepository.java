package com.kodem.Linkedin.repository;

import com.kodem.Linkedin.model.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<users,Integer> {
    users findByUsernameAndPassword(String username, String password);
    users findByUsername(String username);

}
