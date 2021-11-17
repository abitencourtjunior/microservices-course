package br.com.microservices.provider.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.microservices.provider.model.Info;

public interface InfoRepository extends PagingAndSortingRepository<Info, Long> {

    Info findByState(String state);

}
