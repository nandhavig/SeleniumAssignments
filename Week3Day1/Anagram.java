package Week3Day1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		System.out.println("Enter first strings ");
		try (Scanner s = new Scanner(System.in)) {
			String s1 = s.next();
			System.out.println("Enter second strings ");
			String s2 = s.next();
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
			if(s1.length() == s2.length()) {
				
				char[] s3 = s1.toCharArray();
				char[] s4 = s2.toCharArray();
				Arrays.sort(s3);
				Arrays.sort(s4);
				boolean equal = Arrays.equals(s3, s4);
				if (equal) {
					System.out.println("the given words are anagram ");
				}
				else {
					System.out.println("the words are not anagram");
				}
				
				
				
			}
			else {
				System.out.println("the given words are not anagram");
			}
		}

}
}
