package com.company;

//Import Scanner library
import java.util.Scanner;
import java.util.InputMismatchException;

//Class with Main method()
public class BasicCalculator {
    // Java's scanner to capture user inputs
    // private - access modifier so that it can only be changed by classes which are extending it
    //static variable is being used as scanner inputs are supposed to be owned by the class rather than object of this class
    private static Scanner scanner = new Scanner(System.in);
    // main function
    public static void main(String[] args) {
        System.out.println("Write two numbers and +, -, * or / sign");
        char operator = 0;
        double firstNum = 0;
        double secondNum = 0;
        // try catch statements to handle exceptions during runtime because of user input
        try {
            firstNum = scanner.nextDouble();
            secondNum = scanner.nextDouble();
            operator = scanner.next().charAt(0);
        } catch (InputMismatchException ime) {
            System.out.println("invalid input");
        } finally {
            if (operator != '+' & operator != '-' & operator != '*' & operator != '/') {
                throw new InputMismatchException();
            }
            //create a calculator object for calculation
            Calculator calculator = new Calculator(firstNum, secondNum, operator);
            // call makeCalculation method on the objects which internally maps to relevant method call
            System.out.println(calculator.makeCalculation());
        }
    }
}

