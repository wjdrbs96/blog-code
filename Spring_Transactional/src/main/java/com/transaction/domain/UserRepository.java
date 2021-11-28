package com.transaction.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * created by Gyunny 2021/11/26
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
