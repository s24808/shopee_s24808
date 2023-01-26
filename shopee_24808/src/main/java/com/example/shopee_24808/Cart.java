package com.example.shopee_24808;

public class Cart {

    private Client client;
    private double price;
    private String item_name;

    public Cart(Client client, double price, String item_name) {
        this.client = client;
        this.price = price;
        this.item_name = item_name;
    }

    public Cart(Client client) {
    }

    public Cart(String item_name) {
    }

    public Client getClient() {
        return client;
    }

    public double getPrice() {
        return price;
    }

    public String getItem_name() {
        return item_name;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "status=" + client +
                ", price=" + price +
                ", item_name='" + item_name + '\'' +
                '}';
    }
}
