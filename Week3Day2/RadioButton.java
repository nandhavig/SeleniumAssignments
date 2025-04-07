package Week3Day2;

public class RadioButton extends Button {
	
	public static void main(String[] args) {
		
		RadioButton rb =  new RadioButton();
		rb.setText("NV");
		rb.selectRadioButton();
		rb.click();
		
	}
	
	public void selectRadioButton() {
		System.out.println("radio button selected");
	}

}
