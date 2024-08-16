package ir.ac.kntu;

import java.util.Scanner;

public class RotationPrimeNumber {
	public class void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		
		if(isRotationPrime(number)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	private static boolean isRotationPrime(int number) {
		int rotatedNumber = -1;
		while(number != rotatedNumber) {
			if (!isPrime(number)) {
				return false;
			}
			rotatedNumber = rotateNumber(number);
		}
		return true;
	}
}