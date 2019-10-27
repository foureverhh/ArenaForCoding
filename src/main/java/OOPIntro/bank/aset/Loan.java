package OOPIntro.bank.aset;

public class Loan {
    private static double amount;
    private static double interest;
    private static Loan loan = null;

    private Loan(double amount,double interest){
        Loan.amount = amount;
        Loan.interest = interest;
    }

    public static Loan getInstance(){
        if(null!=loan){
            loan = new Loan(amount,interest);
        }
        return loan;
    }

    public static void setAmount(double amount) {
        Loan.amount = amount;
    }

    public static void setInterest(double interest) {
        Loan.interest = interest;
    }

    public static void setLoan(Loan loan) {
        Loan.loan = loan;
    }

    public static double getAmount() {
        return amount;
    }

    public static double getInterest() {
        return interest;
    }

    public static Loan getLoan() {
        return loan;
    }
}
