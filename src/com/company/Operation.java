package com.company;

// Declaring a java interface - an absolute abstract class with calculate result method
// which would further be overridden by implementation based on relevant calls
public interface Operation {
    double calculateResult(double left, double right);
}
