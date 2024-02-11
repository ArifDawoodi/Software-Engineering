package Arif;

public class GooglePayPayment implements PaymentStrategy {
     @Override
     public void pay(int amount) {
     System.out.println("Paying " + amount + " using Google Pay");
     }
    }
    