package javastart.loops;

public class Main {
    public static void main(String[] args) {

        MyNumber number = new MyNumber(29);

        boolean isPrime = number.isPrime();
        System.out.println("is prime: " + isPrime);

//        number.sumUpToN();

        int sumOfDivisors = number.sumOfDivisors();

//        number.printANumberTriangle();
    }
}