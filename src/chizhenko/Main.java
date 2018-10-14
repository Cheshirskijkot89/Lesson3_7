package chizhenko;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer number;
		Integer length;
		String str;
		int[] numbers;
		int halfMasLength;
		int firstSum;
		int secondSum;
		
		firstSum = 0;
		secondSum = 0;
		
		System.out.println("Enter the number");
		
		number = sc.nextInt();
		
		sc.close();
		
		str = Integer.toString(number);
		length = str.length();
		
		numbers = new int[length];
		
		if (length % 2 == 0) {
			
			for (int x = 0; x < length; x++) {
				numbers[x] = (int) (number /	Math.pow(10, length - (x+1)));
				number = number - (numbers[x] * (int) Math.pow(10, length - (x+1)));
			}
			
			halfMasLength = numbers.length / 2;
			
			for (int x = 0; x < halfMasLength; x++) {
				firstSum = firstSum + numbers[x];
				secondSum = secondSum + numbers[x + halfMasLength];
			}
			
			if (firstSum == secondSum) {
				System.out.println("the ticket is a happy one");
			} else {
				System.out.println("the ticket is not a happy one");
			};
			
		} else {
			System.out.println("the ticket is not a happy one");
		};
	}

}
