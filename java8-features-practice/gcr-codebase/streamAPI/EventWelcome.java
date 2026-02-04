package streamAPI;

import java.util.*;

public class EventWelcome {

    public static void main(String[] args) {

        List<String> attendees = List.of("Rohit", "Aman", "Neha");

        attendees.forEach(name ->
                System.out.println("Welcome to the event, " + name)
        );
    }
}

