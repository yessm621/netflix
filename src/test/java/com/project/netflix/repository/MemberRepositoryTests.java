package com.project.netflix.repository;

import com.project.netflix.entity.Member;
import com.project.netflix.entity.Plan;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class MemberRepositoryTests {

    @Autowired
    MemberRepository memberRepository;

    @Test
    @DisplayName("회원생성")
    public void createMember() {

        IntStream.rangeClosed(1, 100).forEach(i -> {

            Long planId = (long) (Math.random() * 3) + 1;
            Plan plan = Plan.builder().id(planId).build();

            Member member = Member.builder()
                    .email("user" + i + "@gmail.com")
                    .name("이름" + i)
                    .phone("0101234" + i)
//                    .cardNumber("123412341234"+i)
                    .password("qwer1234")
//                    .plan(plan)
                    .build();

            memberRepository.save(member);
        });

    }
}
