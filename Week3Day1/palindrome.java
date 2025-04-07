package Week3Day1;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
			
			System.out.println("Enter word to check palindrome or not = ");
			try (Scanner num = new Scanner(System.in)) {
				int num1 = num.nextInt();
				int num2 = num1;
				int revrse= 0;
				
				while (num1 !=0) {
					
					int digit = num1 %10;
					revrse = revrse*10 + digit;
					num1 /= 10;
					
				}
				
				if (num2 == revrse) {
					
					System.out.println("the given number is palindrome");
					
				}
				else {
					System.out.println("the given number is not a palindrome ");
				}
			}

			
			
			

		}

}


