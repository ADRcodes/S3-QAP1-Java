public class TestAccount {
    public static void main(String[] args) {
        Account account1 = new Account("12332", "Ralix Aussell", 5000);
        Account account2 = new Account("456", "Allison Brown", 4000);

        System.err.println("Account 1: " + account1.getBalance());
        System.err.println("Account 2: " + account2.getBalance());

        account1.transferTo(account2, 1000);

        System.err.println("Account 1: " + account1.getBalance());
        System.err.println("Account 2: " + account2.getBalance());
    }
}
