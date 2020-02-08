import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_2_click_aLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Sonitha/seleniumnew/seleniumcts.html");
		WebElement link1 = driver.findElement(By.linkText("Google"));
		link1.click();
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
