package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//*[@id=\"label\"]/a")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("(//input[@class=' x-form-text x-form-field'])[30]")).sendKeys("9585361141");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text1 = driver.findElement(By.xpath("//a[text()='10433']")).getText();
		System.out.println("the first lead id is = " +text1);
		driver.findElement(By.xpath("//a[text()='10433']")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text1);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		boolean text2 = driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();
		//System.out.println(text2);
		if(text2) {
			System.out.println("record doesnt found");
		}
		else {
			System.out.println("record found");
		}
		

	}

}