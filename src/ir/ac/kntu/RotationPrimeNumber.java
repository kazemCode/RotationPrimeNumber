package ir.ac.kntu;

import java.util.Scanner;

public class RotationPrimeNumber {
	public class void main(String[] args) {
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
		}
		
		while(counter*counter > number) {
			if(counter == number) {
				return true;
			}
			if(number % counter) {
				return false;
			}
			counter++;
		}
	}
}