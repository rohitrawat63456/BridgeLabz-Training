package streamAPI;

import java.util.*;

public class NameTransformer {

    public static void main(String[] args) {

        List<String> names = List.of("rahul", "amit", "suresh");

        names.stream()
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);
    }
}

