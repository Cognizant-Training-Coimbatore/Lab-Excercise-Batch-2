import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2_clicka_link {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\java\\Selenium Examples\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:\\Shaheen/app.html");
		WebElement link1 = driver.findElement(By.linkText("Google"));
		link1.click();
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
