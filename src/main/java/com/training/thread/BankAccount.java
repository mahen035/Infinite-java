package com.training.thread;

public class BankAccount {

    private long accountNumber;
    private double balance;

    double wAmount;
    BankAccount(long accountNumber){
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    synchronized void withdraw(double amount){
        wAmount = amount;
        if(amount > balance){
            try {
                System.out.println("Insufficient balance::");
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        balance = balance - amount;
        System.out.println("Withdrawn:: "+amount);
    }

    synchronized void deposit(double amount){
        balance = balance + amount;
        System.out.println("Deposited:: "+amount);
        if(wAmount > balance) {
            deposit(amount);
        }
        else{
            notify();
        }
    }

}
