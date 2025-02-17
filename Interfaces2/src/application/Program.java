package application;

import entities.Contract;
import entities.Instalment;
import entities.services.ContractServices;
import entities.services.OnlinePaymentService;
import entities.services.PaypalService;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com o dados do contrato: ");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract obj = new Contract(number, date, totalValue);

        System.out.print("Entree com o numero de parcelas: ");
        int n = sc.nextInt();

        ContractServices contractServices = new ContractServices(OnlinePaymentService(new PaypalService()));

        contractServices.processContract(obj, n);

        System.out.println("Parcelas: ");

        for (Instalment instalment : obj.getInstalments()){
            System.out.println(instalment);
        }

        sc.close();
    }
}
