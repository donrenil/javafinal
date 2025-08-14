// Q4.2 - total savings across all purchases
public double getTotalSavings() {
    return purchases.stream()
            .mapToDouble(p -> p.getMsrp() - p.getSalePrice())
            .sum();
}

// Q4.3 - true if saved $5 or more on all purchases
public boolean savedFiveOrMoreOnEveryPurchase() {
    return purchases.stream()
            .allMatch(p -> (p.getMsrp() - p.getSalePrice()) >= 5.0);
}
