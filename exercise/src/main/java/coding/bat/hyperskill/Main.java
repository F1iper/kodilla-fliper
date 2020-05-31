package coding.bat.hyperskill;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int reverse = 0;

        while (number > 0) {
            reverse = (reverse * 10) + (number % 10);
            number /= 10;
        }
        System.out.println(reverse);
    }
}