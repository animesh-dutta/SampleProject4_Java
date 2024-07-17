package com.animeshdutta;
import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		
		int x,y;
		Scanner input=new Scanner(System.in);
		System.out.println("Number1 :");
		x=input.nextInt();
		System.out.println("Number2 :");
		y=input.nextInt();
		
		Scanner Calculate= new Scanner(System.in);
		System.out.println("Calculator::Enter + for Addition;Enter - for Subtraction;Enter * for Multiplication;Enter / for Division");
		String Calculation =Calculate.next();
		
		if(Calculation.equals("+")) {
			System.out.println("Calculator:Addition::" +(x+y));
			
		}
		else if(Calculation.equals("-")) {
			System.out.println("Calculator:Subtraction::" +(x-y));
			
		}
		else if(Calculation.equals("*")) {
			System.out.println("Calculator:Multiplication::" +(x*y));
			
		}
		else if(Calculation.equals("/")) {
			System.out.println("Calculator:Division::" +(x/y));
			
		}
		else {
			System.out.println("Invaild Input");
		}
	}

}
