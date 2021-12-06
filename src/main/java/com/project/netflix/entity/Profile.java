package com.project.netflix.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "member")
public class Profile extends baseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profile_id")
    private Long id;

    @Column(length = 50, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

}
