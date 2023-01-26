package com.example.shopee_24808;

public class Client {
    private String ID;
    private double balance;

    public Client(String ID, double balance) {
        this.ID = ID;
        this.balance = balance;
    }

    public Client(String id, double balance, String item_name, double price) {
    }

    public String getID() {
        return ID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double value) {
        this.balance = value;
    }

    @Override
    public String toString() {
        return "Client{" +
                "ID='" + ID + '\'' +
                ", balance=" + balance +
                '}';
    }
}