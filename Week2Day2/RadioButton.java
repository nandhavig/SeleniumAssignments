package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[9]")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		boolean text1 = driver.findElement(By.xpath("//label[text()='Chennai']")).isSelected();
		System.out.println("selected = " + text1);
		boolean text2 = driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isEnabled();
		System.out.println("browser enabled = " + text2);
		boolean text3 = driver.findElement(By.xpath("(//label[text()='21-40 Years']")).isSelected();
		if(!text3) {
			
			driver.findElement(By.xpath("(//label[text()='21-40 Years']")).click();
		}

	}

}
