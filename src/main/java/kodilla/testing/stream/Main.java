package kodilla.testing.stream;

public class Main {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("This is going to be beautifull", (s) -> System.out.println(s.toUpperCase()));
        poemBeautifier.beautify("This is sentence number two", (s) -> System.out.println("*** " + s + " ***"));
        poemBeautifier.beautify("An0tH3r type 0f s3nt3nc3",
                (s) -> System.out.println(s.replace("0", "o").replace("3", "e")));
        poemBeautifier.beautify("sentence number four",
                (s) -> System.out.println(s.substring(8, 16).toUpperCase().concat("") + s + s.substring(8, 16).toUpperCase().concat("")));

    }
}
