package com.training.thread;

public class BankTest {
    public static void main(String... args){
        BankAccount b = new BankAccount(1234);
        new Withdrawer(b);
        new Depositor(b);
    }
}
