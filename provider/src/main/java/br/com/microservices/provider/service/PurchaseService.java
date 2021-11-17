package br.com.microservices.provider.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservices.provider.dto.ItemOfPurchaseDTO;
import br.com.microservices.provider.model.Product;
import br.com.microservices.provider.model.Purchase;
import br.com.microservices.provider.model.RequestItem;
import br.com.microservices.provider.repository.ProductRepository;
import br.com.microservices.provider.repository.PurchaseRepository;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Autowired
    private ProductRepository productRepository;

    public Purchase realizaPedido(List<ItemOfPurchaseDTO> itens) {

        if (itens == null) {
            return null;
        }

        List<RequestItem> pedidoItens = toPedidoItem(itens);
        Purchase purchase = new Purchase(pedidoItens);
        purchase.setPreparationTime(itens.size());
        return purchaseRepository.save(purchase);
    }

    public Purchase getPurchaseById(Long id) {
        return this.purchaseRepository.findById(id).orElse(new Purchase());
    }

    private List<RequestItem> toPedidoItem(List<ItemOfPurchaseDTO> itens) {

        List<Long> idsProdutos = itens
                .stream()
                .map(item -> item.getId())
                .collect(Collectors.toList());

        List<Product> productOfPurchase = productRepository.findByIdIn(idsProdutos);

        List<RequestItem> pedidoItens = itens
                .stream()
                .map(item -> {
                    Product product = productOfPurchase
                            .stream()
                            .filter(p -> p.getId() == item.getId())
                            .findFirst().get();

                    RequestItem requestItem = new RequestItem();
                    requestItem.setProduct(product);
                    requestItem.setQuantity(item.getQuantity());
                    return requestItem;
                })
                .collect(Collectors.toList());
        return pedidoItens;
    }
}
