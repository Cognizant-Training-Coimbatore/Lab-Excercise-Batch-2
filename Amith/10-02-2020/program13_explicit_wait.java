import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class program13_explicit_wait {

	public static void main(String[] args) 
	{
		System.getProperty("webdriver.chrome.driver", "\"C:\\\\Users\\\\Admin\\\\Desktop\\\\java_programs\\\\selenium examples\\\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver, 20);
		driver.get("http://demowebshop.tricentis.com");
		WebElement log= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log1 in")));
		log.click();
		driver.close();
	}

}
