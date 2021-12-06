package com.project.netflix.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "member")
public class Pay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pay_id")
    private Long id;

    @Column(length = 16, nullable = false)
    private String cardNumber;

    private String description;

    private LocalDateTime subscribeDate;

    private LocalDateTime paymentDate;

    @Column(columnDefinition = "int default 0")
    private int price;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

}
