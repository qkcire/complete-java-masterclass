package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        BankAccount accnt = new BankAccount();
//        BankAccount accnt1 = new BankAccount(1234, 31.22, "Erick Q", "eq@mail.com", "(313)324-1341");
//        BankAccount accnt2 = new BankAccount("John T", "jo@mail.com", "(311)231-5151");
//        accnt.setAccountNumber(12345);
//        accnt.setBalance(413.12);
//        accnt.setCustomerName("Erick Quintanilla");
//        accnt.setEmail("eq@email.com");
//        accnt.setPhoneNumber("(310)123-4567");
//
//        System.out.println("Customer Name   : " + accnt.getCustomerName());
//        System.out.println("Customer Email  : " + accnt.getEmail());
//        System.out.println("Customer Number : " + accnt.getPhoneNumber());
//        System.out.println("Account Number  : " + accnt.getAccountNumber());
//        System.out.println("Account Balance : " + accnt.getBalance());
//
//        accnt.depositFunds(13.37);
//        System.out.println("Account Balance : " + accnt.getBalance());
//        accnt.withdrawFunds(23131.23);
//        accnt.withdrawFunds(100.64);
//        System.out.println("Account Balance : " + accnt.getBalance());
        VipCustomer cust1 = new VipCustomer();
        System.out.println(cust1.getName());

        VipCustomer cust2 = new VipCustomer("john", 320.12);
        System.out.println(cust2.getName());

        VipCustomer cust3 = new VipCustomer("tim", 4541.23, "john@mail.com");
        System.out.println(cust3.getName());
    }
}
