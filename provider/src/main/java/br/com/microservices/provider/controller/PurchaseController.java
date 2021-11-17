package br.com.microservices.provider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservices.provider.dto.ItemOfPurchaseDTO;
import br.com.microservices.provider.model.Purchase;
import br.com.microservices.provider.service.PurchaseService;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping
    public Purchase realizaPedido(@RequestBody List<ItemOfPurchaseDTO> products) {
        return purchaseService.realizaPedido(products);
    }

    @GetMapping("/{id}")
    public Purchase getPedidoPorId(@PathVariable Long id) {
        return purchaseService.getPurchaseById(id);
    }
}
