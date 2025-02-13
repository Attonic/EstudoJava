package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.OnlinePaymentService;
import model.services.PaypalService;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");



            System.out.println("Entre com os dados do contrato: ");
            System.out.print("Numero: ");
            int numero = sc.nextInt();
            System.out.print("Data: (dd/MM/yyyy) ");
            LocalDate date = LocalDate.parse(sc.next(), dtf);
            System.out.print("Valor do contrado: ");
            double valorContrato = sc.nextDouble();

            Contract contract = new Contract(numero, date, valorContrato);

            System.out.print("Entre com o numero de parcelas");
            Integer parcelas = sc.nextInt();


            ContractService contractService = new ContractService(new PaypalService());
            contractService.processContract(contract, parcelas);

            System.out.println("Parcelas: ");

            for(Installment installment : contract.getInstallments()){
                System.out.println(installment);
            }




        sc.close();
    }
}
