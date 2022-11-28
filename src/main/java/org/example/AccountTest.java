package org.example;
import java.util.Scanner;
public class AccountTest {

    public static void main(String args[]){

       // SavingAccount sa1 = new SavingAccount(1000);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Type");
        String accountType = sc.next();
        Account account = AccountFactory.getAccount(accountType); // Account account = new SavingAccount();

        System.out.println("Enter 1:Deposit 2:Withdraw");
        int choice = sc.nextInt();
        System.out.println("Enter Amount");
        double amt = sc.nextDouble();
        if(choice == 1){
            account.deposit(amt);
        }
        else if(choice == 2){
            account.withdraw(amt);
        }
        //account.deposit(500);

       // System.out.println("Account Balance is: "+ sa1.balance);

        System.out.println(account.getDetails());
    }
}

/*
Enter Account Type
    saving
Enter 1: Deposit 2: Withdraw
    1
Enter Amount
    200
Display the Account details
 */
