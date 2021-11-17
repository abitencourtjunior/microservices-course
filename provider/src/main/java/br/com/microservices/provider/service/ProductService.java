package br.com.microservices.provider.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservices.provider.model.Product;
import br.com.microservices.provider.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository produtoRepository;

    public List<Product> getProductsByState(String state) {
        return produtoRepository.findByState(state);
    }

}
