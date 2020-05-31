package org.example;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
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

            }
        }
    }
}
