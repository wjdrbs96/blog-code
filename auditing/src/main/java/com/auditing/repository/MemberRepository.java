package com.auditing.repository;

import com.auditing.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * created by Gyunny 2021/11/08
 */
public interface MemberRepository extends JpaRepository<Member, Long> {
}
