/* Tatacliq Testcase:
   ==================
1. Load the Uri as https://www.tatacliq.com/
2. Search 'watch for women'
3. print the result 
4. Select sortby: New Arrivals
5. choose women from categories filter.
6. print all price of watches
7. print the Uri address
8. close the window
*/


package Marathon2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tatacliq {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.id("wzrk-cancel")).click();
		driver.findElement(By.id("search-text-input")).sendKeys("Watche for women", Keys.ENTER);
		String text = driver.findElement(By.xpath("//div[@class='Plp__plpHeading']")).getText();
		System.out.println("Result for the search =  " + text);
		WebElement sort = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select sort1 = new Select(sort);
		sort1.selectByVisibleText("New Arrivals");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='CheckBox__base'])[1]")).click();
		List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='ProductDescription__discount ProductDescription__priceHolder']"));
		List<String> list2 = new ArrayList<String>();
		for (WebElement each : list1) {
			
			 String text2 = each.getText();
			 list2.add(text2);
				
		}
		
		System.out.println("price list = " + list2);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
			
		

	}

}
