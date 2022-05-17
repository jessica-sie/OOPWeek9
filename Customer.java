import java.lang.String;

public class Customer{
    // ATTRIBUTES 
    private String firstName;
    private String lastName;
    private Account account;

    
    // METHODS
    // constructor
    public Customer(String f,String l){
        this.firstName = f;
        this.lastName = l;
        this.account = new Account(0);// initialize an account
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
    
    public Account getAccount(){
        return this.account;
    }

    public void setAccount(Account acct){
        this.account = acct;
        
    }


}