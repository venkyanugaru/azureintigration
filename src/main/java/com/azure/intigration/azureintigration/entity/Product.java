package com.azure.intigration.azureintigration.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Table(name="PRODUCTS")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pid;

    private String name;

    private String description;

    private boolean active;

    private String imageUrl;

    @CreationTimestamp
    private LocalDateTime createionDate;

    @UpdateTimestamp
    private LocalDateTime dateUpdated;

}
