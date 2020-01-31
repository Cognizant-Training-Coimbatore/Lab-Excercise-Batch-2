import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BROWSER_4_PROGRAM_GIVEN {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		String s=driver.getTitle();
		System.out.println(s);
		WebElement enter=driver.findElement(By.linkText("Enter the Store"));
		enter.click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
