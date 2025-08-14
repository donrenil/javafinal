package app;

/*
 * Name: Don Renil Moonjanattu Devasia
 * Student Number: 200620704
 */

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Purchase> buys = List.of(
                new Purchase("Item1", 10.00, 9.00),   // $1 saved
                new Purchase("Item2", 20.00, 15.00)   // $5 saved
        );

        Customer c = new Customer(1, "Test", "User", "555-0000", buys);

        // Q4.2
        System.out.println("Total savings = " + c.getTotalSavings()); // expected 6.0

        // Q4.3
        System.out.println("Saved $5+ on every purchase? " + c.savedFiveOrMoreOnEveryPurchase()); // expected false
    }
}
