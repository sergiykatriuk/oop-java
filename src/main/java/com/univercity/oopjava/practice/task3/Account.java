package com.univercity.oopjava.practice.task3;

public class Account {

    private static final float interestRate = 3.5f;

    private static double totalAmount = 0.0d;

    private final String number;

    private float balance;

    public Account(String number, float balance) {
        this.number = number;
        addToBalance(balance);
    }

    public void add(float sum) {
        addToBalance(sum);
    }

    public void substract(float sum) {
        addToBalance(sum * -1);
    }

    public void caclulateInterest() {
        float sum = (balance / 100) * interestRate;
        addToBalance(sum);
    }

    public float getBalance() {
        return balance;
    }

    private void addToBalance(float sum) {
        balance += sum;
        totalAmount += sum;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String printBalance() {
        return String.format("Account %s balance = %s", number, balance);
    }
}
