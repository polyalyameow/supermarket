public class Fruits implements Product {
    private String name;
    private double price;
    private String category;

    public Fruits(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = "Fruit";
    }

    @Override
    public double priceWithTaxes() {
        double taxrate = 0.12;
        return price + (price * taxrate);
    }

    @Override
    public void productInfo() {
        String lineBreak = System.lineSeparator();
        System.out.println("Information about product" + lineBreak
                + "Category: " + category + lineBreak
                + "Product: " + name + lineBreak
                + "Price: " + price + lineBreak);
    }

}
