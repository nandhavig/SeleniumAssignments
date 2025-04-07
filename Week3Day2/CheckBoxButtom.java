package Week3Day2;

public class CheckBoxButtom extends Button {
	
	public static void main(String[] args) {
		
		CheckBoxButtom ch1 = new CheckBoxButtom();
		ch1.setText("Vicky");
		ch1.click();
		ch1.Submmit();
		
	}
	
	public void clickCheckButton() {
		
		System.out.println("click the button");
	}

}
