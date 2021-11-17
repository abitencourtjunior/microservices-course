package br.com.microservices.store.model;

public class Purchase {

    private Long id;
    private Integer preparationTime;
    private String addressPurchase;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(Integer preparationTime) {
        this.preparationTime = preparationTime;
    }

    public String getAddressPurchase() {
        return addressPurchase;
    }

    public void setAddressPurchase(String addressPurchase) {
        this.addressPurchase = addressPurchase;
    }

}
