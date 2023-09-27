package Shopping;

public abstract class Product {

    private String name;
    private double price;


    Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public abstract String getDetails();
}
