import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		System.out.println("Page title :"+driver.getTitle());
		Select combo1 = new Select(driver.findElement(By.name("category_id")));
		System.out.println(combo1.getOptions().size());
		Thread.sleep(5000);
		driver.quit();
	}

}
