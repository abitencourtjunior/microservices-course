package br.com.microservices.provider.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.microservices.provider.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByState(String state);

    List<Product> findByIdIn(List<Long> ids);
}
