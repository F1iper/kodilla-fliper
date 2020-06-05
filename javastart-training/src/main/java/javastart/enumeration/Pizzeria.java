package javastart.enumeration;

import java.util.Scanner;

public class Pizzeria {

    public static void method(double... numbers) {
        for(double number : numbers) {
            System.out.println("number is: " + number);
        }

    }
    public static void main(String[] args) {
        printPizzas();
        Pizza pizza = getPizza();
        System.out.println("Thank You for ordering our pizza: " + pizza.name());
    }

    private static Pizza getPizza() {
        Scanner input = new Scanner(System.in);
        System.out.println("Which pizza do You choose ?");
        Pizza pizza = Pizza.valueOf(input.nextLine().toUpperCase());
        input.close();
        return pizza;
    }

    private static void printPizzas() {
        Pizza[] values = Pizza.values();
        System.out.println("Possible pizza's: ");
        for (Pizza pizza : values) {
            System.out.println(pizza);
        }
    }
}