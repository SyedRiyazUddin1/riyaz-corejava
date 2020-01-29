//program to enter
package com.javapractice.corejava.threads.Threadsynchronization;

//can take input from user via Scanner class

import java.util.Scanner;

// this class represents as shared resource
class Account {

    private int bal;

    // by creating constructor below, we can set the balance
    public Account(int bal) {
        this.bal = bal;
        // if we create an object of Account class, above constructor will be called.
    }

    public boolean isSufficientBalance(int w) {
        if (bal >= w)
            return (true);
        else
            return (false);
    }

    // the below function updates the balance
    public void withdraw(int amt) {
        bal = bal - amt;
        System.out.println("Withdrawl money is: " + amt);
        System.out.println("Your current balance is:" + bal);
    }
}

class Customer implements Runnable {
    private String name;
    private Account account;

    // creating constructor below
    public Customer(Account account, String name) {
        this.account = account;
        this.name = name;
    }

    // with the help of above constructor, we can assign the account to any customer
    public void run() {
        Scanner kb = new Scanner(System.in);

        // syntax of synchronized block below
        // synchronized (objectidentifier)
        // access shared variables other resources
        synchronized (account) {
            System.out.println(name + " Enter amount to withdraw");
            int amt = kb.nextInt();

            if (account.isSufficientBalance(amt)) {
                System.out.println(name);
                account.withdraw(amt);
            } else
                System.out.println("Insufficient Balance");
        }

    }
}

public class ThreadSync {
    public static void main(String[] args) {
        Account a1 = new Account(1000);
        Customer c1 = new Customer(a1, "Riyaz"), c2 = new Customer(a1, "Rahul");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}
