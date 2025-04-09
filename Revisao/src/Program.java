import java.util.*;

public class Program {
    public static void main(String[] args) {
        Map<Product, Double> stock = new HashMap<>();
        List<Product> liste = new ArrayList<>();
        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.00);
        Product p3 = new Product("Tablet", 400.0);

        stock.put(p1, 1000.0);
        stock.put(p2, 2000.0);
        stock.put(p3, 3000.0);

        liste.add(p1);
        liste.add(p2);
        liste.add(p3);

        Product ps = new Product("Tv", 900.00);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));



        liste.sort((product1, product2) -> Integer.parseInt(product1.getName().toUpperCase()));

        for (Product p : liste){
            System.out.println(p);
        }

    }
}
