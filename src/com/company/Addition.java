package com.company;
// Defining addition class which extends operation interface and implements addition logic
public class Addition implements Operation {
    @Override
    public double calculateResult(double left, double right) {
        return left + right;
    }
}
