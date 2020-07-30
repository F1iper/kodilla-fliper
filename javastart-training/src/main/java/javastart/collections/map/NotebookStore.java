package javastart.collections.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NotebookStore {

    public static void main(String[] args) {

        Map<Notebook, Integer> notebooks = new HashMap<>();
        notebooks.put(new Notebook("Apple", "B590"), 12);
        notebooks.put(new Notebook("Dell", "Inspiron0211A"), 3);
        notebooks.put(new Notebook("HP", "G2A33EA"), 8);
        notebooks.put(new Notebook("HP", "G2A33EA"), 9);
        notebooks.put(new Notebook("Dell", "XPS0091V"), 6);

        Set<Map.Entry<Notebook, Integer>> entries = notebooks.entrySet();
        for (Map.Entry<Notebook, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Set<String> names = new HashSet<>();
        for (int i = 0; i <= 10; i++) {
            names.add("name " + i);
        }
        System.out.println(names);
    }


}