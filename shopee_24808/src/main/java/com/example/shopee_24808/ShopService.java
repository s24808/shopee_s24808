package com.example.shopee_24808;

import org.springframework.stereotype.Component;

@Component
public class ShopService {

    private final ShopStorage shopStorage;

    private final ClientStorage clientStorage;

    public ShopService(ShopStorage shopStorage, ClientStorage clientStorage) {
        this.shopStorage = shopStorage;
        this.clientStorage = clientStorage;
    }

    public void registerCart(String item_name) {
        this.shopStorage.addCart(new Cart(item_name));
    }

    public void registerClient(String ID, double balance) {
        this.clientStorage.addClient(new Client(ID, balance));
    }

    public Cart buyItem(String clientID, String item_name, double value) {
        Client client = clientStorage.getClientByID(clientID);
        Cart cart = shopStorage.getItemByName(item_name);

        if (client.getBalance() < value) {
            System.out.println("Transaction declined");
            return new Cart(new Client(clientID, client.getBalance(),  cart.getItem_name(), cart.getPrice()));
        }

        if (client.getBalance() > value) {
            System.out.println("Transaction accpeted");
            client.setBalance(client.getBalance() - value);
            return new Cart(new Client(clientID, client.getBalance()), cart.getPrice(), cart.getItem_name());
        }
        return cart;
    }

    public Cart findCart(String item_name) {
        return shopStorage.getItemByName(item_name);
    }
}