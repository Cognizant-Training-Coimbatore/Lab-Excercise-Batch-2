import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class question1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement enterthestore = driver.findElement(By.linkText("Enter the Store"));
		enterthestore.click();
		Thread.sleep(5000);
		String s = driver.getTitle();
		System.out.println(s);
		driver.quit();
	}

}
