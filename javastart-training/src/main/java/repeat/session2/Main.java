package repeat.session2;

public class Main {
    public static void main(String[] args) {
    int number = 50;
        System.out.println("number before: " + number);
        System.out.println("number after: " + number);

        Number num = new Number();
        num.number = 50;
        System.out.println("Obiekt liczby przed " + num.number);
        change(num);
        System.out.println("Obiekt liczby po " + num.number);
    }

    public static void change(int num) {
        num = -1;
        System.out.println("number after: " + num   );
    }

    public static void change(Number num2) {
        num2.number = -1;
    }
}
