package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		System.out.println("tittile is " + driver.getTitle());
		boolean text = driver.findElement(By.xpath("//span[text()='Dashboard']")).isEnabled();
		System.out.println("verified = " + text);
		driver.navigate().back();
		boolean text2 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")).isEnabled();
		System.out.println("enabled = " + text2 );
		System.out.println("Location of the submit is = " + driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation());
		System.out.println( driver.findElement(By.xpath("(//span[text()='Save'])[1]")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize());
		driver.close();
		
		
	}

}
