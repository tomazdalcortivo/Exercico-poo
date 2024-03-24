public class Account {
    private final int accountNumb;
    private String name;
    private double balance = 0;

    public Account(int accountNumb, String name) {
        this.accountNumb = accountNumb;
        this.name = name;
    }

    public Account(int accountNumb, String name, double initialDeposit) {
        this.accountNumb = accountNumb;
        this.name = name;
        deposit(initialDeposit);
    }

    public String getName() {
        return name;
    }
    public int getAccountNumb() {
        return accountNumb;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void withdrawal(double amount) {
        balance -= amount + 5;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return "Accont " + accountNumb + ", holder: " + getName() + ", Balance $ " + getBalance();
    }
}
