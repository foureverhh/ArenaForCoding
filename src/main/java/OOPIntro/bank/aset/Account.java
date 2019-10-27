package OOPIntro.bank.aset;

public class Account {
    private static double amount;
    private static double interest;
    private static Account account = null;

    private Account(double amount,double interest){
        Account.amount = amount;
        Account.interest = interest;
    }

    public static Account getInstance(){
        if(null!=account){
            account = new Account(amount,interest);
        }
        return account;
    }

    public static void setAmount(double amount) {
        Account.amount = amount;
    }

    public static void setInterest(double interest) {
        Account.interest = interest;
    }

    public static void setAccount(Account account) {
        Account.account = account;
    }

    public static double getAmount() {
        return amount;
    }

    public static double getInterest() {
        return interest;
    }

    public static Account getAccount() {
        return account;
    }
}
