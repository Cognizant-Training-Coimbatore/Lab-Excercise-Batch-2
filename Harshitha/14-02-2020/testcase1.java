import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		homepage home=new homepage(driver);
		home.clickLogin();
		loginPage login=new loginPage(driver);
		login.enterUsername("harsha");
		login.enterPassword("harsha123$");
		driver.quit();
	}

}
