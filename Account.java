package contaBancaria;
public class Account {

    private  String holder;
    private  int accountNumber;
    private  double balance;

    public Account(String holder, int accountNumber, double balance) {
        this.holder = holder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //Getters Setters
    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
