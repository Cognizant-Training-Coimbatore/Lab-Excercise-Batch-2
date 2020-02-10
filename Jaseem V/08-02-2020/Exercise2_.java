import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise2_ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		System.out.println("Page title :"+driver.getTitle());
		Select combo1 = new Select(driver.findElement(By.name("category_id")));
		combo1.selectByVisibleText("Databases");
		WebElement search = driver.findElement(By.name("DoSearch"));
		search.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
