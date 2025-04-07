package Week2Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/logout");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//*[@id=\"label\"]/a")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nandha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vignesh S");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("NVS");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("DATA");
		driver.findElement(By.xpath("(//input[@name='primaryPhoneNumber'])[4]")).sendKeys("9585361141");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println("titile of the page is " + driver.getTitle());
		
		

	}

}
