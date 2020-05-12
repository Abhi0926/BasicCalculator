package com.company;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private char operation;
    private double operand1;
    private double operand2;
    // using a hasmpap variable to store key-value pair pertinent to basic calculation symbols and the operation
    private Map<Character, Operation> operationMap = new HashMap<>();


    // constructor
    public Calculator(double operand1, double operand2, char operation) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;

        operationMap.put('+', new Addition());
        operationMap.put('-', new Subtraction());
        operationMap.put('*', new Multiplication());
        operationMap.put('/', new Division());
    }

    public double makeCalculation() {
        Operation operationMapValue = null;
        //check if the operationMap variable of calculator class pertains to defined symbol-operation pair
        if (operationMap.containsKey(operation)) {
            //get value from the operationMap and creates object of relevant operation class
            operationMapValue = operationMap.get(operation);
            System.out.println(operationMap.get(operation));
        } else {
            System.out.println("Invalid sign");
        }
        // Method Overriding - Runtime polymorphism
        return operationMapValue.calculateResult(operand1, operand2);
    }
}