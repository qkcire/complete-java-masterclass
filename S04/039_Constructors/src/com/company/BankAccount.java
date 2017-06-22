package com.company;

/**
 * Created by eq on 6/21/17.
 */
public class BankAccount {
    //fields
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //constructors
    public BankAccount() {
        this(000, 00.00, "John Doe", "jdoe@mail.com", "(123)456-7890");
        System.out.println("Empty constructor called.");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //getters
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    //additional methods
    public void depositFunds(double funds) {
        this.balance += funds;
        System.out.println("Funds deposited. New balance: " + this.balance);
    }

    public void withdrawFunds(double funds) {
        if (this.balance - funds <= 0D) {
            System.out.println("Unable to withdraw funds. Insufficient balance.");
            return;
        }
        this.balance -= funds;
        System.out.println("Funds withdrawn. New balance: " + this.balance);
    }
}
