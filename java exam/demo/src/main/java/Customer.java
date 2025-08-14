package app;

/*
 * Name: Don Renil Moonjanattu Devasia
 * Student Number : 200620704
 */

import java.util.List;

public class Customer {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String phone;
    private final List<Purchase> purchases;

    public Customer(int id, String firstName, String lastName, String phone, List<Purchase> purchases) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.purchases = purchases;
    }

    // --- Getters (useful for TableView later) ---
    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPhone() { return phone; }
    public List<Purchase> getPurchases() { return purchases; }

    // Q4.2 — sum of savings across all purchases
    public double getTotalSavings() {
        return purchases.stream()
                .mapToDouble(p -> p.getMsrp() - p.getSalePrice())
                .sum();
    }

    // Q4.3 — true if saved $5 or more on EVERY purchase
    public boolean savedFiveOrMoreOnEveryPurchase() {
        return !purchases.isEmpty() &&
                purchases.stream().allMatch(p -> (p.getMsrp() - p.getSalePrice()) >= 5.0);
    }

    // Helpers for later questions
    public double getTotalMsrp() {
        return purchases.stream().mapToDouble(Purchase::getMsrp).sum();
    }

    public double getTotalSale() {
        return purchases.stream().mapToDouble(Purchase::getSalePrice).sum();
    }

    public double getTotalPurchases() {
        return getTotalSale();
    }

    public String getTotalPurchasesFormatted() {
        return String.format("$%.2f", getTotalPurchases());
    }

    // Alternative useful for filtering (total savings >= $5)
    public boolean hasSavedAtLeastFiveTotal() {
        return getTotalSavings() >= 5.0;
    }
}
