package kata;

import static java.util.stream.Collectors.joining;

public class FakeBinary {
    
    public static void main (String[] args) {
        String s1 = fakeBin("59215989");
        String s2 = fakeBin("00501990");
        String s3 = fakeBin("861374091");
        String s4 = fakedBin("95813057310");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
    
    public static String fakeBin (String str) {
        return str.chars().mapToObj(i -> i < 53 ? "0" : "1").collect(joining());
    }
    
    public static String fakedBin (String str) {
        return str.chars().mapToObj(i -> i < 53 ? "0" : "1").collect(joining());
    }
}