package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount accnt = new BankAccount();
        BankAccount accnt1 = new BankAccount(1234, 31.22, "Erick Q", "eq@mail.com", "(313)324-1341");
        accnt.setAccountNumber(12345);
        accnt.setBalance(413.12);
        accnt.setCustomerName("Erick Quintanilla");
        accnt.setEmail("eq@email.com");
        accnt.setPhoneNumber("(310)123-4567");

        System.out.println("Customer Name   : " + accnt.getCustomerName());
        System.out.println("Customer Email  : " + accnt.getEmail());
        System.out.println("Customer Number : " + accnt.getPhoneNumber());
        System.out.println("Account Number  : " + accnt.getAccountNumber());
        System.out.println("Account Balance : " + accnt.getBalance());

        accnt.depositFunds(13.37);
        System.out.println("Account Balance : " + accnt.getBalance());
        accnt.withdrawFunds(23131.23);
        accnt.withdrawFunds(100.64);
        System.out.println("Account Balance : " + accnt.getBalance());
    }
}
