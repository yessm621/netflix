package com.project.netflix.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@ToString(exclude = "plan")
public class Member extends baseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 255, nullable = false)
    private String password;

    @Column(length = 25, nullable = false)
    private String name;

    @Column(length = 11)
    private String phone;

    @Column(length = 16, nullable = false)
    private String cardNumber;

    @ManyToOne
    @JoinColumn(name = "plan_id")
    private Plan plan;

}
