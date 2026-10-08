import java.util.Scanner;
class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public void deposit(double amount){
        if (amount>0)
        {
            balance+= amount;
        }
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance=balance-amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    public double checkBalance() {
        return balance;
    }
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }
}
public class Hackathon2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(accountNumber, accountHolderName, initialBalance);
        System.out.print("Enter Deposit Amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        System.out.print("Enter Withdrawal Amount: ");
        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);
        System.out.println("\n--- Final Account Details ---");
        account.displayAccount();
        scanner.close();
    }
}
