package BasicCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_testcase {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java prgms\\selenium_Examples\\chromedriver.exe");//going to control the web
		//  Launch the chrome browser 
		WebDriver driver = new ChromeDriver();
		
		//  Open the url "https://www.selenium.dev/"
		driver.get("https://selenium.dev/");
		System.out.println("Page Title :"+ driver.getTitle());
		System.out.println("Page Title Length: "+ driver.getTitle().length());
		//  Wait 5 Seconds
		Thread.sleep(5000);
		//  Close the Browser
		driver.quit();
		

	}

}


