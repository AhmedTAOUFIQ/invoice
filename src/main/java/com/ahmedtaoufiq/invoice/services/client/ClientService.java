package com.ahmedtaoufiq.invoice.services.client;

import com.ahmedtaoufiq.invoice.entities.Client;
import com.ahmedtaoufiq.invoice.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ClientService implements ClientServiceInterface {

    private final ClientRepository clientRepository;
    @Override
    public Client create(Client client) {
        return clientRepository.save(client);
    }
    @Override
    public Client getClientById(long id) {
        return clientRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Cannot find client with Id :" + id));
    }
    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public List<Client> getAllClientsByCompanyName(String name) {
        return null;
    }
}
