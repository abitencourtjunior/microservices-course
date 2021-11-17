package br.com.microservices.provider.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.microservices.provider.model.Purchase;

public interface PurchaseRepository extends CrudRepository<Purchase, Long> {

}
