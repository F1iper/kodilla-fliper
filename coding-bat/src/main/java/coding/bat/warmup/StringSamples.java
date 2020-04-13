package coding.bat.warmup;

import com.sun.tools.javac.util.StringUtils;

// bucky- thenewboston
public class StringSamples {

    public static void main(String[] args) {

        String[] words = {"funk", "chunk", "furry", "baconator"};

        //starts with --> for each loop
        for (String w : words) {
            if (w.startsWith("fu")) {
                System.out.println(w + " starts with fu");
            }
        }
        for (String w : words) {
            if (w.endsWith("unk")) {
                System.out.println(w + " ends with unk");
            }
        }

        String s = "buckyrobertsbuckyroberts";
        //search for the first index but ignore 5, start searching from 5.
        System.out.println(s.indexOf("k", 5));
        System.out.println(s.indexOf("x", 5));
        System.out.println(s.indexOf("rob", 10));

        String a = "Bacon";
        String b = "      monster";

        System.out.println(a.concat(" " + b));
        System.out.println(a.replace("B", "F"));
        System.out.println(b.toUpperCase());
        System.out.println(b.length());
        System.out.println(b);
        System.out.println(b.trim());


        System.out.println(recursion(25));
        System.out.println(fact(5));

    }

    //Recursion
    // !5 --> 5 * 4 * 3 * 2 * 1
    // !4 --> 4 * 3 * 2 * 1

    public static long fact(long n) {
        if (n <= 1)
            return 1;
        else
            return n * fact(n - 1);
    }

    public static int recursion(int a) {
        if (a == 100)
            return 1;
        else
            return a * recursion(a + 1);
    }

    public static String stringTimes(String str, int n) {
       int front = 3;
       if(front> str.length()) {
           front = str.length();
       }
       String front2 = str.substring(0, front);
       String result = "";
       for(int i = 0; i<n; i++){
           result += front2;
        }
       return result;
       }

}