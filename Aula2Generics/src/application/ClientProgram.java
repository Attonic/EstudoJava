package application;

import entities.Client;

public class ClientProgram {
    public static void main(String[] args) {

        Client c1 = new Client("Kyogre", "kyogre@email.com");
        Client c2 = new Client("Groudon", "groudon@email.com");
        Client c3 = new Client("Groudon", "groudon@email.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c2.equals(c3));



    }
}
