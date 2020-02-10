import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4_get_attribute {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\java\\Selenium Examples\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:\\Shaheen/app.html");
		driver.findElement(By.id("txt1")).sendKeys("shaheen");
		Thread.sleep(2000);
		String s = driver.findElement(By.id("txt1")).getAttribute("value");
		System.out.println(s.length());
		driver.quit();

	}

}
