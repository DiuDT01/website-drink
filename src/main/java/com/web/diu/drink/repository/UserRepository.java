package com.web.diu.drink.repository;

import com.web.diu.drink.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsernameAndPassword(String name, String pass);
}
