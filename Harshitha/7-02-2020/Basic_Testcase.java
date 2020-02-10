package basic_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Testcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programs\\Selenium_Examples\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//Open the url "https://www.selenium.dev/"
		driver.get("http://selenium.dev/");
		System.out.println("Page Title:"+driver.getTitle());
		System.out.println("Page Title Length:"+driver.getTitle().length());
		//Wait 5 seconds
		Thread.sleep(5000);
		//Close the browser
		driver.quit();
	}

}
