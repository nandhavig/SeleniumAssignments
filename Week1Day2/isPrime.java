package Week1Day2;

import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in)) {
			int num1 = num.nextInt();
			boolean flag = false;
			
			 if (num1==0 || num1==1) {
				 
				 flag = true;
				}
			 
			 for (int i = 2; i <= num1/2 ; i++) {
				 if (num1%i == 0) {
					 flag = true;
					 break;
					}
			 }
if (!flag) 
				
			System.out.println("the given number is prime number");
				
else 
			System.out.println("the given mnumber is not prime number");
		}
			

	}
	}
