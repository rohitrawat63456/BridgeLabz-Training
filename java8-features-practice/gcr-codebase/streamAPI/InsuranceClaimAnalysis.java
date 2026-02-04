package streamAPI;

import java.util.*;
import java.util.stream.Collectors;

class Claim {
    String claimType;
    double claimAmount;

    Claim(String claimType, double claimAmount) {
        this.claimType = claimType;
        this.claimAmount = claimAmount;
    }
}

public class InsuranceClaimAnalysis {

    public static void main(String[] args) {

        List<Claim> claims = List.of(
                new Claim("Health", 5000),
                new Claim("Health", 8000),
                new Claim("Vehicle", 12000),
                new Claim("Vehicle", 10000)
        );

        Map<String, Double> averageClaims =
                claims.stream()
                      .collect(Collectors.groupingBy(
                              c -> c.claimType,
                              Collectors.averagingDouble(c -> c.claimAmount)
                      ));

        averageClaims.forEach((type, avg) ->
                System.out.println(type + " : " + avg)
        );
    }
}

