package entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Bilhete {
    int[] numerosEscolhidos;
    int[] resultadoDoSorteio;
    public Bilhete(int[] numerosEscolhidos){
        this.numerosEscolhidos = numerosEscolhidos;
    }

    public void realizarSorteio(){
        Random random = new Random();
        resultadoDoSorteio = new int[6];

        for(int i = 0; i < resultadoDoSorteio.length; i++){
            resultadoDoSorteio[i] = random.nextInt(61);
        }

        Arrays.sort(resultadoDoSorteio);
    }

    public int contarAcerto(){
        int acertos = 0;

        for (int numerosEscolhidos : numerosEscolhidos){
            for (int numeroSorteado : resultadoDoSorteio){
                if (numeroSorteado == numerosEscolhidos){
                    acertos++;
                }
            }
        }
        return 0;
    }
    public void exibirResultados() {
        System.out.println("Numeros escolhidos: " + Arrays.toString(numerosEscolhidos));
        System.out.println("Numeroes Sorteados " + Arrays.toString(resultadoDoSorteio));
        int acertos = contarAcerto();
        System.out.println("Voce acertou: " + acertos + " acertos.");
        System.out.println();
    }
}
