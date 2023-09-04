package com.chat;

public class Division implements Operation {
    @Override
    public double getResult(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
}
