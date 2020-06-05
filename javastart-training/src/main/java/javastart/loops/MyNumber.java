package javastart.loops;

public class MyNumber {

    private final int num;

    public MyNumber(int num) {
        this.num = num;
    }


//    public boolean isPrime() {
//        return (num % 2 != 0);
//    }
    public boolean isPrime() {
        if(num < 2)
            return false;
        for(int i = 2; i < num ; i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public int sumUpToN() {
        int counter = 0;
        for (int i = 0; i <= num; i++) {
            counter += i;
            System.out.println("n: " + counter);
        }
        return counter;
    }

    public int sumOfDivisors() {
        return 0;
    }

    public void printANumberTriangle() {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i);
                System.out.println(j);

            }
        }
    }
}