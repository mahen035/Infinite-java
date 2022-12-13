package com.training.thread;

public class Withdrawer implements Runnable{

    BankAccount bank;

    Withdrawer(BankAccount bank){
        this.bank = bank;
        Thread t = new Thread(this, "withdrawer");
        t.start();
    }
    @Override
    public void run() {
            bank.withdraw(2000);
    }
}
