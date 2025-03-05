package application;

import entities.Bilhete;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Bilhete> bilhetes = new ArrayList<>();

        while (true){
            int[] numerosEscolhidos = new int[6];

            System.out.println("Digite 6 numeros para seu bilhete(Entre 1 a 60)");
            for (int i = 0; i < numerosEscolhidos.length; i++) {
                System.out.println("Digite um numero " + (i+1) + ": ");
                numerosEscolhidos[i] = sc.nextInt();
            }

            Bilhete bilhete = new Bilhete(numerosEscolhidos);
            bilhetes.add(bilhete);

            System.out.println("Deseja Registrar outro bilhete (s sim, n não");
            String resposta = sc.next();


            if (resposta.equals("n")){
                break;
            }

        }

        for(Bilhete bilhete : bilhetes){
            bilhete.realizarSorteio();
            bilhete.exibirResultados();
        }

        sc.close();
    }
}
