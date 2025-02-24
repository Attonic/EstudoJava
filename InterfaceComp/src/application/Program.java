package application;

import entities.services.BrazilinterestService;
import entities.services.InterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService is = new BrazilinterestService(2.0);
        double payment = is.paymnet(amount, months);


        System.out.println("Payment after " + months + " Months: ");
        System.out.println(String.format("%.2f", payment));



        sc.close();
    }
}
