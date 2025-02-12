package application;

import entities.Employer;
import entities.outSourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employer> listEmp = new ArrayList<>();
        System.out.print("Enter the number of employer: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " Data");

            System.out.print("Outsourced (y/n): ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            double hours = sc.nextDouble();
            System.out.print("Value per hour: ");
            double valueHour = sc.nextDouble();

            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employer emp = new outSourceEmployee(name, hours, valueHour, additionalCharge);
                listEmp.add(emp);
            } else {
                Employer emp = new Employer(name, hours, valueHour);
                listEmp.add(emp);
            }


        }

        System.out.println();
        System.out.println("PAYMENT");
        for (Employer emp : listEmp) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();

    }

}
