package repeat.session3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {

        IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7);

        int[] evenNumbers = stream
                .filter(n -> n % 2 != 0)
                .toArray();
        System.out.println(Arrays.toString(evenNumbers));

        Stream<String> letters = Stream.of("a", "b", "c");
        Object[] objects = letters
                .map(String::toUpperCase)
                .toArray(String[]::new);

        System.out.println(Arrays.toString(objects));

        IntStream numStream = IntStream.rangeClosed(0, 99);
//        IntStream limitedStream = numStream.limit(100);
        int[] numbers = numStream.toArray();
        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = IntStream.iterate(0, x -> x + 1)
                .limit(100)
                .map(x -> x * x)
                .filter(x -> x % 2 == 0)
                .toArray();
        System.out.println(Arrays.toString(numbers2));

        Scanner scanner = new Scanner(new File("file.txt"));
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());

        }


    }


}