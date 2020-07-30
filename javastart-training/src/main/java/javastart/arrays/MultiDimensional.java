package javastart.arrays;

public class MultiDimensional {
    public static void main(String[] args) {
        double[][] tab = {
                {1.0, 1.5, 2.0},
                {1.5, 2.0, 2.5},
                {2.0, 2.5, 3.0}
        };

        double result = tab[0][0] * tab[1][1] * tab[2][2] + tab[2][0] * tab[1][1] * tab[0][2];
        System.out.println(result);

        double multiply = (tab[0][1] + tab[1][1] + tab [1][2]) * (tab[0][1] + tab[1][1] + tab[2][1]);
        System.out.println(multiply);

        double sumEdge = tab[0][0] + tab[0][1] + tab[0][2] + tab[1][0] + tab[1][2] +
                tab[2][0] + tab[2][1] + tab[2][2];
        System.out.println(sumEdge);
    }
}