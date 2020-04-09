package kodilla.testing.junit;

import java.util.stream.Stream;

public class ExecutionClass {

    public static void main(String[] args) {
        generateEven(43);
    }

    public static void generateEven(int max) {

        Stream.iterate(1, n -> n + 1)
                .limit(max)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

    }
}