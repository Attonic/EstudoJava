package application;

import entities.LogEntry;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        /**
         * O programa lé e mostra a quantidade de usúarios
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file full path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
                                    //hashset pq não importa a ordem dos produtos e ele é mais rápido
            Set<LogEntry> set = new HashSet<>();
            String line = br.readLine();
            while (line != null){

                String[] fildes = line.split(" ");
                String username = fildes[0];
                Date moment = Date.from(Instant.parse(fildes[1]));

                //Se receber um nome repetido é barrado
                set.add(new LogEntry(username, moment));

                line = br.readLine();;

            }

            System.out.println("Total users: " + set.size());

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }



        sc.close();
    }
}
