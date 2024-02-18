package Bank;

public class Account {
    private  int balance;
    private String accountName;
    private String expectedPin;
    private  static int  nextAccountNumber = 1;
    private int accountNumber;

    public Account(String accountName) {
        this.accountNumber = nextAccountNumber++;
        this.balance = 0;
        this.accountName = accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int depositAmount) {
        balance += depositAmount;
    }

    public void withdraw(int amount) {
        if(balance <= 0){
            throw new IllegalArgumentException("Invalid withdraw amount");
        }
        if(balance >= amount){
            balance -= amount;
        }else{
            throw new IllegalArgumentException("Insufficient funds");
        }

    }

    public String getName() {
        return accountName;
    }

    public void setPin(String expectedPin) {
        this.expectedPin = expectedPin; 
    }

    public String getPin() {
        return expectedPin;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
