public class Account {
    // ATTRIBUTES 
    private double balance;

    // METHODS
    // constructor - function uses name of the class to initialize variables 
    public Account(double balanceInitial){
        this.balance = balanceInitial;
    } 

    public double getBalance(){
        return this.balance;
    }

    public boolean deposit(double amt){
        if(amt>0){
            this.balance +=amt;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean withdraw(double amt){
        if(amt<=this.balance){
            this.balance-=amt;
            return true;
        }
        else{
            return false;
        }
        
    }







}
