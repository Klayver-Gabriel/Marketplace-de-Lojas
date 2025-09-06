package model;

import com.klayprojects.loja.model.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Entity
@Table(name = "Emterprise")
@AllArgsConstructor
@NoArgsConstructor
public class Enterprise {
    ArrayList<Product> products;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;


}
