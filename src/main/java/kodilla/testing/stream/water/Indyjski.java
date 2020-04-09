package kodilla.testing.stream.water;

import java.math.BigDecimal;

public class Indyjski implements WaterStorage {
    @Override
    public BigDecimal getWater() {
        BigDecimal waterStored = new BigDecimal("12345678");
        return waterStored;
    }
}