package application;

import entities.Product;
import model.service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet",350.00));
        list.add(new Product("HD case", 89.90));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, product -> product.getName().charAt(0) == 'T');
        double sum2 = ps.filteredSum(list, product -> product.getName().charAt(0) == 'M');
        System.out.println("Sum T = " +String.format("%.2f", sum));
        System.out.println("Sum M = " +String.format("%.2f", sum2));
    }
}
