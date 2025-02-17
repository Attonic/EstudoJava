package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the color rectangle: ");
        String inputColorRectangle = sc.next().toUpperCase();
        Color corRectangle = Color.valueOf(inputColorRectangle);

        System.out.print("Enter the Width: ");
        double whidth = sc.nextDouble();
        System.out.print("Enter the Height ");
        double height = sc.nextDouble();


        AbstractShape rectangle = new Rectangle(corRectangle, whidth, height);

        System.out.print("Enter the color Circle: ");
        String inputColorCircle = sc.next().toUpperCase();
        Color colorCircle = Color.valueOf(inputColorRectangle);

        System.out.print("Digite raio do circulo: ");
        double raio = sc.nextDouble();

        AbstractShape circle = new Circle(colorCircle, raio);

        System.out.println("The rectangle has area: " + String.format("%.2f", rectangle.area()));
        System.out.println("The circle has area: " + String.format("%.2f", circle.area()));
        sc.close();
    }
}
