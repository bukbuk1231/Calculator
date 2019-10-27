package calculator;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Calculator {

    private double n1, n2;
    private char op;
    private Scanner scanner;

    private static final char[] ops = {'+', '-', '*', '/', '%'};

    public Calculator() {
        scanner = new Scanner(System.in);
        n1 = n2 = 0;
    }

    public double calculate(double n1, double n2, char op) {
        switch (op) {
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case '*':
                return n1 * n2;
            case '/':
                return n1 / n2;
            case '%':
                return n1 % n2;
        }
        return 0;
    }

    public double inputNumber() {
        System.out.print("Input your number: ");
        return scanner.nextDouble();
    }

    public char chooseOperator() {
        System.out.print("1. +\n2. -\n3. *\n4. /\n5. %\nChoose the operator: ");
        int op = scanner.nextInt();
        if (op < 1 || op > 5)
            throw new NoSuchElementException("Please input a valid operator index between 1 ~ 5");
        return ops[op - 1];
    }
}
