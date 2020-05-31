package coding.bat.javastart.enums;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MovieCategory romantic = MovieCategory.ROMANTIC;
        MovieCategory horror = MovieCategory.HORROR;
        int i = romantic.compareTo(horror);
        System.out.println(i);

        List<Movie> movies = Arrays.asList(
                new Movie("Titanic", MovieCategory.ROMANTIC),
                new Movie("Matrix", MovieCategory.SCI_FI),
                new Movie("Jurassic Park", MovieCategory.SCI_FI),
                new Movie("The Saw", MovieCategory.HORROR));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj gatunek, dostepne to: ");

        MovieCategory[] movieCategories = MovieCategory.values();

        for(MovieCategory movieCategory :movieCategories){
            System.out.println(movieCategory.name());
        }
        String userInput = scanner.nextLine();

        MovieCategory movieCategory = MovieCategory.valueOf(userInput);

        System.out.println("Filmy z tej kategorii");

        for(Movie movie : movies){
            if(movie.getMovieCategory() == movieCategory)
            System.out.println(movie.getTitle() + " " + movie.getMovieCategory());
        }
    }
    }