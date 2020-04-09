package kodilla.testing.stream.earth;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

private final List<Continent> continents = new ArrayList<>();

    public World() {}

    public List<Continent> getContinents() {
        return continents;
    }

    public void addContinent(Continent continent){
        continents.add(continent);
    }

    final BigDecimal getAnimalsAmount() {
        return continents.stream()
                .flatMap(continents -> continents.getCountries().stream())
                .flatMap(countries -> countries.getAmountOfZoo().stream())
                .map(Zoo::getAnimalQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}