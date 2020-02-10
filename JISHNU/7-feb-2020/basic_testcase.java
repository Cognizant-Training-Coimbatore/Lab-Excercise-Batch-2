package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_testcase {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//Open the url "https://www.selenium.dev/"
		driver.get("http://selenium.dev/");
		System.out.println("Page Title"+driver.getTitle());
		System.out.println("Page Title Length"+driver.getTitle().length());

		//Wait 5 Seconds
		Thread.sleep(5000);
		//Close the browser
		driver.quit();
	
	}

}
