package javastart.bubblesort;

import java.util.Random;

public class SortingTest {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        long end = System.currentTimeMillis();

        Random r = new Random();
        int[] testArray = new int[9000];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = r.nextInt(100);
        }


        begin = System.currentTimeMillis();
        SortingTest.printArray(testArray);
        end = System.currentTimeMillis();

        System.out.println("Printing test array took " + (end - begin) + " ms");

        begin = System.currentTimeMillis();
        BubbleSort.sort(testArray);
        end = System.currentTimeMillis();


        System.out.println("Sorting test array took: " + (end - begin) + " ms");

        begin = System.currentTimeMillis();
        SortingTest.printArray(testArray);
        end = System.currentTimeMillis();

        System.out.println("Printing sorted test array took: " + (end - begin) + " ms");
    }

    private static void printArray(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
}
