package com.project.netflix.entity.performer;

import lombok.Getter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("D")
@Getter
public class Director extends Performer {

    private String name;

}
