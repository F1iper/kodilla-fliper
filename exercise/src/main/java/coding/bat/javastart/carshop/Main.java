package coding.bat.javastart.carshop;

public class Main {
    public static void main(String[] args) {


        int n = 20;

        int magic = 0;
        while (n > 0) {
            n /= 10;
            magic++;
            System.out.println(magic);
        }
    }
}