package Week3Day2;

public class Abstarction implements DataBaseConnection {

	public static void main(String[] args) {
		
		Abstarction s1 = new Abstarction();
		s1.Connect();
		s1.Disconnect();
		s1.executeUpdate();
		

	}

	public void Connect() {
		// TODO Auto-generated method stub
		System.out.println("connected");
		
	}

	public void Disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnected");
		
	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("exectued and updated");
		
	}

}
