package com.ahmedtaoufiq.invoice.repositories;

import com.ahmedtaoufiq.invoice.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findClientByCompanyName(String name);
}
