package com.klayprojects.loja.service;

import com.klayprojects.loja.model.Product;
import com.klayprojects.loja.repository.MarketplaceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MarketplaceService {

    private final MarketplaceRepository repository;

    public MarketplaceService(MarketplaceRepository repository) {
        this.repository = repository;
    }
    //LISTAR PRODUTOS
    public List<Product> getAll(){
        return repository.findAll();
    }
    //CRIAR PRODUTOS

}
