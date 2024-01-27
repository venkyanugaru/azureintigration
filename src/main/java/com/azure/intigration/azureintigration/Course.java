package com.azure.intigration.azureintigration;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table
@AllArgsConstructor
public class Course {
    
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String description;

}
