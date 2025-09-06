package com.klayprojects.loja.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.nio.MappedByteBuffer;
import java.util.List;

@Entity
@Table(name = "Enterprise")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private String email;

    private String password;

    // Uma empresa pode ter mais de um produto
    @OneToMany(mappedBy = "Product")
    private List<Product> products;




}
