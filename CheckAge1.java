package exhandl;

import java.util.Scanner;

 class InvalidAgeException extends Exception {
	public InvalidAgeException (String message) {
		super(message);
	}
}

public class CheckAge1 {

public static void divideNumber(int a,int b) throws ArithmeticException {
	if (b==0) {
		throw new ArithmeticException("Division by zero is not allowed");
	}
	System.out.println("Result:" + (a/b));
}


public static void validateAge(int age) throws InvalidAgeException {
	if (age < 18) {
		throw new InvalidAgeException("Age Below 18; Access Denied");
	}
	System.out.println("Age Above 18; Access Granted");
}

public static void main (String args[]) {
	Scanner sc = new Scanner(System.in);
	 
	try {
		System.out.print("Enter age:");
		int age = sc.nextInt();
		validateAge(age);
	 
		System.out.print("Enter a and b:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		divideNumber(a,b);
		
	} catch (InvalidAgeException e) {
		System.out.print("Custom exception caught:" + e.getMessage());
		
	} catch (ArithmeticException e) {
		System.out.println("predefined exception caught:" + e.getMessage());
		
	} finally {
		sc.close();
		System.out.println("Program Executed");
		
	}
}
	}
