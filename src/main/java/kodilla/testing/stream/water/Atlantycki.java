package kodilla.testing.stream.water;

import java.math.BigDecimal;

public class Atlantycki implements WaterStorage {
    @Override
    public BigDecimal getWater() {
        BigDecimal waterStored = new BigDecimal("7654321");
        return waterStored;
    }
}