package com.company;
// Defining Subtraction class which extends operation interface and it's implementation
public class Subtraction implements Operation{
    @Override
    public double calculateResult(double left, double right) {
        return left - right;
    }
}

