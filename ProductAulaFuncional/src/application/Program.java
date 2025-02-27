package application;

import entities.Product;
import util.UpperCase;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);

        List<Product> list = new ArrayList<>();



        list.add(new Product("Tv", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        //List<String> names = list.stream().map(new UpperCase()).collect(Collectors.toList());
        //funcção dentro da classe
        //List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        //Function<Product, String> func = product -> product.getName().toUpperCase();
        List<String> name = list.stream().map(product -> product.getName().toUpperCase()).collect(Collectors.toList());
        name.forEach(System.out::println);

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
        for(Product item : list){
            System.out.println(item);
        }

        sp.close();
    }
}
