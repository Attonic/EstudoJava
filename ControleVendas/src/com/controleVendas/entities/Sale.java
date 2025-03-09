package com.controleVendas.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Sale {
    private Client client;
    List<Client> clients = new ArrayList<>();
    List<Product> products = new ArrayList<>();
    List<Order> orders = new ArrayList<>();

    public void registerClient(String name, Integer id, LocalDateTime birthDay){
        clients.add(new Client(name, id, birthDay));
    }

    public void registerProduct(String name, Integer id, Integer stockQuantity, Double price){
        products.add(new Product(name, id, stockQuantity, price));
    }



}
