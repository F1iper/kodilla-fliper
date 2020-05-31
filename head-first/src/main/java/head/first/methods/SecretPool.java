package head.first.methods;

public class SecretPool {
    public static void main(String[] args) {

        SecretPool4b[] poolArray = new SecretPool4b[6];
        int y = 1;
        int x = 0;
        int result = 0;
        while (x < 6) {
            poolArray[x] = new SecretPool4b(); // at index X -> create new Object of type SecretPool4b
            poolArray[x].point = y; //field point of object of type SecretPool4b is assigned to y;
            y *= 10;            // y = y * 10 // while y 1 = 10, then 100, then 1000, then 10000, then 100000
            x++;    //next index of array
        }

        x = 6;
        while (x > 0) {
            x--;
            result += poolArray[x].doSomething(x);
        }
        System.out.println("Result: " + result);
    }
}

class SecretPool4b {
    int point;

    public int doSomething(int factor) {
        if (point > 100) {
            return point * factor;
        } else {
            return point * (5 - factor);
        }
    }
}