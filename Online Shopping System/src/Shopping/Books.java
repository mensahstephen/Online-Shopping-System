package Shopping;

public class Books extends Product {
    private String author;
    public Books(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    @Override
    public String getDetails(){
        return "Clothing: " + getName() +
                "\nPrice: $" + getPrice() +
                "\nAuthor: " + getAuthor();
    }
}
