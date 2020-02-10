import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class enter_text {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/chrome.html");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("txt1")).sendKeys("Divya123");
		Thread.sleep(30000);
		driver.quit();

	}

}
