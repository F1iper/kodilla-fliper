package javastart.methods.calculate;

public class Calculate {
    private static double x = 25.4;
    private static double y = 12.7;

    public static void main(String[] args) {

        Calculator calc1 = new Calculator();

        double add = calc1.add(x, y);
        double subtract = calc1.subtract(x, y);
        double multiply = calc1.multiply(x, y);
        double division = calc1.division(x, y);

        System.out.println("adding " + x + " + " + y + " = " + add);
        System.out.println("subtract " + x + " - " + y + " = " + subtract);
        System.out.println("multiply " + x + " * " + y + " = " + multiply);
        System.out.println("division " + x + " / " + y + " = " + division);
    }
}