package com.klayprojects.loja.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Products")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double price;
    private long quantity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Enterprises_id")
    private Enterprise enterprise;


}
