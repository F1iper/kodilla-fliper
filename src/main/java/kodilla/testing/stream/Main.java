package kodilla.testing.stream;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        People.getList()
                .stream()
                .filter(s -> s.length() >11)
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));

//        People.getList()                       //wywolanie metody statycznej
//                .stream()                      //wywolanie strumienia
//                .map((s) -> s.toUpperCase())   //wywolanie metody map(Function mapper) przyjmuje ona wyrazenie lambda
//                .forEach(System.out::println); // for each to operacja terminalna

        People.getNumbers()                     //wywolanie metody statycznej getNumbers znajdujacej sie w klasie People
                .stream()                       //wywolanie strumienia
                .mapToDouble(i -> i += i *i)    //operacja na strumieniu, tworzony zostaje nowy obiekt
                .filter(i -> i > 5)
                .forEach(System.out::println);  //wywolanie metody forEach, czyli wyswietlenie kazdego obiektu ze zwracanej listy

        People.getList()
                .stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);  //METHOD REFERENCE, zamiennie z wyrazeniem lambda


//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//
//        poemBeautifier.beautify("This is going to be beautifull", (s) -> System.out.println(s.toUpperCase()));
//        poemBeautifier.beautify("This is sentence number two", (s) -> System.out.println("*** " + s + " ***"));
//        poemBeautifier.beautify("An0tH3r type 0f s3nt3nc3",
//                (s) -> System.out.println(s.replace("0", "o").replace("3", "e")));
//        poemBeautifier.beautify("sentence number four",
//                (s) -> System.out.println(s.substring(8, 16).toUpperCase().concat("") + s + s.substring(8, 16).toUpperCase().concat("")));
//
//
    }
}
