public class Beverages implements Product {
    private String name;
    private double price;
    private String category;

    public Beverages(String name, double price) {
        this.name = name;
        this.price = priceWithTaxes(price);
        this.category = "Beverages";
    }

    @Override
    public double priceWithTaxes(double price) {
        double taxrate = 0.12;
        double result = price + (price * taxrate);
        return Math.round(result * 100.0) / 100.0;
    }

    @Override
    public void productInfo() {
        String lineBreak = System.lineSeparator();
        System.out.println("Information about product" + lineBreak
                + "Category: " + category + lineBreak
                + "Product: " + name + lineBreak
                + "Price: " + price + lineBreak);
    }

    @Override
    public double getPrice() {
        return price;
    }

}
