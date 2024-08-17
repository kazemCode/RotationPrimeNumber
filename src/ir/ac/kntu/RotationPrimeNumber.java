package ir.ac.kntu;

import java.util.Scanner;

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
		while(number != rotatedNumber) {
			if (!isPrimeNumber(number)) {
				return false;
			}
			rotatedNumber = rotateNumber(number);
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
	
}