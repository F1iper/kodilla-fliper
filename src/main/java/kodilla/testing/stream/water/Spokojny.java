package kodilla.testing.stream.water;

import java.math.BigDecimal;

public class Spokojny implements WaterStorage {
    @Override
    public BigDecimal getWater() {
        BigDecimal waterStored = new BigDecimal("1234567598");
        return waterStored;
    }
}
