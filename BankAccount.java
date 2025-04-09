package demo;
class BankAccount {
    private String accountName;
    private String accountType;
    private double balance;
    private static int totalAccounts = 0; // Static variable to track total accounts

    // Constructor 1: Only account name
    public BankAccount(String accountName) {
        this.accountName = accountName;
        this.accountType = "Savings"; // Default account type
        this.balance = 0; // Default balance
        totalAccounts++;
    }

    // Constructor 2: Account name and initial deposit
    public BankAccount(String accountName, double initialDeposit) {
        this.accountName = accountName;
        this.accountType = "Savings"; // Default account type
        this.balance = initialDeposit;
        totalAccounts++;
    }

    // Constructor 3: Account name, initial deposit, and account type
    public BankAccount(String accountName, double initialDeposit, String accountType) {
        this.accountName = accountName;
        this.accountType = accountType;
        this.balance = initialDeposit;
        totalAccounts++;
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Rs." + amount + ". New balance: Rs." + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Overloaded method to deposit with transaction type
    public void deposit(double amount, String transactionType) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Rs." + amount + " via " + transactionType + ". New balance: Rs." + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Static method to display total accounts
    public static void displayTotalAccounts() {
        System.out.println("Total accounts created: " + totalAccounts);
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: Rs." + balance);
    }

    public static void main(String[] args) {
        // Creating accounts using different constructors
        BankAccount account1 = new BankAccount("Alice");
        BankAccount account2 = new BankAccount("Bob", 5000);
        BankAccount account3 = new BankAccount("Charlie", 10000, "Current");

        // Displaying account details
        account1.displayAccountDetails();
        account2.displayAccountDetails();
        account3.displayAccountDetails();

        // Performing deposits
        account1.deposit(1000);
        account2.deposit(2000, "Cheque");
        account3.deposit(5000, "Cash");

        // Displaying total accounts created
        BankAccount.displayTotalAccounts();
    }
}
