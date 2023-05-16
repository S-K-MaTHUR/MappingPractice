package com.geekster.MappingPractice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String addressId;
    private String landmark;
    private String zipcode;
    private String district;
    private String state;
    private String country;
}
