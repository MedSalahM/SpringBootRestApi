package com.mms.wt.wt.repositories;

import com.mms.wt.wt.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositorie extends JpaRepository<User,Integer> {

    Optional<User>  findByUsername(String username);
}
