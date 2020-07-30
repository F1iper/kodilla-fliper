package collections;

import java.util.*;

public class Lesson1 {

    //todo: Java w bibliotece standardowej zawiera zestaw kolekcji, kolekcja to nic innego jak sposób
    // grupowania obiektów, kolekcją można nazwać również tablicę obiektów, kolekcje można opisać jako
    // tablicę na sterydach, rodzaj kolekcji /struktury danych pozwala napisać program,
    // który jest bardziej lub mniej wydajny.

    //todo: Kolekcje w standardowej bilbiotece Javy implementują różne interfejsy

    //Todo: List -> grupuje elementy, nie trzeba definiować jej rozmiaru, jest on automatycznie
    // powiększany wraz z dodawaniem nowych elementów, listy w Javie reprezentowane są przez
    // interfejs java.util.List, Listy są kolekcjami, dla których kolejność elementów ma znaczenie,
    // mogą przechowywać ten sam element więcej niż raz, przykładami implementacji
    // interfejsu java.util.List są : java.util.LinkedList oraz java.util.ArrayList,
    // LinkedList lepiej jest używać jeśli często usuwamy elementy z listy,
    // a ArrayList kiedy chcesz mieć szybki dostęp do losowych elementów w liście.

    //todo: interface List<E> extends Collection<E>

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("first");
        lista.add("second");
        System.out.println(lista.get(0));

        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        System.out.println(numbers);
        numbers.remove(4);
        System.out.println(numbers);

        boolean isEmpty = numbers.isEmpty();
        System.out.println(isEmpty);

        for(Integer number : numbers) {
            System.out.println(number);
        }
    }
}
