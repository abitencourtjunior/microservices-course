package br.com.microservices.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservices.provider.model.Info;
import br.com.microservices.provider.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    @GetMapping("/{state}")
    public Info getByState(@PathVariable String state) {
        return infoService.getByState(state);
    }
}
