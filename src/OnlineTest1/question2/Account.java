package OnlineTest1.question2;

public class Account {
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Account (String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double amount) {
        double credit = this.getBalance() + amount;
        this.balance = credit;
    }
    public void debit(double amount) {
        if (amount <= this.getBalance()) {
            double debit = this.getBalance() - amount;
            this.balance = debit;
        } else {
            System.out.println("The debit amount is larger than the balance");
        }
    }

    public void transferTo(Account another, double amount) {
        double Acc1 = this.getBalance() - amount;
        another.balance += amount;
        this.balance = Acc1;
    }
    public String toString() {
        return String.format("Account: id = %s, name= %s, balance = %.2f",this.getId(),this.getName(),this.getBalance());
    }
}
