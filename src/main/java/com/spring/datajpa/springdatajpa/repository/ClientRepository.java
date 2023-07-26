package com.spring.datajpa.springdatajpa.repository;

import com.spring.datajpa.springdatajpa.hibernate.jpa.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
