package kodilla.testing.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class Continent {

    private final String name;
    private final List<Country> countries = new ArrayList<>();

    public Continent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCountry (Country country) {
        countries.add(country);
    }
    public List<Country> getCountries(){
        return countries;

//    public List<Country> getCountryList() {
//        final List<Country> countries = new ArrayList<>();
//        countries.add(new Country("France", new BigDecimal("4135153")));
//        countries.add(new Country("Germany", new BigDecimal("80345783")));
//        countries.add(new Country("Spain", new BigDecimal("51345136")));
//}
//        countries.add(new Country("Ghana", new BigDecimal("4135153")));
//        countries.add(new Country("Kenia", new BigDecimal("80345783")));
//        countries.add(new Country("Nigeria", new BigDecimal("51345136")));
//
//        countries.add(new Country("Korea", new BigDecimal("354345345")));
//        countries.add(new Country("Japan", new BigDecimal("546356")));
//        countries.add(new Country("China", new BigDecimal("53126513")));
//
//        return new ArrayList<>(europeanCountries);
    }
}