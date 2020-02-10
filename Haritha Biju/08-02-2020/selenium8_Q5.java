package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium8_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		driver.findElement(By.name("user_login")).sendKeys("Rithwiknm");
		driver.findElement(By.name("user_password")).sendKeys("chelsea123");
		driver.findElement(By.name("first_name")).sendKeys("Rithwik");
		driver.findElement(By.name("last_name")).sendKeys("nm");
		driver.findElement(By.name("email")).sendKeys("rithwiknm@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("ibfidxj");
		driver.findElement(By.name("address2")).sendKeys("ibfidxj");
		driver.findElement(By.name("address3")).sendKeys("ibfidxj");
		driver.findElement(By.name("city")).sendKeys("ekm");
		Select state = new Select(driver.findElement(By.name("vdf")));
		driver.findElement(By.name("zip")).sendKeys("682301");
	}

}
