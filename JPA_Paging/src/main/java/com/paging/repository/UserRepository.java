package com.paging.repository;

import com.paging.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * created by Gyunny 2021/11/07
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
