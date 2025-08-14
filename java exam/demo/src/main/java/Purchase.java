package app;

/*
 * Name: Don Renil Moonjanattu Devasia
 * Student Number: 200620704
 */

public class Purchase {
    private final String name;
    private final double msrp;
    private final double salePrice;
    private final String imageUrl;

    public Purchase(String name, double msrp, double salePrice) {
        this(name, msrp, salePrice, null);
    }

    public Purchase(String name, double msrp, double salePrice, String imageUrl) {
        this.name = name;
        this.msrp = msrp;
        this.salePrice = salePrice;
        this.imageUrl = imageUrl;
    }

    public String getName()        { return name; }
    public double getMsrp()        { return msrp; }
    public double getSalePrice()   { return salePrice; }
    public String getImageUrl()    { return imageUrl; }

    public double getSavings() {
        return Math.max(0.0, msrp - salePrice);
    }

    public String toDisplayString() {
        return String.format("%s - $%.2f", name, salePrice);
    }
}
