package stream;


import javax.imageio.IIOException;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class aula1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file patch: ");
        String path = sc.nextLine();

        try(BufferedReader reader = new BufferedReader(new FileReader(path))){

            List<Product2> list = new ArrayList<>();

            String line = reader.readLine();
            while (line != null){
                String[] filds = line.split(",");
                list.add(new Product2(filds[0], Double.parseDouble(filds[1])));
                line = reader.readLine();
            }

            double avg = list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x,y) -> x + y) /  list.size();

            System.out.println("Average price: " + String.format("%.2f", avg));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(p -> p.getName())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());

            names.forEach(System.out::println);

        }catch (IOException e){
            System.out.println("Erro" + e.getMessage());
        }

        sc.close();






    }
}
