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

    public void run() {
        System.out.println("Please input the 1st number");
        n1 = inputNumber();
        System.out.println("Please input the 2nd number");
        n2 = inputNumber();
        System.out.println();
        op = chooseOperator();
        double result = calculate(n1, n2, op);
        System.out.println();
        System.out.println("Your result is: " + result);
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
                if (n2 == 0)
                    throw new ArithmeticException("Division by 0");
                return n1 / n2;
            case '%':
                if (n2 == 0)
                    throw new ArithmeticException("Modulus by 0");
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
