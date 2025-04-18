package application;

import model.entities.Product;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ProductProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Map<Product, Double> stock = new HashMap<>();


        Product p1 = new Product("Tv", 9000.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 15000.0);
        stock.put(p3, 20000.0);

        Product ps = new Product("Tv", 900.00);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));


        sc.close();
    }
}
