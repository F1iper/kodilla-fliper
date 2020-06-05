package javastart.methods.converter;

public class ConvertTime {

    public double hourToMinutes (double hour) {
        return hour * 60;
    }

    public double minuteToSecond (double minute) {
        return minute * 60;
    }

    public double secondToMilisecond ( double second) {
        return second * 1000;
    }
}