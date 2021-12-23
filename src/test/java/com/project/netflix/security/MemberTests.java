package com.project.netflix.security;

import com.project.netflix.entity.Member;
import com.project.netflix.entity.MemberRole;
import com.project.netflix.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.stream.IntStream;

@SpringBootTest
public class MemberTests {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void insertDummies() {
        IntStream.rangeClosed(1, 100).forEach(i -> {
            Member member = Member.builder()
                    .email("user" + i + "@gmail.com")
                    .name("user" + i)
                    .fromSocial(false)
                    .password(passwordEncoder.encode("1111"))
                    .build();

            member.addMemberRole(MemberRole.USER);
            if (i > 80) {
                member.addMemberRole(MemberRole.MANAGER);
            }
            if (i > 90) {
                member.addMemberRole(MemberRole.ADMIN);
            }
            memberRepository.save(member);
        });
    }
}
