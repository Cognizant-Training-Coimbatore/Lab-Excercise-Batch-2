import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program1_capturing_the_title {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/ctsapp.html");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		driver.quit();
		
	}

}
