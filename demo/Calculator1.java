package demo;

import java.util.Scanner;

public class Calculator1 {
    float a;
    float b;

    static float result;

    public Calculator1(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public static float add(float a, float b) {
        result = a + b;
        return result;
    }

    public static float sub(float a, float b) {
        result = a - b;
        return result;
    }

    public static float mult(float a, float b) {
        result = a * b;
        return result;
    }

    public static float div(float a, float b) {
        if (b == 0) {
            System.out.println("Can't divide by zero");
            return 0;
        } else {
            result = a / b;
            return result;
        }
    }

    public static void displayResult() {
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        float a = sc.nextFloat();

        System.out.println("Enter Second Number:");
        float b = sc.nextFloat();

        System.out.println("Choose Operation:\n" + //
                        "1. Addition\n" + //
                        "2. Subtraction\n" + //
                        "3. Multiplication\n" + //
                        "4. Division");
        int operator = sc.nextInt();

        

        switch (operator) {
            case 1:
                add(a, b);
                break;

            case 2:
                sub(a, b);
                break;

            case 3:
                mult(a, b);
                break;

            case 4:
                div(a, b);
                break;

            default:
                System.out.println("Invalid Operator Entered");
                sc.close();
                return;
        }

        displayResult();
        sc.close();
    }
}

        