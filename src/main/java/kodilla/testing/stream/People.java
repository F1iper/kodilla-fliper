package kodilla.testing.stream;

import java.util.ArrayList;
import java.util.List;

public final class People {

    public static List<String> getList(){
        final List<String> theList = new ArrayList<>();
        theList.add("John Doe");
        theList.add("Jessica Simpson");
        theList.add("John Rambo");
        theList.add("Hannibal");
        return new ArrayList<> (theList);
    }

    public static void main(String[] args) {


    }

}
