package com.project.netflix.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@ToString(exclude = "movie")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rating_id")
    private Long id;

    @Column(columnDefinition = "int default 1")
    private int ordering;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime rDate;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

}
