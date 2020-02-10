import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q9 {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("abcd");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Alert alert =driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(3000);
		driver.quit();

	}

}
