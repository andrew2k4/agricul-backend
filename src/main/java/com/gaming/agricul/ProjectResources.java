package com.gaming.agricul;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectResources {

    private double budget;
    private double landSize;
    private boolean existingStructures;
    private String notes;
}
