package kodilla.testing.stream.earth;

import java.math.BigDecimal;

public final class Zoo {
    private final String nameOfZoo;
    private final BigDecimal animals;

    public Zoo(final String nameOfZoo, final BigDecimal animals) {
        this.nameOfZoo = nameOfZoo;
        this.animals = animals;
    }

    public String getNameOfZoo() {
        return nameOfZoo;
    }

    public BigDecimal getAnimalQuantity() {
        return animals;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "nameOfZoo='" + nameOfZoo + '\'' +
                ", animals=" + animals +
                '}';
    }
}