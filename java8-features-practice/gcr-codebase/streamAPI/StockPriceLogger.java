package streamAPI;

import java.util.*;

public class StockPriceLogger {

    public static void main(String[] args) {

        List<Double> stockPrices = List.of(120.5, 118.3, 122.0);

        stockPrices.forEach(price ->
                System.out.println("Stock Price: " + price)
        );
    }
}

