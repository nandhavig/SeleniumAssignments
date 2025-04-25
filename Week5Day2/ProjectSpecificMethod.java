package Week5Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	
	public ChromeDriver driver;
	@BeforeMethod
	
	public void preCondition() throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Sales@123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		
		Actions action = new Actions(driver);
		WebElement legalEle = driver.findElement(By.xpath("//p[text() = 'Legal Entities']"));
		action.scrollToElement(legalEle);
		action.build().perform();
		legalEle.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='New']")).click();
	

		
		
		
	}
	
	@AfterMethod
	public void postCondition() {
		
		driver.quit();
		
	}
	

	
	

}
