import java.time.LocalDateTime;

public class FixedDepositAccount extends BankAccount {

    Float interest = 0.0f;
    Integer duration = 3;
    boolean interestHasBeenChanged = false;
    boolean durationHasBeenChanged = false;

//not sure if constructors are created correctly 
    public FixedDepositAccount(String name, Float balance) {
        super(name,balance);
    }
    
    public FixedDepositAccount(String name, Float balance, Float interest){
        super(name, balance);
        this.interest = interest;
    }
    
    public FixedDepositAccount(String name, Float balance, Float interest, Integer duration){
        super(name, balance);
        this.interest = interest;
        this.duration = duration;
    }


    public Float getInterest() {
        return interest;
    }

    public void setInterest(Float interest) {
        if (interestHasBeenChanged){
            throw new IllegalArgumentException ();
        } else {
            this.interest = interest;
            interestHasBeenChanged = true;
        }
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        if (durationHasBeenChanged){
            throw new IllegalArgumentException ();
        } else {
            this.duration = duration;
            durationHasBeenChanged = true;
        }
    }

    @Override // still able to use setBalance from parent class - to ensure it cannot be changed: override setBalance
    public void setBalance(float balance) {
        throw new IllegalArgumentException ("balance is set, it cannot be changed");
    }

    @Override
    public float getBalance() {
        float balance = ((interest/100) * super.getBalance()) + super.getBalance();
        System.out.printf("%s's balance with interest is %f", getName(), balance);
        return balance;
    }

    @Override
    public void deposit(float depositAmount) {
    }

    @Override
    public void withdraw(float withdrawAmount) {
    }


}
