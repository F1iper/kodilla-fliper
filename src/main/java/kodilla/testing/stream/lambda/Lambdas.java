package kodilla.testing.stream.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Lambdas {


    public static List<Integer> getNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        return numbers;
    }

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();          //today date
        LocalDate tomorrowDate = localDate.plusDays(1); //tomorrow date
        LocalDate date3WeeksBefore = localDate.minusWeeks(3); //3 weeks before

        System.out.println("localDate = " + localDate);
        System.out.println("tomorrowDate = " + tomorrowDate);
        System.out.println("date3WeeksBefore = " + date3WeeksBefore);

    }
}