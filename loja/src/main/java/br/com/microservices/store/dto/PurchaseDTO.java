package br.com.microservices.store.dto;

import java.util.List;

public class PurchaseDTO {

    private List<ItenmsPurchaseDTO> itemsPurchase;
    private AddressDTO address;

    public List<ItenmsPurchaseDTO> getItemsPurchase() {
        return itemsPurchase;
    }

    public void setItemsPurchase(List<ItenmsPurchaseDTO> itemsPurchase) {
        this.itemsPurchase = itemsPurchase;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO addressDTO) {
        this.address = addressDTO;
    }

    @Override
    public String toString() {
        return "PurchaseDTO [itemsPurchase=" + itemsPurchase + ", address=" + address + "]";
    }

}
