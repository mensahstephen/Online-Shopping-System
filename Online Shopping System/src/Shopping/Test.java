package Shopping;

public class Test {
    public static void main(String[] args) {
        // Create products
        Product electronics = new Electronics("Smartphone", 799.00, "Apple");
        Product clothing = new Clothing("T-shirt", 29.99, "Medium");
        Product book = new Books("Java Programming", 49.99, "John Smith");

        // Create customer
        Customer customer = new Customer("Alice Johnson", "1990-03-25", "C123");

        // Create and process order
        Order order = new Order();
        order.addProduct(electronics);
        order.addProduct(clothing);
        order.addProduct(book);

        // Display product details
        System.out.println(electronics.getDetails());
        System.out.println("-----------------------");

        System.out.println(clothing.getDetails());
        System.out.println("-----------------------");
        System.out.println(book.getDetails());
        System.out.println("-----------------------");

        // Display order details and total cost
        System.out.println(customer.displayUserInfo());
        System.out.println("-----------------------");
        System.out.println(order.displayOrderDetails());
        System.out.println("-----------------------");
        System.out.println("Total Cost: $" + order.calculateTotalCost());
    }
}
