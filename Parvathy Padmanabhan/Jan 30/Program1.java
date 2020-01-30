import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
		// Launch Browser
		System.setProperty("webdriver.chroome.driver", "chromedriver.exe");//specify which browser should be used.
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		String s = driver.getTitle();
		System.out.println(s);
		driver.quit();
	
	}
	

}
