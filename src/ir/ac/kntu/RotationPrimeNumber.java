package ir.ac.kntu;

import java.util.Scanner;
import java.lang.Math;

public class RotationPrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		
		if(isRotationPrimeNumber(number)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	private static boolean isRotationPrimeNumber(int number) {
		int rotatedNumber = -1;
		int newNumber = number;
		while(number != rotatedNumber) {
			if (!isPrimeNumber(newNumber)) {
				return false;
			}
			rotatedNumber = rotateNumber(newNumber);
			newNumber = rotatedNumber;
		}
		return true;
	}
	
	private static boolean isPrimeNumber(int number) {
		int counter = 2;
		if(number < counter) {
			return false;
		} else {
			while(counter*counter <= number) {
				if(number % counter == 0) {
					return false;
				}
				counter++;
			}
			return true;
		}
	}
	
	private static int rotateNumber(int number) {
		int rotatedNumber = (number % 10) * (int)Math.pow(10, numberOfDigits(number) - 1);
		int newNumber = number / 10;
		rotatedNumber += newNumber;
		
		return rotatedNumber;
	}
	
}