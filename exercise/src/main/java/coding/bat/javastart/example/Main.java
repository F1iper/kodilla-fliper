package coding.bat.javastart.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int x = rnd.nextInt(100);
        int y = rnd.nextInt(100);

        boolean result = x > y;
        System.out.println("x > y =  " + result);
    }
}
