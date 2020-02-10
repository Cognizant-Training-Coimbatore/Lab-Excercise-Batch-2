package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2Exercise5 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver.exe", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		
		driver.findElement(By.name("user_login")).sendKeys("loginBoi");
		driver.findElement(By.name("user_password")).sendKeys("loginBoi");
		driver.findElement(By.name("first_name")).sendKeys("loginBoi");
		driver.findElement(By.name("last_name")).sendKeys("loginBoi");
		driver.findElement(By.name("email")).sendKeys("loginBoi@mail.com");
		
		Select country = new Select(driver.findElement(By.name("country_id")));
		country.selectByVisibleText("India");
		Select sex = new Select(driver.findElement(By.name("gender_id")));
		sex.selectByVisibleText("Male");
		driver.findElement(By.name("Insert"
				)).click();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
