package com.auditing.repository;

import com.auditing.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * created by Gyunny 2021/11/08
 */
@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    void JPA_Auditing_Test() {
        LocalDateTime now = LocalDateTime.of(2021, 11, 8, 0, 0, 0);
        Member member = memberRepository.save(Member.builder()
                .name("Gyunny")
                .part("Backend")
                .build());

        assertThat(member.getCreatedTime()).isAfter(now);
        assertThat(member.getLastModifiedTime()).isAfter(now);
    }
}