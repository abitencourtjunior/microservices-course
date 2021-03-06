package br.com.microservices.store.dto;

public class InfoPurchaseDTO {

    private Long id;
    private Integer preparationTime;

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

    @Override
    public String toString() {
        return "InfoPurchaseDTO [id=" + id + ", preparationTime=" + preparationTime + "]";
    }

}
