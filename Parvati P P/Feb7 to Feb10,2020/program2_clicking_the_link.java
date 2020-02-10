import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program2_clicking_the_link {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/ctsapp.html");
		WebElement link1=driver.findElement(By.linkText("Google"));
		link1.click();
		Thread.sleep(5000);

		driver.quit();
	}

}
