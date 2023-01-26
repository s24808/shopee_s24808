package com.example.shopee_24808;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientStorage {
    private final List<Client> clientsList = new ArrayList<Client>();

    public void addClient(Client client) {
        this.clientsList.add(client);
    }

    public List<Client> getClientsList() {
        return clientsList;
    }

    public Client getClientByID(String ID) {
        for (Client client : clientsList) {
            if (client.getID() == ID) {
                return client;
            }
        }

        return null;
    }
}

