package br.com.microservices.store.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservices.store.dto.PurchaseDTO;
import br.com.microservices.store.model.Purchase;
import br.com.microservices.store.service.PurchaseService;

@RestController
@RequestMapping("/v1/purchase")
public class StoreController {

    private static final Logger LOGGER = LoggerFactory.getLogger(StoreController.class);

    @Autowired
    private PurchaseService service;

    @PostMapping
    public Purchase createPurchase(@RequestBody PurchaseDTO purchaseDTO) {
        LOGGER.info(purchaseDTO.toString());
        return service.createPurchase(purchaseDTO);
    }

}
