package beginwithjava;

public class Question2 {

    public static void naturalsTo10() {
        int i = 0;
        int counter = 0;
        while(i <= 10) {
            System.out.println(i);
            counter += i;
            i++;
        }
        System.out.println("sum =" + counter);
    }
}