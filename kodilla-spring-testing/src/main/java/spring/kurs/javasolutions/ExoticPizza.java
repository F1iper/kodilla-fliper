package spring.kurs.javasolutions;

import org.springframework.stereotype.Component;

@Component
public class ExoticPizza implements IPizza {
    private double price;
    private String name;

    public ExoticPizza(double price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}