package com.peigo.account.repository;

import com.peigo.account.model.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTypeRepository extends JpaRepository<UserType, String> {
}
