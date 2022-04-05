public class Account {
    //attributes
    private int accountNum;
    private String ownerName;
    private double balance;

    //constructor - פעולה בונה
    public Account(int accountNum, String ownerName,
                   double balance){
        this.accountNum = accountNum;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount; //this.balance = this.balance - amount

    }

    public int getAccountNum() {
        return accountNum;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }
}
