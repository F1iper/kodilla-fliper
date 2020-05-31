package coding.bat.warmup;

import static coding.bat.warmup.Methods.*;
import static coding.bat.warmup.StringSamples.stringTimes;

public class WarmUp {
    public static void main(String[] args) {


        System.out.println(stringTimes("Chocolate", 5));
        System.out.println(delDel("delete"));
        System.out.println(delDel("deete"));
        System.out.println(delDel("abdac"));

        System.out.println("if str starts with o ");
        System.out.println(startOz("bzooo"));
        System.out.println(startOz("oxboo"));
        System.out.println(startOz("ozymandias"));

        System.out.println("if str contains \"e\" or \"ee\" or \"eee\" return true");
        System.out.println(stringE("Hello"));
        System.out.println(stringE("Heello"));
        System.out.println(stringE("Heeello"));

        System.out.println("comparing last digits on int, example a % 10 == b % 10 returns true when a =3, b = 1113");
        System.out.println(lastDigit(7, 17));
        System.out.println(lastDigit(3, 1113));
        System.out.println(lastDigit(11, 0));

        System.out.println(close10(1,11));;
        System.out.println(close10(1,-12));

        System.out.println("Check and return true when index of char is same as predicted");
        System.out.println(mixStart("mixStart"));
        System.out.println(mixStart("pixStart"));
        System.out.println(mixStart("pizStart"));

        System.out.println("Given two temperatures, return true if one is less than 0 and the other is greater than 100: ");
        System.out.println(iceHot(-1, 100));
        System.out.println(iceHot(-1, 120));
        System.out.println(iceHot(2, 120));

        System.out.println(nearHundred(120));// false
        System.out.println(nearHundred(93));//true
        System.out.println(nearHundred(11));//false
        System.out.println(nearHundred(151));//false
        System.out.println(nearHundred(199));//true
        System.out.println(nearHundred(201));//false
        System.out.println(nearHundred(149));//false


        System.out.println("Math examples: ");
        System.out.println(Math.abs(-26.7)); //how much away from 0, given - or + returns absolute +
        //Math.ceil always rounds number up -- 7.1 --> 8.0
        System.out.println(Math.ceil(7.1));
        //Math.floow always rounds number down 7.9 --> 7.0
        System.out.println(Math.floor(7.9));
        //Max taking multiple parameters --> returning max
        System.out.println(Math.max(8.6, 7.2));
        //Min taking multiple parameters --> returning min
        System.out.println(Math.min(8.6, 7.2));
        // power = 5 * 5 * 5, first given is mutliplied --> second number times
        System.out.println(Math.pow(5, 3.2));
        //finds a square of number 9 --> 3, 25 --> 5
        System.out.println(Math.sqrt(25));
        String name = "kitten";

        System.out.println(front22("Sentence is done"));
        System.out.println(front22("1"));
        System.out.println(front22("aa"));
        System.out.println(front22("KIttens"));

    }
}