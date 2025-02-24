package Application;

import Entities.Porduct;
import services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramProducts{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Porduct> list = new ArrayList<>();

        String path = "C:\\temp\\in.txt";

        try(BufferedReader reader =  new BufferedReader(new FileReader(path))){
            String line = reader.readLine();
            while (line != null){
                String[] filds = line.split(",");
                list.add(new Porduct(filds[0], Double.parseDouble(filds[1])));
                line = reader.readLine();
            }

            Porduct x = CalculationService.max(list);
            System.out.println("Max: ");
            System.out.println(x);


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }



        sc.close();
    }
}
