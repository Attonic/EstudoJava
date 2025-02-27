package application;

import entities.Product;
import util.PriceUpdate;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("Hd Case", 80.90));




//            list.forEach(new PriceUpdate());
            list.forEach(Product::staticPriceUpdate);

            double factor = 1.1;
            list.forEach(product -> product.setPrice((product.getPrice() * factor)));


//        Consumer<Product> cons = product -> {
//            product.setPrice(product.getPrice() * factor);
//        };
        list.forEach(System.out::println);
//        double min = 100.00;
//        list.removeIf(p -> p.getPrice() >= min);
////        list.removeIf(new ProductPredicate());
////        list.removeIf(Product::staticProductPredicate);
//
//        for(Product p  : list){
//            System.out.println(p);
//        }








        sc.close();
    }
}
