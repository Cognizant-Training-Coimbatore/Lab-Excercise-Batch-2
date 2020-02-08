package seleniumeg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_testcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium_example\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		//open the url "https://www.selenium.dev/"
		driver.get("http://selenium.dev/");
		System.out.println("page title : " +driver.getTitle());
		System.out.println("Page title length : " +driver.getTitle().length());
		//Wait 5seconds
		Thread.sleep(5000);
		//Close the browser.
        driver.quit();


	}

}
