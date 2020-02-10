import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3_enter_into_text {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\java\\Selenium Examples\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:\\Shaheen/app.html");
		//WebElement link1 = driver.findElement(By.linkText("Google"));
		//link1.click();
		driver.findElement(By.id("txt1")).sendKeys("shaheen");
		//System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();

	}

}
