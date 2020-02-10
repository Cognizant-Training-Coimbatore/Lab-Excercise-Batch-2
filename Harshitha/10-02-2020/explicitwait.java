import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,20);
				driver.get("http:\\demowebshop.tricentis.com");
			WebElement loginlink;
				loginlink=(WebElement) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Log in")));
		loginlink.click();
		driver.close();
		
	}

}
