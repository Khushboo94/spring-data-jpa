package com.spring.datajpa.springdatajpa.controller;

import com.spring.datajpa.springdatajpa.hibernate.jpa.Client;
import com.spring.datajpa.springdatajpa.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/client/app")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/client-data/{client-id}")
    public ResponseEntity<Client> getClientData(@PathVariable("client-id") Long clientId) {
        Optional<Client> result = clientService.getClient(clientId);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
