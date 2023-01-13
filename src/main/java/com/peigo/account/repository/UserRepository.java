package com.peigo.account.repository;

import com.peigo.account.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

    User findOneByName(String name);
}
