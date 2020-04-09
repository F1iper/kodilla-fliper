package kodilla.testing.stream.earth;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class WorldTestSuite {

    @Test
    public void getAnimalsAmount() {
        //Given
        Zoo poznan = new Zoo("Poznan", new BigDecimal("400"));
        Zoo warszawa = new Zoo("Warszawa", new BigDecimal("1400"));
        Zoo hunan = new Zoo("Hunan", new BigDecimal("8700"));
        Zoo wuhan = new Zoo("Wuhan", new BigDecimal("25600"));

        Country poland = new Country("Poland");
        Country china = new Country("China");

        poland.addZoo(poznan);
        poland.addZoo(warszawa);
        china.addZoo(wuhan);
        china.addZoo(hunan);

        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");

        europe.addCountry(poland);
        asia.addCountry(china);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);

        //When
        BigDecimal totalAnimals = world.getAnimalsAmount();
        BigDecimal expectedNumber = new BigDecimal("36100");

        //Then
        Assert.assertEquals(expectedNumber, totalAnimals);
    }
}