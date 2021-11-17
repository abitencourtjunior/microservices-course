package br.com.microservices.provider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservices.provider.model.Product;
import br.com.microservices.provider.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProdutoController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{state}")
    public List<Product> getProductsByState(@PathVariable("state") String state) {
        return productService.getProductsByState(state);
    }
}
