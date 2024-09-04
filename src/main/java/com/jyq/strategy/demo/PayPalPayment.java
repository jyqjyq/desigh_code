package com.jyq.strategy.demo;

/**
 * 具体策略类 paypal
 * @author jyq
 * @date 2024/09/04
 */
public class PayPalPayment implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}
