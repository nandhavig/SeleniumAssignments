package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//*[@id=\"label\"]/a")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.id("accountName")).sendKeys("TESTACCOUNT12");
		driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("20");
		WebElement drop1 = driver.findElement(By.xpath("(//select[@class='inputBox'])[2]"));
		Select sel = new Select(drop1);
		sel.selectByValue("IND_HARDWARE");
		WebElement drop2 = driver.findElement(By.xpath("(//select[@class='inputBox'])[3]"));
		Select sel1 = new Select(drop2);
		sel1.selectByVisibleText("S-Corporation");
		WebElement drop3 = driver.findElement(By.xpath("(//select[@class='inputBox'])[4]"));
		Select sel2 = new Select(drop3);
		sel2.selectByValue("LEAD_EMPLOYEE");
		WebElement drop4 = driver.findElement(By.xpath("(//select[@class='inputBox'])[5]"));
		Select sel3 = new Select(drop4);
		sel3.selectByIndex(6);
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println(driver.getTitle());
		

	}

}
