import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class capturingthetitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Sonitha/seleniumnew/seleniumcts.html");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
