package com.klayprojects.loja.controller;
import com.klayprojects.loja.model.Product;
import com.klayprojects.loja.service.MarketplaceService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class Controller {
    @Value("${spring.application.name}")
    private String app_name;
    private final MarketplaceService service;


    public Controller(MarketplaceService service) {
        this.service = service;
    }

    @GetMapping("/products")
    public List<Product> getall() {
        return service.getAll();
    }
}
