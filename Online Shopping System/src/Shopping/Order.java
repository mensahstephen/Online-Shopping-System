package Shopping;

import java.util.ArrayList;
import java.util.List;

public class Order {

    List<Product> orderList;

    Order(){
        orderList = new ArrayList<>();
    }
    Order(List<Product> List){
        orderList = new ArrayList<>(List);
    }
    public void addProduct(Product product) {
        orderList.add(product);
    }

    public String displayOrderDetails() {

        StringBuilder sb = new StringBuilder();
        sb.append("Order Details:\n");

        for (int i = 0; i < orderList.size(); i++) {
            sb.append("Item " + (i + 1) + ":\n");
            sb.append(orderList.get(i).getDetails() + "\n");
            sb.append("------------\n");
        }

        sb.append("Total Cost: $" + String.format("%.2f", calculateTotalCost()));

        return sb.toString();
    }

    public double calculateTotalCost() {

        double sum = 0.0;

        for(int i = 0; i < orderList.size(); i++){
            sum += orderList.get(i).getPrice();
        }

        return sum;
    }
}
