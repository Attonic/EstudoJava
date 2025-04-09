import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))){

            List<Employee> employees = new ArrayList<>();

            String line = reader.readLine();
            while (line != null){
                String[] filds = line.split(",");
                employees.add(new Employee(filds[0], filds[1], Double.parseDouble(filds[2])));
                line = reader.readLine();
            }

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();


            List<String> emails = employees.stream()
                    .filter(employee -> employee.getSalary() > salary)
                    .map(employee -> employee.getEmail())
                    .sorted().collect(Collectors.toList());

            System.out.println("Email of peaple whose salary is more than 2000.00: "
                    + String.format("2.%f", salary) +": ");
            emails.forEach(System.out::println);



            double sum = employees.stream()
                    .filter(employee -> employee.getName().charAt(0) == 'M')
                    .map(employee -> employee.getSalary())
                    .reduce(0.0, (x, y) -> x + y);


            System.out.print("Sum of Salary peaple whose name starts with 'M': " + String.format("%.2f", sum));


        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
