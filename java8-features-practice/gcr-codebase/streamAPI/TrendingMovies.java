package streamAPI;

import java.util.*;

class Movie {
    String name;
    double rating;
    int releaseYear;

    Movie(String name, double rating, int releaseYear) {
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }
}

public class TrendingMovies {

    public static void main(String[] args) {

        List<Movie> movies = List.of(
                new Movie("MovieA", 9.1, 2024),
                new Movie("MovieB", 8.5, 2023),
                new Movie("MovieC", 9.3, 2022),
                new Movie("MovieD", 8.9, 2024),
                new Movie("MovieE", 9.0, 2023),
                new Movie("MovieF", 8.2, 2021)
        );

        movies.stream()
              .filter(m -> m.releaseYear >= 2022)
              .sorted(Comparator.comparingDouble((Movie m) -> m.rating).reversed())
              .limit(5)
              .forEach(m -> System.out.println(m.name + " - " + m.rating));
    }
}

