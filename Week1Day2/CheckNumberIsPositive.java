package Week1Day2;

import java.util.Scanner;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in)) {
			int a = num.nextInt();
			if (a>=0) {
				
				System.out.println(a + " is positive number");
				
			}
			else {
				System.out.println(a + " is negative number");
			}
		}

	}

}
