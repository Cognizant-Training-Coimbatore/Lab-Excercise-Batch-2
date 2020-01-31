import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program_7_selecting_multiple_values {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		Select product=new Select(driver.findElement(By.name("category_id")));
		int size=pro
		product.selectByVisibleText("Databases");
		
		
		System.out.println(total);
		Thread.sleep(5000);
		driver.quit();
	}

}
