package org.example;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class onlineMenu extends account{
    Scanner atmMenu = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'£'###,##0.00");


    HashMap <Integer,Integer> data = new HashMap<Integer, Integer>();

    // Customers pin and account number validation

    public void getLogin() throws IOException{
        int x = 1;

        do {
            try {

                data.put(12345, 4321);
                data.put(29876, 7890);
                data.put(85475, 4444);
                data.put(34866, 2356);

                System.out.println("Welcome to Yasmin's Online banking");
                System.out.println("Enter your account number: ");
                setAccountNumber(onlineMenu.nextInt());

                System.out.println("Enter your pin: ");
                setPinNumber();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("\n" + "Invalid character(s), please only enter numbers" + "\n");
                x = 2;
            }
            for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
                if (entry.getKey() == getAccountNumber() && entry.getValue() == getPinNumber()) ;
                getAccountType();
            }
            System.out.println("Wrong account or pin number");
        } while (x ==1);
    }

    private static int nextInt() {
        return 0;
    }

    public void getAccountType() {
        System.out.println("Please select the service you want to access: ");
        System.out.println("1 - Current Account");
        System.out.println("2 - Savings Account");
        System.out.println(" 3 - Exit");


        //double check



        switch (selection) {
            case 1:
                getAccount();
                break;

            case 2:
                getSavings();
                break;

            case 3:
                System.out.println("Thank you for using Yasmin's ATM, goodbye");
                break;

        }

    }

        public void getAccount() {
            System.out.println("Current Account, please insert the following number related to your chosen service");
            System.out.println("1 - View Balance");
            System.out.println("2 - Withdraw Funds");
            System.out.println("3 - Deposit Funds");
            System.out.println("4 - Exit");



            switch (selection) {
                case 1:
                    System.out.println("Account Balance: " + moneyFormat.format(getCheckBalance()));
                    getAccountType();
                    break;

                case 2:
                    getAccountWithdrawBalanceInput();
                    break;

                case 3:
                    getAccountDepositInput();
                    getAccountType();
                    break;

                case 4:
                    System.out.println("Thank you for using Yasmin's ATM");

            }
        }

        public void getSavings() {
            System.out.println("Savings Account, please insert the following number related to your chosen service ");
            System.out.println("1 - View Balance");
            System.out.println("2- Withdraw Funds");
            System.out.println("3- Deposit Funds");
            System.out.println("4 - exit ");



            switch (selection) {
                case 1:
                    System.out.println("Savings Account Balance " + moneyFormat.format(getSavingBalance()));
                    getAccountType();
                    break;

                case 2:
                    getSavingWithdrawBalanceInput();
                    getAccountType();
                    break;

                case 3:
                  getSavingDepositInput();
                  getAccountType();
                    break;
                case 4:
                    System.out.println("Thank you for using Yasmin's ATM");
                    break;

            }





        }  int selection;
    }


