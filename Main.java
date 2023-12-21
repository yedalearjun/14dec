class BankAcct {
    private String accountHolder;
    private double balance;
    private double interestRate;


    public BankAcct(String accountHolder, double balance, double interestRate) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.interestRate = interestRate;
    }


    class Interest {
        void calculateInterest() {

            double interestAmount = balance * interestRate / 100;


            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Balance: $" + balance);
            System.out.println("Interest Rate: " + interestRate + "%");
            System.out.println("Interest Amount: $" + interestAmount);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        BankAcct myAccount = new BankAcct("John Doe", 1000.0, 5.0);


        BankAcct.Interest interestCalculator = myAccount.new Interest();


        interestCalculator.calculateInterest();
    }
}