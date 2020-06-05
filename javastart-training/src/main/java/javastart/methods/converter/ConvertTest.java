package javastart.methods.converter;

public class ConvertTest {
    public static void main(String[] args) {

        ConvertLength length = new ConvertLength();
        ConvertTime time = new ConvertTime();
        double x = 2.5;
        int hours = 14;

        double cmToM = length.centimetrToMetr(x);
        double mToCm = length.metrToCentimetr(x);
        double mToMili = length.metrToMilimetr(x);
        double miliToM = length.milimetrToMetr(x);

        System.out.println(x + " mm = " + miliToM + " m");
        System.out.println(x + " m = " + mToMili + " mm");
        System.out.println(x + " m = " + mToCm + " cm");
        System.out.println(x + " cm = " + cmToM + " m");

        double minutes = time.hourToMinutes(hours);
        double seconds = time.minuteToSecond(minutes);
        double miliSeconds = time.secondToMilisecond(seconds);

        System.out.println(hours + " hours = " + miliSeconds + " miliseconds, or " + seconds + " seconds");
    }
}