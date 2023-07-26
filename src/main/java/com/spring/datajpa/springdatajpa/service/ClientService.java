package com.spring.datajpa.springdatajpa.service;

import com.spring.datajpa.springdatajpa.hibernate.jpa.Client;
import com.spring.datajpa.springdatajpa.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public Optional<Client> getClient(Long clientId) {
        return clientRepository.findById(clientId);
    }
}
