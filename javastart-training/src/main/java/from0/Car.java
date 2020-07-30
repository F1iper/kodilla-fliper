package from0;

public class Car {

    String model;
    String brand;

    public Car(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }



    public static void main(String[] args) {
        Car car = new Car("Golf", "VW");
        System.out.println(car);
    }
}
