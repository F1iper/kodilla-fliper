package kodilla.testing.stream;

import java.util.ArrayList;
import java.util.List;

public final class People {

    public static List<String> getList() {
        final List<String> theList = new ArrayList<>();
        theList.add("John Smith");
        theList.add("Dorothy Newman");
        theList.add("John Wolkowitz");
        theList.add("Lucy Riley");
        theList.add("Owen Rogers");
        theList.add("Matilda Davies");
        theList.add("Declan Booth");
        theList.add("Corinne Foster");
        theList.add("Khloe fry");
        theList.add("Martin Valenzuela");
        return new ArrayList<>(theList);
    }

        public static List<Integer> getNumbers(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        return new ArrayList<>(numbers);
    }
}