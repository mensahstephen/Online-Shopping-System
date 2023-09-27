package Shopping;

import java.util.Date;

public class Customer {

    private String name;
    private String dateOfBirth;
    private String customerID;

    public Customer(String name, String dateOfBirth, String customerID) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }
    public String getDateOfBirth() {

        return dateOfBirth;
    }
    public String getCustomerID() {
        return customerID;
    }



    public String displayUserInfo() {
        return "Customer: " + getName() +
                "\nDate of Birth: " + getDateOfBirth() +
                "\nCustomerID: " + getCustomerID();
    }
}
