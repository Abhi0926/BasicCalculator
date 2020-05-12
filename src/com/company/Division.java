package com.company;
// Defining Division class which extends operation interface and it's implementation
public class Division implements Operation {
    @Override
    public double calculateResult(double left, double right) {
        return left / right;
    }
}