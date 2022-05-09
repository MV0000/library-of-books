package practise.lesson_11_collections.lessoncode;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        //Map
        // key,     value
        // Integer, Object
        // 1 - add
        // 2 - remove
        // 3 - find
        //

        //Map
        // key,     value
        // String, Book
        // "Author1" - "Book{author=Author1}"
        // "Author2" - "Book{author=Author2}"
        // "Author3" - "Book{author=Author3}"
        //

        Map<Integer, String> operations = new HashMap<>();

        operations.put(1, "Add Something");
        operations.put(2, "Remove Something");
        operations.put(3, "Find Something");
        operations.put(4, "Sort Something");

        for (Integer integer : operations.keySet()) {
            System.out.println("Key - " + integer);
        }

        for (String value : operations.values()) {
            System.out.println("Value - " + value);
        }

        for (Map.Entry<Integer, String> entry : operations.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        String operation = operations.get(3);

        System.out.println(operation);
    }
}
