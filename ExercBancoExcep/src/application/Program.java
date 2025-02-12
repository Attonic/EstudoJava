package application;
import model.entities.Account;
import model.exception.BusinessException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial Balance: ");
            double initBalance = sc.nextDouble();
            System.out.print("Withdrawn limit: ");
            double wLimit = sc.nextDouble();

        }catch (InputMismatchException e){
            System.out.println("Enter numbers only");
        }
        Account account = new Account(number, holder, initBalance, wLimit);

        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();
    try{
        account.withdraw(amount);
        System.out.printf("Novo saldo: %.2f%n", account.getBalance());
    }catch (BusinessException e){
        System.out.println(e.getMessage());
    }






        sc.close();
    }
}
