import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.trricents.com");
		homepage home=new homepage(driver);
		home.clicklogin();
		loginpage login=new loginpage(driver);
		login.enterusername("venkat");
		login.enterPassword("venkat123$");
		Thread.sleep(5000);
		driver.quit();

	}

}
