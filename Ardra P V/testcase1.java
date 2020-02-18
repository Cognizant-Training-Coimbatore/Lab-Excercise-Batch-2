package blaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {
	public static void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("http://demowebshop.tricentis.com/");
	       homepage home=new homepage(driver);
	       home.clickLogin();
	       login_page login=new login_page(driver);
	       login.enterUsername("ardra");
	       login.enterUsername("pass");
	       Thread.sleep(5000);
	       driver.quit();
	       
		
	}

}
