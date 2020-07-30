package javastart.loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                break;
            System.out.println("this number is odd " + i);
        }
        System.out.println("Loop finished");
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter number: ");
            int temp = scanner.nextInt();

            if (temp % 2 == 0)
                System.out.println("Number " + temp + " is even");
            else
                System.out.println("Number " + temp + " is odd");
        }
        scanner.close();

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int num : nums) {
            System.out.println(num);
        }

        int[] numberrs = new int[3];
        Scanner scanner2 = new Scanner(System.in);

        for (int i = 0; i < numberrs.length; i++) {
            System.out.println("Enter number: ");
            numberrs[i] = scanner2.nextInt();
        }

        for (int num : numberrs) {
            System.out.println(num);
        }
        scanner2.close();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("First loop " + i);
        }
    }
}