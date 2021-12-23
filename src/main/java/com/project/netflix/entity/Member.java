package com.project.netflix.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@ToString
public class Member extends baseEntity {

    @Id
    private String email;

    @Column(length = 255, nullable = false)
    private String password;

    @Column(length = 25, nullable = false)
    private String name;

    @Column(length = 11)
    private String phone;

//    @Column(length = 16, nullable = false)
//    private String cardNumber;

    private Boolean fromSocial;

    @ElementCollection(fetch = FetchType.LAZY)
    @Builder.Default
    private Set<MemberRole> roleSet = new HashSet<>();

    public void addMemberRole(MemberRole memberRole) {
        roleSet.add(memberRole);
    }

}
