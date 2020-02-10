import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2_q1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		if(driver.getTitle().equalsIgnoreCase("Demo Web Shop"))
		System.out.println("Title verified");
		driver.findElement(By.linkText("Register")).click();
		if(driver.getTitle().equalsIgnoreCase("Demo Web Shop. Register"))
		System.out.println("Link Register verified");
		List<WebElement> radio1=driver.findElements(By.name("Gender"));
		radio1.get(0).click();
		driver.findElement(By.id("FirstName")).sendKeys("Roshna");
		driver.findElement(By.id("LastName")).sendKeys("Akku");
		driver.findElement(By.id("Email")).sendKeys("mnbvcxz@yahoo.com");
		driver.findElement(By.id("Password")).sendKeys("pass123$");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("pass123$");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}

