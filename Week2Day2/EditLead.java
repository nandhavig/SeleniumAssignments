package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Vicky");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("IT");
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("its a good company");
		driver.findElement(By.xpath("(//input[@name='primaryEmail'])[4]")).sendKeys("nandha76@gmail.com");
		Select sel = new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']")));
		sel.selectByVisibleText("Indiana");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).clear();
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("its a good company");
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}
