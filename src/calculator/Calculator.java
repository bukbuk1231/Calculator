package calculator;

import java.util.Scanner;

public class Calculator {

    private int n1, n2, op;
    private Scanner scanner;

    private static final char[] ops = {'+', '-', '*', '/', '%'};

    public Calculator() {
        scanner = new Scanner(System.in);
        n1 = n2 = 0;
    }

    public double inputNumber(String input) {
        System.out.print("Input your number: ");
        return Double.valueOf(input);
        // return scanner.nextDouble();
    }
}
