package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium8_Q2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		System.out.println(driver.getTitle());
		Select combo1 = new Select(driver.findElement(By.name("category_id")));
		Thread.sleep(2000);
		combo1.selectByVisibleText("Databases");
		driver.findElement(By.name("DoSearch")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
