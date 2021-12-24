package com.project.netflix.repository;

import com.project.netflix.entity.Member;
import com.project.netflix.entity.Profile;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class ProfileRepositoryTests {

    @Autowired
    ProfileRepository profileRepository;

    /*@Test
    public void createProfile() {
        IntStream.rangeClosed(1, 400).forEach(i -> {
            Long memberId = (long) (Math.random() * 100) + 1;

            Member member = Member.builder().id(memberId).build();

            Profile profile = Profile.builder()
                    .name("별명" + i)
                    .member(member)
                    .build();

            profileRepository.save(profile);
        });
    }*/
}
