/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carolina Duarte
 *
 */

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //String scanner, allows for lower & uppercase.
        System.out.print("""
                Press C to convert from Fahrenheit to Celsius.\r
                Press F to convert from Celsius to Fahrenheit. \r
                Your choice:\s""");
        String option = input.nextLine();

        if(option.equals("C") || option.equals("c")) {
            double Fahrenheit;
            double Celsius;
            Scanner scan = new Scanner(System.in); //Double scanner.
            System.out.print("Please enter the temperature in Fahrenheit: ");
            Fahrenheit = scan.nextDouble();
            Celsius = (Fahrenheit-32)*5/9;
            System.out.println("Celsius temperature is = "+Celsius);
        }
        else if (option.equals("F") || option.equals("f")) {
            double Fahrenheit;
            double Celsius;
            Scanner scan = new Scanner(System.in); //Double scanner.
            System.out.print("Please enter the temperature in Celsius: ");
            Celsius = scan.nextDouble();
            Fahrenheit = ((9*Celsius)/5)+32;
            System.out.println("Fahrenheit temperature is = "+Fahrenheit);
        }

    }
    }
