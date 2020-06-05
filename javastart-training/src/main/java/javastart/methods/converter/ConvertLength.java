package javastart.methods.converter;

public class ConvertLength {

    public double metrToCentimetr(double metr) {
        return metr * 100;
    }

    public double metrToMilimetr(double metr) {
        return metr * 1000;
    }

    public double centimetrToMetr(double centimetr) {
        return centimetr / 100;
    }

    public double milimetrToMetr(double milimetr) {
        return milimetr / 1000;
    }
}