package codingbat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CodingBat2 {

    public static void main(String[] args) throws FileNotFoundException {

//        Stream<String> stream = Stream.of("a", "b", "c");
//        Stream<Integer> numberStream = Stream.of(1, 2, 3, 4);

        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6);
        IntStream evenStream = intStream.filter(n -> n > 2 && n < 6);
        int[] evenNumbers = evenStream.toArray();
        System.out.println(Arrays.toString(evenNumbers));

        int[] nums = IntStream.of(1, 2, 3, 4, 5)
                .filter(n -> n % 2 != 0)
                .toArray();
        System.out.println(Arrays.toString(nums));

        Stream<String> letters = Stream.of("a", "b", "c");
        String[] upperCaseLetters = letters.map(x -> x.toUpperCase())
                .toArray(String[]::new);
        System.out.println(Arrays.toString(upperCaseLetters));

        IntStream numStream = IntStream.iterate(0, n -> n + 1);
        IntStream limitedStream = numStream.limit(100);
        int[] ints = limitedStream.toArray();
        System.out.println(Arrays.toString(ints));

        int[] numbers = IntStream.iterate(0, x -> x + 1)
                .limit(100)
                .map(x -> x * x)
                .toArray();
        System.out.println(Arrays.toString(numbers));

        int[] evenNumbersLimit100 = IntStream.iterate(0, x -> x + 1)
                .limit(50)
                .map(x -> x * x)
                .filter(x -> x % 2 == 0)
                .toArray();
        System.out.println();
        System.out.println(Arrays.toString(evenNumbersLimit100));


    }


}
