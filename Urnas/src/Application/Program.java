package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> candidates = new LinkedHashMap<>();

        System.out.println("Enter file full path: ");
        String path = sc.next();

        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line = reader.readLine();
                while (line != null){
                    String[] filds = line.split(",");
                    String name = filds[0];
                    Integer votes = Integer.parseInt(filds[1]);

                    if (candidates.containsKey(name)){
                        int votesSoFar = candidates.get(name);
                        candidates.put(name, votes + votesSoFar);
                    }else {
                        candidates.put(name, votes);
                    }

                    line = reader.readLine();
                }
        }catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }

        for (String key : candidates.keySet()){
            System.out.println(key + ", " + candidates.get(key));
        }

    sc.close();
    }
}
