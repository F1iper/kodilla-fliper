package beginwithjava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question3 {

    public static void showTable() throws InputMismatchException {
        while (true) {
            System.out.println("Enter positive integer: ");
            try {
                Scanner input = new Scanner(System.in);
                int number = input.nextInt();
                if (number < 1) {
                    System.out.println("The number should be positive!");
                } else {
                    for (int i = 1; i <= 10; i++) {
                        int result = i * number;
                        System.out.println(i + " * " + number + " = " + result);
                    }
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input should a number, try again.");
                showTable();
            }
        }
    }
}