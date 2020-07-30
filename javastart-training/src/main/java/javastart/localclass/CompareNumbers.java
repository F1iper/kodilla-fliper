package javastart.localclass;

import org.w3c.dom.ls.LSOutput;

public class CompareNumbers {
    public static void main(String[] args) {
        int[] tab = {5, 10, 3000, -23, 1009, 2938, 153, 24};

        //Declaration of anonymous class and creation object of anonymous class type
        // inside method
        // class with noName ----> anonymous < java 8
        BiggestNumber ns = tab1 -> {
            if (tab1 == null)
                throw new NullPointerException("Argument cannot be null");
            if (tab1.length == 0)
                throw new IllegalArgumentException("Array has to have at least 1 value");
            int biggestNumber = tab1[0];
            for (int i = 0; i < tab1.length; i++) {
                if (biggestNumber < tab1[i])
                    biggestNumber = tab1[i];
            }
            return biggestNumber;
        };
        System.out.println("Biggest number: " + ns.takeBiggest(tab));
    }
}