import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEST2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.com.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
