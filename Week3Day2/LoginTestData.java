package Week3Day2;

public class LoginTestData extends TestData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginTestData lt = new LoginTestData();
		lt.enterCredentials();
		lt.navigateToHomePage();
		lt.enterPassword();

	}
	
	public void enterUsername() {
		
		System.out.println("Enter username");
	
	}
	public void enterPassword () {
		
		System.out.println("enter password");
		
	}



}
