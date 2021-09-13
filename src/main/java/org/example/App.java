/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Ben Phung
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        // Prompt user
        System.out.print( "How many euros are you exchanging? " );
        String Euros = scan.nextLine();

        System.out.print( "What is the exchange rate? " );
        String ExchangeRate = scan.nextLine();

        // Convert string to double for decimals
        double dEuros = Double.parseDouble(Euros);
        double dExchangeRate = Double.parseDouble(ExchangeRate);

        // Calculation
        double Dollars = dEuros * dExchangeRate;

        // Output using formatting to round up at 2 decimal places
        System.out.println(Euros + " euros at an exchange rate of " +dExchangeRate+ " is " + String.format("%.2f", Dollars) + " U.S. dollars.");

    }
}
