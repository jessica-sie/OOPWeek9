import java.util.ArrayList;

public class Bank {
    // ATTRIBUTES 
    private String bankName;
    private int numberOfCustomers;
    private ArrayList<Customer> customers = new ArrayList<Customer>();//REFERENCE to an array of customers - each element has the Customer user defined data type 

    // METHODS
    // constructor
    public Bank (String bName){
        this.bankName = bName;
        this.numberOfCustomers = 0;

    }

    public void addCustomer(String custFN, String custLN){
        // add to customers arraylist
        Customer newCust = new Customer(custFN, custLN);
        customers.add(newCust);
        this.numberOfCustomers++;
    }

    public int getNumOfCustomers(){
        return this.numberOfCustomers;
    }

    public Customer getCustomer(int index){
        return this.customers.get(index);
    }

}
