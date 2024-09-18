import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.priceWithTaxes();
        }

        return total;
    }

    public void displayCart() {
        for (Product product : products) {
            product.productInfo();
            System.out.println("----------------");
            
        }
    }
}
