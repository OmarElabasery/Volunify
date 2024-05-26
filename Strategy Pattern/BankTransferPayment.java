package StrategyClasses;

public class BankTransferPayment implements PaymentStrategy {

	private String bankAccount;
    private String accountHolderName;

    public BankTransferPayment(String bankAccount, String accountHolderName) {
        this.bankAccount = bankAccount;
        this.accountHolderName = accountHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Bank Transfer.");
    }

}
