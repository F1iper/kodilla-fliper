package spring.kurs.javasolutions;

import org.springframework.stereotype.Component;

@Component
public class GoodPizza implements IPizza {

    private double price;
    private String name;

    public GoodPizza(double price, String name) {
        super();
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}