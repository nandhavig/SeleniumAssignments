package Week4Day2;

import java.util.HashSet;
import java.util.Set;

public class SetAssignment {

	public static void main(String[] args) {
		 String companyName = "google";
		 char[] name = companyName.toCharArray();
		 Set<Character> Unique = new HashSet<Character>();
		 Set<Character> duplicate = new HashSet<Character>();
		 for (int i = 0; i < name.length; i++) {
			
			 boolean a = Unique.add(name[i]);
			 if(!a) {
				 duplicate.add(name[i]);
				 
			 }
		 }
			 
			 System.out.println("Unique characteres = "+Unique);
			 System.out.println("duplicate characters = "+duplicate);
			 
			
		
		 
		 
		 

	}

}
