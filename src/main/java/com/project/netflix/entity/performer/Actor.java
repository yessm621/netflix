package com.project.netflix.entity.performer;

import lombok.Getter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
@Getter
public class Actor extends Performer {

    private String name;

}
