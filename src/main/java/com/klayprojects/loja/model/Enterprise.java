package com.klayprojects.loja.model;

import jakarta.persistence.*;

import java.nio.MappedByteBuffer;
import java.util.List;

@Entity
@Table(name = "Enterprise")
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private String email;

    private String password;

    // Uma empresa pode ter mais de um produto
    @OneToMany(mappedBy = "Products")
    private List<Product> products;

    public Enterprise() {}

    public Enterprise(Long id, String name, String email, String password) {
       this.id = id;
       this.name = name;
       this.email = email;
       this.password = password;
    }






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
