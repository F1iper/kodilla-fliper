package kodilla.testing.stream.water;

import kodilla.testing.stream.sand.Africa;
import kodilla.testing.stream.sand.Asia;
import kodilla.testing.stream.sand.Europe;
import kodilla.testing.stream.sand.SandStorage;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WaterStorageTestSuite {

    @Test
    public void getWaterStorageSize(){
        //Given
        List<WaterStorage> oceans = new ArrayList<>();
        oceans.add(new Spokojny());
        oceans.add(new Indyjski());
        oceans.add(new Atlantycki());

        //When
        BigDecimal totalWater = oceans.stream()
                .map(WaterStorage::getWater)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        BigDecimal expectedStorage = new BigDecimal("1254567597");
        Assert.assertEquals(expectedStorage, totalWater);
    }

}