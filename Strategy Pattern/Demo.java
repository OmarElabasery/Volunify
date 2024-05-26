package StrategyClasses;

public class Demo {
	public static void main(String[] args) {
        DonationService service = new DonationService();

        // Pay using Credit Card
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe", "123", "12/25");
        service.setPaymentStrategy(creditCardPayment);
        service.executePayment(100.0);

        // Pay using PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com", "password123");
        service.setPaymentStrategy(payPalPayment);
        service.executePayment(200.0);

        // Pay using Bank Transfer
        PaymentStrategy bankTransferPayment = new BankTransferPayment("9876543210", "John Doe");
        service.setPaymentStrategy(bankTransferPayment);
        service.executePayment(300.0);
    }
}
