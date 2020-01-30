import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locator3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();// TODO Auto-generated method stub
		driver.get("http://examples.codecharge.com/store/Default.php");
		Select product=new Select(driver.findElement(By.name("category_id")));
		product.selectByVisibleText("Databases");
		Thread.sleep(5000);
		driver.quit();
	}

}
