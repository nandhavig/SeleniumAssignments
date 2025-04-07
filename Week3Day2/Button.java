package Week3Day2;

public class Button extends WebElement {
	
	public static void main(String[] args) {
		
		Button B = new Button();
		B.setText("Nandha");
		B.click();
		B.Submmit();
	}
	

	public void Submmit(){
		
		System.out.println("submitted");
		
	}

}
