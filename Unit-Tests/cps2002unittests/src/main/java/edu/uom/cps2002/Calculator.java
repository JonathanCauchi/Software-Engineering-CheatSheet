package edu.uom.cps2002;

public class Calculator {

    public int add(int a, int b) {
        return a+b;
    }

    public int subtract(int a, int b) {
        return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public int divide(int a, int b) {

        if (b == 0) {
            return -999;
        }

        return a/b;
    }

}