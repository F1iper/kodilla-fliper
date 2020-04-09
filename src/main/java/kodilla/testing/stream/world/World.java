package kodilla.testing.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class World {

    final List<Continent> continents = new ArrayList<>();

    BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(continents -> continents.getCountries().stream())
                .map(Country::getNumberOfPeople)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("kasia");
        names.add("karolina");
        names.add("justyna");
        names.add("marek");
        names.add("filip");
        names.add("karol");

        List<String> newList = names.stream()
                .filter(s -> s.endsWith("a"))
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(newList);
    }


}