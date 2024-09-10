package com.project.cxsupershy.repository;

import com.project.cxsupershy.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, String> {
}
