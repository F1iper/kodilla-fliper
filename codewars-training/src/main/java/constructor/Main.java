package constructor;

public class Main {
    
    
    public static int sum (int[] arr) { // 5
        int counter = 0;
        if (arr.length <= 0)
            return 0;
        else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    counter += i;
                }
            }
        }
        return counter;
    }
}