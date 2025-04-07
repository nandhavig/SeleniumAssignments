package Marathon1st;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class pvrcinima {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='INOX Vishaal De Mal,Madurai Madurai']")).click();
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		driver.findElement(By.xpath("(//span[text()='THE DOOR'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='11:50 AM']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.id("CL.CLUB|D:17")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		String text1 = driver.findElement(By.id("CL.CLUB|D:17")).getText();
		System.out.println("seat number "+text1);
		String text2 = driver.findElement(By.xpath("(//span[text()='221.27'])[2]")).getText();
		System.out.println("grand total"+ text2);
		driver.findElement(By.xpath("(//button[text()='Proceed'])[1]")).click();
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		String text3 = driver.getTitle();
		System.out.println("tittle of the page "+ text3);
		driver.close();
				
		
	}

}
