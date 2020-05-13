package org.wecancodeit;

import java.util.Scanner;

public class FortuneTellerApp {

    public static void main(String[] args) {
        System.out.println("Hello, welcome to  We Can Code IT's Fortune Teller Application!");
        Scanner input = new Scanner(System.in);
        String firstName = getFirstName(input);
        System.out.println("Your first name is " + firstName);

        String lastName = getLastName(input);
        System.out.println("Your last name is " + lastName);

        int userAge = getAge(input);
        System.out.println("Your age is " + userAge);

        int userBirthMonth = getBirthMonth(input);
        System.out.println("You birth month is " + userBirthMonth);
        input.nextLine();

        String favoriteColor = getFavoriteColor(input);
        System.out.println("Your favorite color is " + favoriteColor);

        int siblingCount = getSiblingCount(input);
        System.out.println("You have " + siblingCount + " siblings.");

        int yearsToRetirement = getRetirement(userAge);
        String vacationHomeLocation = getVacationHome(siblingCount);
        String modeOfTransportation = getModeOfTransportation(favoriteColor);
        double bankBalance = getBankBalance(userBirthMonth);
        System.out.println(firstName + " " + lastName + " will retire in " + yearsToRetirement + " years,\n" +
                "with " + bankBalance + " in the bank,\n" +
                "a vacation home in " + vacationHomeLocation + ",\n" +
                "and travel by " + modeOfTransportation + ".");
    }

    public static String getFirstName(Scanner input) {
        System.out.println("What is your first name:");
        return input.nextLine();
    }

    public static String getLastName(Scanner input) {
        System.out.println("What is your last name:");
        return input.nextLine();
    }

    public static int getAge(Scanner input) {
        System.out.println("What is your age:");
        return input.nextInt();
    }

    public static int getBirthMonth(Scanner input) {
        System.out.println("What is your birth month:");
        int birthMonth = input.nextInt();
        while ((birthMonth < 1) || (12 < birthMonth)){
            System.out.println("Birth month number bust be between 1 and 12");
            birthMonth = input.nextInt();
        }
        return birthMonth;
    }

    public static String getFavoriteColor(Scanner input) {
        System.out.println("What is your favorite ROYGBIV color, type HELP if you don't know the colors:");
        String favoriteColor = input.nextLine();
        while (favoriteColor.equalsIgnoreCase("help")) {
            System.out.println("ROYGBIV stands for Red Orange Yellow Green Blue Indigo and Violet");
            favoriteColor = input.nextLine();
        }
        return favoriteColor;
    }

    public static int getSiblingCount(Scanner input) {
        System.out.println("How many siblings do you have:");
        return input.nextInt();
    }

    public static int getRetirement(int userAge) {
        int yearsToRetirement;
        if (userAge % 2 == 0) {
            yearsToRetirement = 12;
        } else {
            yearsToRetirement = 14;
        }
        return yearsToRetirement;
    }

    public static String getVacationHome(int siblingCount) {
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
        return vacationHomeLocation;
    }

    public static String getModeOfTransportation(String favoriteColor) {
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
        return modeOfTransportation;
    }

    public static double getBankBalance(int userBirthMonth) {
        double bankBalance = 0.0;
        if (userBirthMonth > 0 && userBirthMonth <= 4) {
            bankBalance = 256000.76;
        } else if (userBirthMonth > 4 && userBirthMonth <= 8) {
            bankBalance = 3687105.42;
        } else if (userBirthMonth > 8 && userBirthMonth <= 12) {
            bankBalance = 45.65;
        }
        return bankBalance;
    }
}
