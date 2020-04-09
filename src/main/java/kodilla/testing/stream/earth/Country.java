package kodilla.testing.stream.earth;

import java.util.ArrayList;
import java.util.List;

public final class Country {
    private final String countryName;
    private final List<Zoo> zoos = new ArrayList<>();

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public List<Zoo> getAmountOfZoo() {
        return zoos;
    }

    public void addZoo(Zoo zoo){
        zoos.add(zoo);
    }
}