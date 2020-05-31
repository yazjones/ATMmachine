package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;


public class account {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'£'###,##0.00");

    //getters and setters for my functions

    private int accountNumber;
    private int pinNumber;
    private double checkBalance = 0;
    private double savingBalance = 0;


    //set account number
    public int setAccountNumber (int accountNumber){
        this.accountNumber = accountNumber;
        return accountNumber;
    }

    //get account number
    public int getAccountNumber() {
        return accountNumber;
    }

    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
    }
    public int getPinNumber() {
        return pinNumber;
    }

    // Checking account balance
    public double getCheckBalance (){
        return checkBalance;
    }
    public double getSavingBalance () {
        return savingBalance;
    }
    //check account withdrawal
    public double calculatingWithdrawal (double amount){
        checkBalance = (checkBalance - amount);
        return checkBalance;
    }
    private double calculatingSavingBalance (double amount) {
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }
    private double calculatingCheckDeposit (double amount) {
        checkBalance = (checkBalance + amount);
        return checkBalance;
    }
    private double calculatingSavingDeposit(double amount){
          savingBalance = (savingBalance - amount);
          return savingBalance;
    }

    // customer withdrawing money and checking balance function

    public void getAccountWithdrawBalanceInput () {
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkBalance));
        System.out.println("How much do you want to withdraw from your current account? : ");
        double amount = input.nextDouble();

        if ((checkBalance - amount) >= 0) {
            calculatingWithdrawal(amount);
            System.out.println("New account balance:" + moneyFormat.format(checkBalance));
        } else {
            System.out.println("Sorry account balance cannot be negative." + "\n");
        }
    }

    public void getSavingWithdrawBalanceInput () {
        System.out.println("Saving account balance: " + moneyFormat.format(checkBalance));
        System.out.println("How much do you want to withdraw from your current account? : ");
        double amount = input.nextDouble();

        if ((savingBalance - amount) >= 0) {
            calculatingSavingBalance(amount);
            System.out.println("New savings account balance: " + moneyFormat.format(checkBalance));
        } else {
            System.out.println("Sorry balance cannot be negative" + "\n");
        }
    }

    public void getAccountDepositInput () {
        System.out.println("Current Account Balance:" + moneyFormat.format(checkBalance));
        System.out.println("How much do you want to deposit into your current account: ");
        double amount = input.nextDouble();

        if ((checkBalance + amount) >= 0) {
            calculatingCheckDeposit(amount);
            System.out.println("New current account balance: " + moneyFormat.format(checkBalance));
        } else {
            System.out.println("Balance cannot be negative" + "\n");
        }
    }
          public void getSavingDepositInput () {
              System.out.println("Current Account Balance:" + moneyFormat.format(checkBalance));
              System.out.println("How much do you want to deposit into your savings account: ");
              double amount = input.nextDouble();

              if ((savingBalance + amount) > = 0) {
                  calculatingSavingBalance(amount);
                  System.out.println("New saving account balance" + moneyFormat.format(checkBalance));
              }else{
                  System.out.println("sorry, balance cannot be negative" + "\n");
              }

              }





}

