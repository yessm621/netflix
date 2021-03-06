package com.project.netflix.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Builder
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plan_id")
    private Long id;

    private String description;

    @Column(columnDefinition = "int default 0")
    private int price;

    @Column(columnDefinition = "int default 1")
    private int ccu; // 동시 접속자 수

}
