package Week3Day1;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int a[] = {1,3,5,4,7,66};
		Arrays.sort(a);
		
		for (int i = 0; i < a.length; i++) {
			
			int b = i+1;
			
			if(b!=a[i]) {
				System.out.println(b);
				break;
				
			}
			
		}
		
		

	}

}
