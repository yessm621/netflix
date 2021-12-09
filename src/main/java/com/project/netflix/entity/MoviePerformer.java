package com.project.netflix.entity;

import com.project.netflix.entity.performer.Performer;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@ToString(exclude = {"performer", "movie"})
public class MoviePerformer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_performer_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "performer_id")
    private Performer performer;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

}
