package com.training.thread;

public class Depositor implements Runnable{

    BankAccount bank;

    Depositor(BankAccount bank){
        this.bank = bank;
        Thread t = new Thread(this, "depositor");
        t.start();
    }

    @Override
    public void run() {
        bank.deposit(1500);
    }
}
