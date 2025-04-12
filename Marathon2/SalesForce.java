package Marathon2;

import java.time.Duration;

//import org.apache.poi.sl.usermodel.Shadow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev186929.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("2AqjN!lC2!Vy");
		driver.findElement(By.id("sysverb_login")).click();
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(20);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		WebElement element = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(element);
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13']")).click();
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		driver.findElement(By.xpath("//input[@id='IO:43d5c38a9707011021983d1e6253af8a']")).sendKeys("95");
		WebElement drop = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select S = new Select(drop);
		S.selectByVisibleText("Unlimited [add £3.13]");
		driver.findElement(By.xpath("//label[text()='Pink']")).click();
		driver.findElement(By.xpath("//label[text()='256 GB [add £78.26]']")).click();
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		String placed = driver.findElement(By.xpath("//span[text()='Thank you, your request has been submitted']")).getText();
		String reqid = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		
		System.out.println(placed );
		System.out.println(reqid);
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
