package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2Exercise4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver.exe", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://examples.codecharge.com/Store/Default.php");
		
		System.out.println("Title: " + driver.getTitle());	
		Select product = new Select(driver.findElement(By.name("category_id")));
		product.selectByVisibleText("Databases");
		
		driver.findElement(By.name("DoSearch")).click();		
		driver.findElement(By.linkText("Web Database Development")).click();
		String count = driver.findElement(By.name("quantity")).getAttribute("value");
		System.out.println(count);
		Thread.sleep(5000);
		driver.quit();

	}

}
