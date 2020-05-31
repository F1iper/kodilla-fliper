package coding.bat.javastart.carshop;

public class Car {

    String brand;
    String model;
    String color;
    String wheelColor;
    int doors;

    public Car(String brand, String model, String color, String wheelColor, int doors) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.wheelColor = wheelColor;
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", wheelColor='" + wheelColor + '\'' +
                ", doors=" + doors +
                '}';
    }
}
