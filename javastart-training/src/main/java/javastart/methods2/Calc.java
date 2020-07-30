package javastart.methods2;

public class Calc {

    //typ_zwracany nazwaMetody (opcjonalne_parametry) { ciało metody}
    //jeżeli metoda ma typ zwracany to musi w ciele posiadać słowo kluczowe return.

    int addNumbers(int a, int b, int c) {
        return a + b + c;
    }

    void addThreeNumbers(int a, int b, int c) {
        int result = addNumbers(a, b, c);
        System.out.println(result);
    }
}
