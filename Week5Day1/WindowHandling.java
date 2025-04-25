package Week5Day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.edge.EdgeDriver;


public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {	
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//*[@id=\"label\"]/a")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> cwindow = driver.getWindowHandles();
		List<String> cW = new ArrayList<String>(cwindow);
		driver.switchTo().window(cW.get(1));
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		
		driver.switchTo().window(cW.get(0));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> cwindow1 = driver.getWindowHandles();
		List<String> cW1= new ArrayList<String>(cwindow1);
		driver.switchTo().window(cW1.get(1));
		driver.findElement(By.xpath("(//a[@class='linktext'])[13]")).click();
		driver.switchTo().window(cW1.get(0));
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		System.out.println( driver.getTitle());

	}

}
