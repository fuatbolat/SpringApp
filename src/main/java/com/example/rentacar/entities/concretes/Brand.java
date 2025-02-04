package com.example.rentacar.entities.concretes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="brands")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brand {
    //veritabanı içerisinde karşılık ismi
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name ="name")
    private String name;


}
