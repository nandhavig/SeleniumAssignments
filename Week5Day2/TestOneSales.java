package Week5Day2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestOneSales  extends ProjectSpecificMethod {
	@Test

	public  void runtestone (){
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Nanhda S");
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String legalName = driver.findElement(By.xpath("//slot[@name='outputField']/lightning-formatted-text")).getText();
		System.out.println(legalName);
	}

}
