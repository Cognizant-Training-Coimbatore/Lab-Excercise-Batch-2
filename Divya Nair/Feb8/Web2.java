import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Web2 {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		System.out.println(driver.getTitle());
		Select database=new Select(driver.findElement(By.name("category_id")));
		database.selectByVisibleText("Databases");
		Thread.sleep(3000);
		WebElement search=driver.findElement(By.name("DoSearch"));
		search.click();
		Thread.sleep(1000);
		driver.quit();

	}

}
