package Week5Day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://finance.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//span[text()='Markets']")).click();
		driver.findElement(By.xpath("//span[text()='Crypto']")).click();
		List<WebElement> names = driver.findElements(By.xpath("//div[@class=' yf-362rys']"));
		List<String> list1 = new ArrayList<String>();
		for (WebElement each : names) {
			
			String text1 = each.getText();
			//System.out.println("crypto names = " + text1);
			list1.add(text1);	
			
			
		}
		System.out.println(list1);
		

	}

}
