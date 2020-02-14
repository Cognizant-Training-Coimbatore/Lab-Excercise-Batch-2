package feb14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		homepage home=new homepage(driver);
		home.clicklogin();
		Thread.sleep(3000);
		loginpage login=new loginpage(driver);
		login.enterUsername("venkit");
		login.enterPassword("1234S3");
		

	}

}
