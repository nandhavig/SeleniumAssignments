package Week3Day1;

import java.util.Scanner;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		System.out.println("Enter string to change = ");
		try (Scanner s = new Scanner(System.in)) {
			String s1 = s.next();
			s1 = s1.toLowerCase();
			char[] s2 = s1.toCharArray();
			for (int i = 0; i < s2.length; i++) {
				 
				if (i%2==1) {
					
					char s3 = Character.toUpperCase(s2[i]);
					System.out.println(s3);
					
				}
				else {
					System.out.println(s2[i]);
				}
				 
				
			}
		}
		
	
		
		
		
	}

}
