package com.canddella.utility;

import java.util.Scanner;

public class MultiplesOfFive {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		boolean numberCheck = numberCheck(number);
		if (numberCheck)
		{
			System.out.println("The given number is a multiple of 5");
		}
		else
		{
			System.out.println("Not a multiple of 5");
		}

	}

	private static boolean numberCheck(int number) {
		
		return number%5==0;
	}

}
