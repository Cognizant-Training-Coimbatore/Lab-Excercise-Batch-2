package batch2Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3_program2_keyboard_action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wedriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[1]/td[2]/input")).sendKeys("Admin");
driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[1]/td[2]/input")).sendKeys(Keys.CONTROL,"a");
driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[1]/td[2]/input")).sendKeys(Keys.CONTROL,"c");	
driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[2]/td[2]/input")).sendKeys(Keys.CONTROL,"v");
	Thread.sleep(5000);
	driver.quit();

	}

}
