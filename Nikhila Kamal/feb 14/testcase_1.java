package feb_14_pgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase_1 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		homepage_pom home=new homepage_pom(driver);
		home.clickLogin();
		loginpage login=new loginpage(driver);
		login.enterUsername("nikhila");
		login.enterPassword("nikhila123");
		driver.quit();
		

	}

}
