import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Strickland
 */
public class Main {
    
    final static int constant = 703;
    final static double lowEnd = 18.5;
    final static double highEnd = 25;

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double weight, height, bmi = 0;
            System.out.print("Enter your weight in pounds: ");
            weight = getInput(scan);
            System.out.print("Enter your height in inches: ");
            height = getInput(scan);
            bmi = weight / (height * height) * constant;
            System.out.println("Your BMI is " + bmi + ".");
            if (bmi > highEnd) {
                System.out.println("You are overweight. You should see a doctor.");
            } else if (bmi < lowEnd) {
                System.out.println("You are underweight. You should see a doctor.");
            } else {
                System.out.println("You are within the ideal weight range.");
            }
        }
    }

    /**
     * Gets a double value from the user and ensures that the
     * user enters a valid number
     * @param scan input scanner
     * @return user-entered value.
     */
    public static double getInput(Scanner scan) {
        double returnValue = 0;
        try {
            returnValue = Double.valueOf(scan.nextLine().trim());
        } catch (Exception e) {
            System.out.print("Please enter a valid number: ");
            return getInput(scan);
        }
        return returnValue;
    }
}
