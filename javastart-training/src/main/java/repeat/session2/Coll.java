package repeat.session2;

import java.util.*;
import java.util.stream.Collectors;

public class Coll {
    static int [] ages = {7, 6, 15, 74, 56, 25, 93};
    static List<Double> doubles = new ArrayList<>();
    public static void main(String[] args) {

        System.out.println(getSum(ages));
        System.out.println(getAverage(doubles));
    }

    private static void fillTheList(List<Double> doubles) {
        doubles.add(15.5);
        doubles.add(12.9);
        doubles.add(13.7);
        doubles.add(16.4);
        doubles.add(13.1);
    }

    public static int getSum(int [] array) {
        return Arrays.stream(array)
                .sum();
    }

    public static List<Double> getAverage(List<Double> doubles) {
        fillTheList(doubles);
        return doubles.stream()
                .filter(d -> d > 13.8)
                .collect(Collectors.toList());
    }
}
