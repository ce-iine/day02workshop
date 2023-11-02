public class Main {
    public static void main (String[] args){
        
        BankAccount acc1 = new BankAccount("celineng");
        BankAccount acc2 = new BankAccount("cc", 100);
// test deposit statements and negative deposit amount 
        acc1.deposit(100);
        acc1.deposit(-20);
        acc1.withdraw(30);

        acc2.deposit(100);
        acc2.withdraw(80);
        acc2.withdraw(-10);

// test name and account number cannot be changed - cannot get setter because not created, makes it difficult to update 


        FixedDepositAccount fixedacc1 = new FixedDepositAccount("ccc", null);
        FixedDepositAccount fixedacc2 = new FixedDepositAccount("abc", 100.0f, 3.0f);
        FixedDepositAccount fixedacc3 = new FixedDepositAccount("celinen", 200.0f, 5.0f, 6);

// test deposit and withdraw function - should do nothing, balance should be same
// test if interest is 3 and balance is 100, the getBalance() should return 103 - fixed acc2
        fixedacc1.deposit(100);
        fixedacc2.withdraw(20);

        fixedacc1.getBalance();
        fixedacc2.getBalance();

// test that duration and interest can only be updated once
        fixedacc1.setDuration(3); // should succeed
        fixedacc1.setDuration(5); // should fail 
        fixedacc1.setInterest(5.0f); // should succeed
        fixedacc3.setDuration(2); //should fail - alr initialised in acc creation
        fixedacc2.setInterest(3.4f); // should fail - alr initialised in acc creation


        //fixedacc1.setBalance(); // should not be able to change 
        

    }
}
