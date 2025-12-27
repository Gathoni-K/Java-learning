/*
-Write a block of code testing on mixed chaining.
-Create Account class with accountNumber
-SavingsAccount extends Account with interestRate

-Requirements:
-Account only has a parameterized constructor.
-SavingsAccount must allow; full info, account number only
*/


package Notes.Constructor;

public class Account {
    int accountNumber;

    public Account(int accountNumber){
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString(){
        return "Account number: " + accountNumber;
    }
}
    public class SavingsAccount extends Account {
    String name;
    double interestRate; // optional, can add later

    // Full info constructor
    public SavingsAccount(String name, int accountNumber){
        super(accountNumber); // call Account constructor
        this.name = name;
    }

    // Account number only constructor
    public SavingsAccount(int accountNumber){
        super(accountNumber);
        this.name = "Unknown";
    }

    @Override
    public String toString(){
        return super.toString() + ", Name: " + name;
    }

    public static void main(String[] args){
        SavingsAccount user1 = new SavingsAccount("Buddy", 292324);
        SavingsAccount user2 = new SavingsAccount(123456);

        System.out.println(user1);
        System.out.println(user2);
    }
}
