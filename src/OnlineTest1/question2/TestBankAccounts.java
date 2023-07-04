package OnlineTest1.question2;

public class TestBankAccounts {
    public static void main(String[] args) {
        Account account1 = new Account("s001","Tom Huynh", 100);
        System.out.println(account1);
        Account account2 = new Account("s002","Phong Ngo");
        System.out.println(account2);

        SavingAccount account3 = new SavingAccount("s003","Robert Williams III",200,0.2);
        System.out.println(account3);

        System.out.println("\nTesting Getter Methods:");
        System.out.println("ID: " + account1.getId());
        System.out.println("Name: " + account1.getName());
        System.out.println("Balance: " + account1.getBalance());

        System.out.println("\nCredit and Debit Testing");
        account1.credit(100);
        System.out.println(account1);
        account1.debit(50);
        System.out.println(account1);
        account1.debit(500);
        System.out.println(account1);


        System.out.println("\nTransfer Money Testing ($25): ");
        account1.transferTo(account2,25);
        System.out.println(account1);
        System.out.println(account2);

        System.out.println("\nSaving Account Testing (Calculate Interest Amount): ");
        System.out.println(account3);
        account3.calculateInterestAmount();
        System.out.println(account3);



    }
}
