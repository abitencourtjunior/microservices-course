package br.com.microservices.store.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservices.store.client.ProviderClient;
import br.com.microservices.store.dto.InfoProviderDTO;
import br.com.microservices.store.dto.InfoPurchaseDTO;
import br.com.microservices.store.dto.PurchaseDTO;
import br.com.microservices.store.model.Purchase;

@Service
public class PurchaseService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PurchaseService.class);

    @Autowired
    private ProviderClient client;

    public Purchase createPurchase(PurchaseDTO purchaseDTO) {
        InfoProviderDTO infoByState = client.getInfoByState(purchaseDTO.getAddress().getState());
        InfoPurchaseDTO infoPurchaseDTO = client.createPurchase(purchaseDTO.getItemsPurchase());
        LOGGER.info("Data received [PROVIDER]: " + infoByState.getAddress());
        LOGGER.info("Data received [PURCHASE]: " + infoPurchaseDTO.toString());
        Purchase purchase = new Purchase();
        purchase.setId(infoPurchaseDTO.getId());
        purchase.setPreparationTime(infoPurchaseDTO.getPreparationTime());
        purchase.setAddressPurchase(purchaseDTO.getAddress().toString());
        return purchase;
    }

}
