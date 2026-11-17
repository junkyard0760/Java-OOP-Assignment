
class Main {

    public static void main(String args[]) {

        BankAccount account1 = new BankAccount(101, "Rahul", 5000);
        BankAccount account2 = new BankAccount(102, "Aman", 10000);

    
        System.out.println("----- Account 1 -----");

        account1.deposit(2000);
        account1.withdraw(1000);
        account1.checkBalance();

        System.out.println("\n----- Account 2 -----");

        account2.deposit(3000);
        account2.withdraw(2000);
        account2.checkBalance();
        
        System.out.println("\n----- Final Account Details -----");

        System.out.println("\nAccount 1:");
        account1.displayDetails();

        System.out.println("\nAccount 2:");
        account2.displayDetails();
    }
}
