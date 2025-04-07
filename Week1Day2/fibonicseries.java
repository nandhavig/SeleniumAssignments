package Week1Day2;

import java.util.Scanner;

public class fibonicseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the range = ");
		try (Scanner num = new Scanner(System.in)) {
			int n = num.nextInt();
			int firstnum = 0, secondnum = 1;
			
			for (int i = 1; i <=n; i++) {
				
				 int num2 = firstnum + secondnum;
				 firstnum = secondnum;
				 secondnum = num2;
				 System.out.println(num2);
				 				 
			}
		}

	}

}
