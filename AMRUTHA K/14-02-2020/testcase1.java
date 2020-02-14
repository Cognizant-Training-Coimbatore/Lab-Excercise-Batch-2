package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\amrutha\\java\\seleniumfile\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("http://demowebshop.tricentis.com");
	pom home=new pom(driver);
	home.clickLogin();
	Thread.sleep(2000);
	loginpage login=new loginpage(driver);
	login.enterusername("ammu");
	login.enterpassword("pass123");
	Thread.sleep(2000);
	driver.quit();
	
	}

}
