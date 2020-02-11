package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_test_case {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Java programs\\selenium exampls\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//open the url "https://www.selenium.dev/"
		driver.get("http://selenium.dev/");
		System.out.println("Page Title: " +driver.getTitle());
		System.out.println("Page Title Length: " +driver.getTitle().length());
		//wait 5 seconds
		Thread.sleep(5000);
		//Close the browser
		driver.quit();
		
	}
	
	

}
