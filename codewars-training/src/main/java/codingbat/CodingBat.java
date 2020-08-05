package codingbat;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class CodingBat {
    
    public static void main (String[] args) {
    
        String test = "Hello Roman";
        char[] chars = test.toCharArray();
        for(int i = 0; i< chars.length; i ++) {
        
        }
        int[] nums = {1, 1, 2, 2, 3, 3, 3};
        boolean isTripled = noTriples(nums);
        System.out.println(isTripled);
    
        String a1 = "xxaaxxxbbccxx";
        System.out.println(stringX(a1));
        String s1 = "Wooaaahhh";
        String s2 = "abc";
        
        System.out.println(checkThisOut(s1));
        System.out.println(checkThisOut(s2));
        System.out.println(stringBits(s1));
        System.out.println(stringBits(s2));
        
        Stream<Course> courses = Stream.of(
          new Course(1L, "Java", 199, "Programowanie"),
          new Course(2L, "Sztuka pisania", 99, "Rozwoj osobisty"),
          new Course(3L, "Tajniki Google", 299, "Marketing")
        );
//        courses.forEach(System.out::println);
        Stream<Course> courses2 = Stream.of(
          new Course(1L, "Java", 199, "Programowanie"),
          new Course(2L, "Sztuka pisania", 99, "Rozwoj osobisty"),
          new Course(3L, "Tajniki Google", 299, "Marketing")
        );
        long streamSize = courses2.count();
        System.out.println("Amount of courses: " + streamSize);
        
        courses.min(Comparator.comparingDouble(Course::getPrice))
          .ifPresent(System.out::println);
        
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        Optional<Integer> minimumNumber = numbers.min((a, b) -> Integer.compare(a, b));
        Optional<Integer> maximumNumber = numbers.max((a, b) -> Integer.compare(a, b));
        
        //        minimumNumber.ifPresent(System.out::println);
        maximumNumber.ifPresent(System.out::println);
        
        System.out.println(extraEnd("H"));
        System.out.println(extraEnd("ThisIsDog"));
        System.out.println(extraEnd("abcdefghijk"));
        
        String one = "Hello";
        String three = "oh";
        
        System.out.println(theEnd(one, true));
     
    }
    
    public static String stringYak(String str) { // yakpak -> pak, yak123ya -> 123ya
    for(int i = 0; i <str.length() -2; i++) {
    
    }
    
    }
    
    public static boolean noTriples(int[] nums) {
        for(int i = 0; i < (nums.length -2) ;i ++) {
            int first = nums[i];
            if(first == nums[i +1]  && first == nums[i + 2])
                return false;
        }
        return true;
    }
    
    
    public boolean has271(int[] nums) {
        for(int i = 0; i< nums.length -2; i++) {
            return (nums[i] >= 0 && nums[i + 1] == nums[i] + 5 && nums[i + 2] == nums[i] - 1 || nums[i+2] == nums[i] -2);
        }
        return false;
    }
    
    
    public static String altPairs(String str) {
        if (str.length() < 5) {
            String front = str.substring(0, 2);
            return front;
        } else if (str.length() < 8) {
            String front = str.substring(0, 2);
            String mid = str.substring(4, 6);
            return front + mid;
        } else {
            String front = str.substring(0, 2);
            String mid = str.substring(4, 6);
            String end = str.substring(8, 10);
            return front + mid + end;
        }
    }
        
        
            //todo; Given 2 strings, a and b, return the number of the positions
    // where they contain the same length 2 substring.
    // So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az"
    // substrings appear in the same place in both strings.
    public static int stringMatch (String a, String b) {
        int len = Math.max(a.length(), b.length());
        int counter = 0;
        for (int i = 0; i < len - 1; i++) {
            String aSub = a.substring(i, i + 2);
            String bSub = b.substring(i, i + 2);
            if (aSub.equals(bSub)) {
                counter++;
            }
        }
        return counter;
    }
    
    public static String stringX(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {
            // Only append the char if it is not the "x" case
            if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
                result += str.substring(i, i+1);
            }
        }
        return result;
    }
    
    
    // TODO: 04.08.2020   sequence of 1, 2, 3 return true, else false;
    public boolean array123 (int[] nums) {
        for (int i = 0; i < (nums.length - 2); i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3)
                return true;
        }
        return false;
    }
    
    public static String checkThisOut (String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(0, i + 1);
        }
        return result;
    }
    
    //todo: bites the String from: Cocoa to: Cca
    public static String stringBits (String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.substring(i, i + 1);
        }
        return result;
    }
    //todo: returns str if length < 2, else returns last 2 chars * 3: This! -> s!s!s!
    
    public static String extraEnd (String str) {
        if (str.length() < 2) {
            return str;
        } else {
            String newString = str.substring(str.length() - 2, str.length());
            String answer = newString + newString + newString;
            return answer;
        }
    }
    
    public static String theEnd (String str, boolean front) {
        if (!front) {
            return str.substring(str.length() - 1, str.length());
        } else {
            return str.substring(0, 1);
        }
    }
    
    public static String withoutEnd2 (String str) {
        if (str.length() <= 1) {
            return "";
        } else {
            String first = str.substring(1, str.length() - 1);
            return first;
        }
    }
    
    public static String middleTwo (String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
        }
    }
    
    public static boolean endsLy (String str) {
        if (str.length() >= 2 && str.substring(str.length() - 1, str.length()).equals("ly")) {
            return true;
        } else {
            return false;
        }
    }
    
    public static String nTwice (String str, int n) {
        if (str.length() == n) {
            String front = str.substring(0, n);
            String back = str.substring(str.length() - n);
            return front + back;
        }
        return str;
    }
//    public String twoChar(String str, int index) {
//        if (index > str.length()) {
//            return str;
//        } else {
//            return str.substring(index, index + 2);
//        }

//    }
    //todo: Given 2 int arrays, a and b, of any length, return a new array with
    // the first element of each array. If either array is length 0, ignore that array.
    
    public static int[] front11 (int[] a, int[] b) {
        int[] array = new int[1];
        if (a.length <= 0) {
        }
        return array;
    }
    
    public static String divide (String str) {
        if (str.length() <= 3) {
            return str;
        } else {
        
        }
        return str;
    }
    
    public static String middleThree (String str) {
        if (str.length() < 3) {
            return str;
        } else {
            String result = str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
            return result;
        }
    }
    
    public static boolean doubleX (String str) {
        int i = str.indexOf("x");
        if (i == -1) return false;
        if (i + 1 >= str.length()) return false;
        return str.substring(i + 1, i + 2).equals("x");
    }
    
    public String stringSplosion (String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(0, i + 1);
        }
        return result;
    }
}
