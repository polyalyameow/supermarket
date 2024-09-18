public interface Product {
    String name = "unknown";
    double price = 0;
    // String category = "unknown";

    double priceWithTaxes(double price);

    void productInfo();

    double getPrice();
}