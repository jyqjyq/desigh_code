package com.jyq.strategy.demo;

public class Client {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // 使用信用卡支付
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "John Doe");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100);

        // 使用 PayPal 支付
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com", "password");
        cart.setPaymentStrategy(payPalPayment);
        cart.checkout(200);
    }
}
