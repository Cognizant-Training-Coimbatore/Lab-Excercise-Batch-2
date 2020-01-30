import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) {
		// Click on link
		System.setProperty("webdriver.chroome.driver", "chromedriver.exe");//specify which browser should be used.
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();
		String s = driver.getTitle();
		System.out.println(s);
		driver.quit();		

	}

}
