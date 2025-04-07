package Week3Day2;

public class TextField extends WebElement {
	
	
	public static void main(String[] args) {
		
		
		TextField t1 = new TextField();
		t1.setText("Vignesh");
		t1.click();
		t1.GetText();
		
	}
	
	public void GetText() {
		
		System.out.println("GetText");
		
	}


}
