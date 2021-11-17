package br.com.microservices.provider.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservices.provider.model.Info;
import br.com.microservices.provider.repository.InfoRepository;

@Service
public class InfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(InfoService.class);

    @Autowired
    private InfoRepository infoRepository;

    public Info getByState(String state) {
        Info info = infoRepository.findByState(state);
        LOGGER.info(info.toString());
        return info;
    }

}
