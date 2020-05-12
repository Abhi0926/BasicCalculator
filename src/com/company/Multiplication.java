package com.company;
// Defining Multiplication class which extends operation interface and implements addition Multiplication
public class Multiplication implements Operation {
    @Override
    public double calculateResult(double left, double right) {
        return left * right;
    }
}

