import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class CodingBat {



    public static String extraEnd(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            String newString = str.substring(str.length() - 2, str.length());
            String answer = newString + newString + newString;
            return answer;
        }
    }

    public static String theEnd(String str, boolean front) {
        if (!front) {
            return str.substring(str.length() - 1, str.length());
        } else {
            return str.substring(0, 1);
        }
    }

    public static String withoutEnd2(String str) {
        if (str.length() <= 1) {
            return "";
        } else {
            String first = str.substring(1, str.length() - 1);
            return first;
        }
    }

    public static String middleTwo(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
        }
    }

    public static boolean endsLy(String str) {
        if (str.length() >= 2 && str.substring(str.length() - 1, str.length()).equals("ly")) {
            return true;
        } else {
            return false;
        }
    }

    public static String nTwice(String str, int n) {
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
    public static int[] front11(int[] a, int[] b) {
        int [] array = new int[1];
        if(a.length <= 0) {
        }
    return array;
    }

    public static String divide(String str) {
        if (str.length() <= 3) {
            return str;
        } else {
        
        }
        return str;
    }




    public static String middleThree(String str) {
      if(str.length() <3) {
          return str;
      } else {
          String result = str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
          return result;
      }
    }


    public static boolean doubleX(String str) {
        int i = str.indexOf("x");
        if(i == -1) return false;
        if(i + 1 >= str.length()) return false;
        return str.substring(i+1, i+2).equals("x");
    }

    public static void main(String[] args) {




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
        System.out.println(theEnd(one, false));
        System.out.println(theEnd(three, true));
        System.out.println(theEnd(three, false));

    }
}
