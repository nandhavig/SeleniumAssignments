package Week5Day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();
		
		WebElement Mouseover = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(Mouseover);
		action.build().perform();
		
		WebElement Mouseover1 = driver.findElement(By.xpath("(//a[text()='Rice & Rice Products'])[1]"));
		action.moveToElement(Mouseover1);
		action.build().perform();
		driver.findElement(By.xpath("(//a[text()='Boiled & Steam Rice'])[1]")).click();
		
		WebElement royal = driver.findElement(By.xpath("//input[@id='i-BBRoyal']"));
		action.scrollToElement(royal).perform();
		royal.click();
		Thread.sleep(3000);
		
		WebElement scrool = driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']"));
		Actions SD = new Actions(driver);
		SD.scrollToElement(scrool).perform();
		scrool.click();
		
		Set<String> windows = driver.getWindowHandles();
		List<String> listWindows = new ArrayList<String>(windows);
		driver.switchTo().window(listWindows.get(1));
		Thread.sleep(3000);
	
		WebElement ele5KG = driver.findElement(By.xpath("//span[text()='5 kg']"));	
		action.scrollToElement(ele5KG);		
		action.build().perform();
		ele5KG.click();
		
		String price = driver.findElement(By.xpath("//td[@class='Description___StyledTd-sc-82a36a-4 fLZywG']")).getText();
		System.out.println(price);
		driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();
		Thread.sleep(3000);
		
		File scouce = driver.getScreenshotAs(OutputType.FILE);
		File desti = new File("./snaps/img3.png");
		FileHandler.copy(scouce, desti);
		driver.quit();
		
	}
}
