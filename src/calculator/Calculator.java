package calculator;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Calculator {

    private int n1, n2, op;
    private Scanner scanner;

    private static final char[] ops = {'+', '-', '*', '/', '%'};

    public Calculator() {
        scanner = new Scanner(System.in);
        n1 = n2 = 0;
    }

    public double inputNumber() {
        System.out.print("Input your number: ");
        return scanner.nextDouble();
    }

    public char chooseOperator(String input) {
        System.out.print("1. +\n2. -\n3. *\n4. /\n5. %\nChoose the operator: ");
        // int op = scanner.nextInt();
        int op = Integer.valueOf(input);
        if (op < 1 || op > 5)
            throw new NoSuchElementException("Please input a valid operator index between 1 ~ 5");
        return ops[op - 1];
    }
}
