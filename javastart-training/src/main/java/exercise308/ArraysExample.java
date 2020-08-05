package exercise308;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraysExample {

    public static void main (String[] args) {
        String[] names = {"Basia", "Marta", "Jacek", "Wojtek", "Zuza"};
        Integer[] numbers = { 1, 5, 755, 59, 12, 62, 25, 72};
        
        System.out.println("Names: ");
        printArray(names);
    
        System.out.println("Numbers: ");
        printArray(numbers);
        System.out.println();
    
        Arrays.sort(numbers);
        System.out.println("Arrays.sort(numbers): ");
        printArray(numbers);
        
        Arrays.sort(names);
        System.out.println("Arrays.sort(names): ");
        printArray(names);
        System.out.println();
    
        System.out.println("Numbers2, Arrays.copyOf()");
        Integer[] numbers2 = Arrays.copyOf(numbers, numbers.length);
        printArray(numbers2);
        
        System.out.println("Names2, Arrays.copyOf()");
        String[] names2 = Arrays.copyOf(names, names.length);
        printArray(names2);
        System.out.println();
    
        System.out.println(Arrays.equals(names, names2));
        System.out.println();
    
        System.out.println("Arrays.fill()");
        String[] strings = new String[5];
        Arrays.fill(strings, "Wacek");
        printArray(strings);
        
    }
    
    public static <T> void printArray(T[] arr) {
        for(T t: arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

}
