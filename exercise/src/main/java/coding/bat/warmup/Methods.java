package coding.bat.warmup;

public class Methods {


    public static String front22(String str) {
        if (str.length() < 2) {
            String front = str.substring(0, str.length());
            return front + str + front;
        } else {
            String take = str.substring(0, 2);
            return take + str + take;
        }
    }

    public static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }

    //Given two temperatures, return true if one is less
    // than 0 and the other is greater than 100
    public static boolean iceHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100))
            return true;
        else
            return false;
    }

    // Return true if the given string begins with "mix", except the 'm' can be anything,
    // so "pix", "9ix" .. all count.
    public static boolean mixStart(String str) {
        if (str.indexOf('i') == 1 && str.indexOf('x') == 2)
            return true;
        else
            return false;
    }

    //Given 2 int values, return whichever value is nearest to the value 10,
    // or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
    public static int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);
        if (aDiff < bDiff)
            return a;
        if (bDiff < aDiff)
            return b;
        return 0;
    }

    //Given two non-negative int values, return true if they have the same last digit, such as
    // with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
    public static boolean lastDigit(int a, int b) {
        if (a % 10 == b % 10) {
            return true;
        }
        return true;
    }

    public static boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') count++;
        }
        return (count >= 1 && count <= 3);
    }

    public static String startOz(String str){
        String result = "";
        if(str.length() >=1 && str.charAt(0) == 'o'){
            result =result +str.charAt(0);
        }
        if(str.length() >=2 && str.charAt(1) == 'z'){
            result = result +str.charAt(1);
        }
        return result;
    }

    public static String delDel(String str) {
        if (str.length()>=4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }
}