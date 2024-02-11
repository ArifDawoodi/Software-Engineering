import Arif.CreditCardPayment;
import Arif.GooglePayPayment;
import Arif.PayPalPayment;
import Arif.PaymentContext;
import Arif.PaymentStrategy;

public class PaymentApp {
    public static void main(String[] args) {
        PaymentStrategy creditCard = new CreditCardPayment();
        PaymentStrategy payPal = new PayPalPayment();
        PaymentStrategy googlePay = new GooglePayPayment();
       
        PaymentContext paymentContext = new PaymentContext(creditCard);
       
        paymentContext.pay(20);
        paymentContext.setPaymentStrategy(payPal);
        paymentContext.pay(50);
        paymentContext.setPaymentStrategy(googlePay);
        paymentContext.pay(80);
        }
}
