package codeWars;

import java.util.stream.IntStream;

public class First {

    public static void main(String[] args) {

        IntStream.iterate(1, n -> n + 1)
                .limit(15)
                .forEach(System.out::println);
    }
}