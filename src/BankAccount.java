import java.time.LocalDateTime;
import java.util.ArrayList;

public class BankAccount {

    private String name;
    private String accountNumber;
    private float balance;
    private boolean accountClosed;
    private final LocalDateTime createdDate;
    private LocalDateTime closingDate;

    ArrayList<String> transactionList = new ArrayList<String>();

    public BankAccount(String name) {
        this.name = name;
        balance = 0;
        accountNumber = Double.toString(100*Math.random()); // convert double to string
        accountClosed = false; 
        createdDate = LocalDateTime.now();
    }

    public BankAccount(String name, float balance) {
        this(name);
        this.balance = balance; 
    }

    public String getName() {
        return this.name;
    }

    // not providing setter for name and number - ensures they wont be changed

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public boolean getAccountClosed() {
        return this.accountClosed;
    }

    public void setAccountClosed() {
        accountClosed = true;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public LocalDateTime getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(LocalDateTime closingDate) {
        this.closingDate = closingDate;
    }

    public void deposit(float depositAmount) {
        if((depositAmount <= 0) || (accountClosed == false)){
            throw new IllegalArgumentException("deposit amount must be greater than zero");
        } else {
            balance =+ depositAmount;
            String depositStatement = "Deposit of" + depositAmount + " at " + LocalDateTime.now();
            transactionList.add(depositStatement);
            System.out.println(transactionList);
        }
    }

    public void withdraw(float withdrawAmount) {
        if((withdrawAmount <= 0) || (accountClosed == false)){
            throw new IllegalArgumentException("withdrawal amount must be greater than zero");
        } else {
            balance =- withdrawAmount;
            String withdrawStatement = "Withdrawal of" + withdrawAmount + " at " + LocalDateTime.now();
            transactionList.add(withdrawStatement);
            System.out.println(transactionList);
        }
    }
}
