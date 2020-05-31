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
                setAccountNumber(menuInput.nextInt());

                System.out.println("Enter your pin: ");
                setPinNumber(menuInput.nextInt());

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
}
