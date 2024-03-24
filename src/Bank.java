import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double initialDeposit = 0;

        System.out.println("Enter account number: ");
        int accountNumber = reader.nextInt();

        System.out.println("Enter account holder: ");
        String accountHolder = reader.next();

        System.out.print("Do you want to make an initial deposit? (y/n): ");
        char depositChoice = reader.next().charAt(0);

        Account account1;

        if (depositChoice == 'y') {
            System.out.println("Enter initial deposit value: ");
            initialDeposit = reader.nextDouble();
            account1 = new Account(accountNumber, accountHolder, initialDeposit);
        } else {
            account1 = new Account(accountNumber, accountHolder);
        }

        System.out.println("Account data \n" + account1);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        account1.withdrawal(reader.nextDouble());
        System.out.println("Updated account data: \n" + account1);


        System.out.println();
        System.out.println("Enter a deposit value: ");
        account1.deposit(reader.nextDouble());
        System.out.println("Updated account data: \n" + account1);

        reader.close();
    }
}
