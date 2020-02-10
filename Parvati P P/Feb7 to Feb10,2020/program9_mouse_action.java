import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class program9_mouse_action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wedriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
WebElement computers=driver.findElement(By.linkText("COMPUTERS"));
Actions actions=new Actions(driver);
actions.moveToElement(computers).build().perform();
Thread.sleep(5000);
driver.findElement(By.linkText("Notebook")).click();
Thread.sleep(5000);
driver.quit();
	}

}
