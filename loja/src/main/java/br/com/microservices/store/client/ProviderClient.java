package br.com.microservices.store.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.microservices.store.dto.InfoProviderDTO;
import br.com.microservices.store.dto.InfoPurchaseDTO;
import br.com.microservices.store.dto.ItenmsPurchaseDTO;

@FeignClient("provider")
public interface ProviderClient {

    @GetMapping("/info/{state}")
    InfoProviderDTO getInfoByState(@PathVariable String state);

    @PostMapping("/purchase")
    InfoPurchaseDTO createPurchase(List<ItenmsPurchaseDTO> itemsPurchase);

}
