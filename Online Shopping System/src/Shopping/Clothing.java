package Shopping;

public class Clothing extends Product {

    private String size;
    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public String getSize(){
        return size;
    }

    @Override
    public String getDetails(){
        return "Clothing: " + getName() +
                "\nPrice: $" + getPrice() +
                "\nSize: " + getSize();
    }
}
