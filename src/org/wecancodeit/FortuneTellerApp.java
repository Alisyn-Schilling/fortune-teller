package org.wecancodeit;

import java.util.Scanner;

public class FortuneTellerApp {

    /*
     * Part 1
    Ask the user for the user’s first name.
    Ask the user for the user’s last name.
    Ask the user for the user’s age.
    Ask the user for the user’s birth month (as an 'int').
    Ask the user for the user’s favorite ROYGBIV color.
        If the user does not know what ROYGBIV is, ask the user to enter “Help” to get a list of the ROYGBIV colors.
    Ask the user for the user's number of siblings.
     */
    public static void main(String[] args) {
        System.out.println("Hello, welcome to  We Can Code IT's Fortune Teller Application!");
        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name:");
        String firstName = input.nextLine();
        System.out.println("Your first name is " + firstName);

        System.out.println("What is your last name:");
        String lastName = input.nextLine();
        System.out.println("Your last name is " + lastName);

        System.out.println("What is your age:");
        int userAge = input.nextInt();
        System.out.println("Your age is " + userAge);

        System.out.println("What is your birth month:");
        int userBirthMonth = input.nextInt();
        input.nextLine();
        System.out.println("You birth month is " + userBirthMonth);

        System.out.println("What is your favorite ROYGBIV color, type HELP if you don't know the colors:");
        String favoriteColor = input.nextLine();
        while (favoriteColor.equalsIgnoreCase("help")) {
            System.out.println("ROYGBIV stands for Red Orange Yellow Green Blue Indigo and Violet");
            favoriteColor = input.nextLine();
        }
        System.out.println("Your favorite color is " + favoriteColor);

        System.out.println("How many siblings do you have:");
        int siblingCount = input.nextInt();
        System.out.println("You have " + siblingCount + " siblings.");

        //The user's number of years until retirement will be based on whether the user's age is odd or even.
        int yearsToRetirement;
        if (userAge % 2 == 0) {
            yearsToRetirement = 12;
        } else {
            yearsToRetirement = 14;
        }

        //System.out.println("Years To Retirement: " + yearsToRetirement);

        //The location of the user's vacation home will be based on how many siblings the user has.
        // If the user enters a number less than zero, give the user a bad location!
        String vacationHomeLocation = "Chernobyl, Ukraine";
        if (siblingCount == 0) {
            vacationHomeLocation = "Boca Raton, FL";
        } else if (siblingCount == 1) {
            vacationHomeLocation = "Nassau, Bahamas";
        } else if (siblingCount == 2) {
            vacationHomeLocation = "Ponta Negra, Brazil";
        } else if (siblingCount == 3) {
            vacationHomeLocation = "Portland, Oregon";
        } else if (siblingCount > 3) {
            vacationHomeLocation = "Baton Rouge, LA";
        }
        //System.out.println("Your Vacation Home is in " + vacationHomeLocation);

        String modeOfTransportation;
        switch (favoriteColor.toLowerCase()) {
            case "red":
                modeOfTransportation = "Maserati";
                break;
            case "orange":
                modeOfTransportation = "seven chihuahuas pulling a chariot.";
                break;
            case "yellow":
                modeOfTransportation = " school bus";
                break;
            case "green":
                modeOfTransportation = "Tesla";
                break;
            case "blue":
                modeOfTransportation = "Yugo";
                break;
            case "indigo":
                modeOfTransportation = "Honda Civic";
                break;
            case "violet":
                modeOfTransportation = "Mini Cooper";
                break;
            default:
                modeOfTransportation = "taxi cab";

        }
        //System.out.println("Your mode of transportation will be a " + modeOfTransportation);

        double bankBalance = 0.0;
        if (userBirthMonth > 0 && userBirthMonth <= 4){
            bankBalance = 256000.76;
        } else if (userBirthMonth > 4&& userBirthMonth <=8 ){
            bankBalance = 3687105.42;
        } else if (userBirthMonth > 8 && userBirthMonth <=12){
            bankBalance = 45.65;
        }
        //System.out.println("You have $" + bankBalance + " in the bank.");

        System.out.println(firstName+ " " + lastName + " will retire in " + yearsToRetirement + "\n" +
                "with " + bankBalance + " in the bank,\n" +
                "a vacation home in " + vacationHomeLocation + ",\n" +
                "and travel by " + modeOfTransportation + ".");
    }
}
