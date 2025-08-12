package org.example;

import org.example.Account;

public class Bank {
    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.displayAccountDetails();

        // The following line would cause a compile-time error if uncommented
        // System.out.println(myAccount.balance);
    }
}
