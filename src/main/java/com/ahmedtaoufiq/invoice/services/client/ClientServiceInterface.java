package com.ahmedtaoufiq.invoice.services.client;

import com.ahmedtaoufiq.invoice.entities.Client;

import java.util.List;

public interface ClientServiceInterface {
    Client create(Client client);
    Client getClientById(long id);
    List<Client> getAllClients();
    List<Client> getAllClientsByCompanyName(String name);
}
