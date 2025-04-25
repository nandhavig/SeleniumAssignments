package Week5Day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.interactions.Actions;

public class AmazonAction {

	public static void main(String[] args) throws IOException, InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 13", Keys.ENTER);
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[3]")).getText();
		System.out.println("Price = "+ price);

		String review = driver.findElement(By.xpath("(//span[@class = 'a-size-base s-underline-text'])[1]")).getText();
		System.out.println("Customer rating = "+review);
		
		driver.findElement(By.xpath("(//img[@class = 's-image'])[1]")).click();
		Set<String> cwindow = driver.getWindowHandles();
		List<String> phone = new ArrayList<String>(cwindow);
		driver.switchTo().window(phone.get(1));
		
		WebElement image = driver.findElement(By.xpath("//img[@id='landingImage']"));
		File soruce = image.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/img.png");
		FileHandler.copy(soruce, dest);
		
		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
		
		String text11 = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println("The Cart Subtotal is: " + text11);
		String substring = text11.substring(1).replace(".00", "");
		System.out.println(substring);
		if(price.equals(substring)) {
			System.out.println("The Mobile price and Cart Price is same");
		} else {
			System.out.println("The Mobile Price and Cart Price is Different. Please have a check");
		}

		driver.quit();
		
		
		
		

	}

}
