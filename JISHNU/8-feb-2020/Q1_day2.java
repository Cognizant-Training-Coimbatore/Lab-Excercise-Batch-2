import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1_day2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Register")).click();
		System.out.println(driver.getTitle());
		List<WebElement> radio1=driver.findElements(By.name("Gender"));
		radio1.get(0).click();
		driver.findElement(By.id("Email")).sendKeys("jishnudevadas6@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("FirstName")).sendKeys("jishnu");
		driver.findElement(By.id("LastName")).sendKeys("devadas");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("pass123$");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("pass123$");
		Thread.sleep(1000);
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
