package br.com.microservices.provider.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PURCHASE")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer preparationTime;

    @Enumerated(EnumType.STRING)
    private RequestStatus status;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "purchaseId")
    private List<RequestItem> itens;

    public Purchase(List<RequestItem> itens) {
        this.itens = itens;
        this.status = RequestStatus.RECEIVED;
    }

    public Purchase() {
    }

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

    public RequestStatus getStatus() {
        return status;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }

    public List<RequestItem> getItens() {
        return itens;
    }

    public void setItens(List<RequestItem> itens) {
        this.itens = itens;
    }

}
