package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("Phone", "9999999");

        cookies.remove("email");
        System.out.println("All Cookies");

        System.out.println("Contains 'pohne' key: " + cookies.containsKey("Phone"));
        System.out.println("Phone number: " + cookies.get("Phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        for(String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}
