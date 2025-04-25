package Week5Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestTwoSales extends ProjectSpecificMethod {
	@Test

	public  void runtesttwo() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//textarea[@part='textarea'])[2]")).sendKeys("SalesForce");
		WebElement statusEle = driver.findElement(By.xpath("//label[text()='Status']/following::button"));
		Actions action = new Actions(driver);
		action.scrollToElement(statusEle);
		action.build().perform();
		Thread.sleep(3000);
		driver.executeScript("arguments[0].click()", statusEle);
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Active']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String alertMsg = driver.findElement(By.xpath("//ul[contains(@class,'errorsList')]/li/a")).getText();
		System.out.println("Missing mandatory field: " + alertMsg);

	}

}
