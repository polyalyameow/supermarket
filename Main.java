public class Main {
    public static void main(String[] args) {
        Product banana = new Fruits("Banana", 0.34);
        Product beer = new Beverages("Mariestads", 3.50);
        Product yoghurt = new Dairy("Greek Yoghurt", 2.50);

        Cart cart = new Cart();
        cart.addProduct(banana);
        cart.addProduct(beer);
        cart.addProduct(yoghurt);

        cart.displayCart();
        double totalPrice = cart.getTotalPrice();
        System.out.println("Total amount: " + totalPrice);

        Checkout.checkout(totalPrice);
    }

}
