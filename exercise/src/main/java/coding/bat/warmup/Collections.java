package coding.bat.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

    public static void main(String[] args) {
        //it holds references to other objects
        //it is dynamic - can change size

        String[] things = {"eggs", "lasers", "hats", "pie"};
        List<String> list1 = new ArrayList<>();

        //add array items to list
        for (String x : things) {
            list1.add(x);
        }

        String [] moreThings = {"lasers", "hats"};
        List<String> list2 = new ArrayList<>();
        for(String y : moreThings) {
            list2.add(y);
        }
            for(int i = 0; i< list2.size(); i++){

        }
            String [] names = {"Joe", "Rambo", "Chuck"};

            List<String> list = new ArrayList<>(Arrays.asList(names));
        System.out.println(list);
    }
}
