package kodilla.testing.stream.earth;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String name;
    private final List<Country> countries = new ArrayList<>();

    public Continent(final String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void addCountry(Country country){
        countries.add(country);
    }

    public List<Country> getCountries() {
        return countries;
    }
}