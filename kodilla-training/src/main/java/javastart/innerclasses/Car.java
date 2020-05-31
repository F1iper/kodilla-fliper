package javastart.innerclasses;

public class Car {
    public static int fuel;
    private Engine engine;

    public Car() {
        engine = new Engine("Ferrari");
        System.out.println("Car with " + engine.engineType + " engine was created");
    }

    public void go() throws InterruptedException {
        while(fuel > 0) {
            engine.consumeFuel();
            System.out.println("fuel" + fuel);
            Thread.sleep(2000);
        }
        System.out.println("Empty tank");
    }

    public void refuel(int liters) {
        fuel = fuel + liters;
    }

    public static  class Engine {
        private static final int FUEL_CONSUMPTION = 20;
        private String engineType;

        public Engine(String engineType) {
            this.engineType = engineType;
        }

        public void consumeFuel() {
            if (fuel >= FUEL_CONSUMPTION)
                fuel = fuel - FUEL_CONSUMPTION;
            else
                fuel = 0;
        }
    }
}